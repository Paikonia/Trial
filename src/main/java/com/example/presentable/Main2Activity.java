package com.example.presentable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.presentable.Account.schoolaccount;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import static android.widget.Toast.*;

public class Main2Activity extends AppCompatActivity {
    private static String FILE_NAME = "Saved account";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Button btn = findViewById(R.id.signup);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save();

                try {
                    ObjectInputStream is = new ObjectInputStream(new FileInputStream(FILE_NAME));
                    schoolaccount brought = (schoolaccount) is.readObject();
                    TextView text = findViewById(R.id.tast);
                    text.setText(brought.getClas().toString());
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }

            }
        });


    }

    public void save(){
        schoolaccount account;
        EditText firstName = (EditText) findViewById(R.id.firstname);
        EditText lastName = (EditText) findViewById(R.id.lastname);
        EditText email = (EditText) findViewById(R.id.email);
        EditText school = (EditText) findViewById(R.id.school);
        EditText dateOfBirth = (EditText) findViewById(R.id.date);
        EditText Class = (EditText) findViewById(R.id.cass);
        EditText phone = (EditText) findViewById(R.id.Phone);
        Spinner genger = (Spinner) findViewById(R.id.gender);


        String firstame = firstName.getText().toString();
        Editable firstname = (Editable) new SpannableStringBuilder(firstame);
        String secondname = lastName.getText().toString();
        Editable secondnam = new SpannableStringBuilder(secondname);
        String emai = email.getText().toString();
        Editable Emai = new SpannableStringBuilder(emai);
        String School = school.getText().toString();
        Editable schoo = new SpannableStringBuilder(School);
        String dateofbirth = dateOfBirth.getText().toString();
        Editable Datea = new SpannableStringBuilder(dateofbirth);
        String Clas = Class.getText().toString();
        Editable clas = new SpannableStringBuilder(Clas);
        String Phone = phone.getText().toString();
        Editable phon = new SpannableStringBuilder(Phone);
        String gender = genger.getSelectedItem().toString().toString();
        Editable Gender = new SpannableStringBuilder(gender);

        account = new schoolaccount(firstname, secondnam, Emai, schoo, Datea, clas, phon, Gender);


        try {
            ObjectOutputStream classes = new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            classes.writeObject(account);
            classes.close();

        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
