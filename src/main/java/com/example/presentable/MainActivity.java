package com.example.presentable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button log = findViewById(R.id.Login);
        Button setup = (Button) findViewById(R.id.setup);
        TextView incorrectemail = findViewById(R.id.incorrectemail);
        TextView incorrectpassword = findViewById(R.id.incorrectpassword);


    }


    public void setup(View view) {

        startActivity(new Intent(this, Main2Activity.class));
    }
}
