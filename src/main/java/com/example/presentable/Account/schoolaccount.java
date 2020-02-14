package com.example.presentable.Account;

import android.text.Editable;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class schoolaccount extends GeneralAccount implements Serializable {
    private Editable Clas;
    private Editable School;
    private Editable date_of_birth;
    private Editable sex;

    public schoolaccount(){

    }
    public schoolaccount(Editable firstname, Editable secondname, Editable emai, Editable school, Editable date, Editable cass, Editable phone, Editable gender) {
        setClass(cass);
        setSchool(school);
        setDate_of_birth(date);
        setSex(gender);
        setFirstname(firstname);
        setLastName(secondname);
        setEmail(emai);
        setPhone_number(phone);
    }

    public void setClass(Editable aClass) {
        Clas = aClass;
    }

    public void setSchool(Editable school) {
        School = school;
    }

    public void setDate_of_birth(Editable date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public void setSex(Editable sex) {
        this.sex = sex;
    }

    public Editable getClas() {
        return Clas;
    }

    public Editable getSchool() {
        return School;
    }

    public Editable getDate_of_birth() {
        return date_of_birth;
    }

    public Editable getSex() {
        return sex;
    }
}
