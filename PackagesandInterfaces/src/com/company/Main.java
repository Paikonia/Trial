package com.company;
import java.util.*;

import Testpackage.Classtwo;// this imports the class from the package it is in. The main class is in a different package.
import ThreadPackage.trialThread;

public class Main {

    public static void main(String[] args) {
        trialThread one = new trialThread();
        trialThread two = new trialThread();
        Thread t = Thread.currentThread();


        for(int i = t.getPriority(); i >0; i--){
           try {
               //this is to rest the main thread as the user inputs data
               System.out.println("main Thread:" + t + " is on priority " + t.getPriority());
               Thread.sleep(10000);
           }
           catch(Exception e){
               System.out.println("the main thread has been interrupted.");
           }
        }

    }
}
