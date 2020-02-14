package com.example.presentable.Account;

import android.text.Editable;

public abstract class GeneralAccount {
    private Editable firstname;
    private Editable lastName;
    private Editable phone_number;
    private Editable email;

    public void setFirstname(Editable firstname) {
        this.firstname = firstname;
    }

    public void setLastName(Editable lastName) {
        this.lastName = lastName;
    }

    public void setPhone_number(Editable phone_number) {
        this.phone_number = phone_number;
    }

    public void setEmail(Editable email) {
        this.email = email;
    }

    public Editable getFirstname() {
        return firstname;
    }

    public Editable getLastName() {
        return lastName;
    }

    public Editable getPhone_number() {
        return phone_number;
    }

    public Editable getEmail() {
        return email;
    }
}
