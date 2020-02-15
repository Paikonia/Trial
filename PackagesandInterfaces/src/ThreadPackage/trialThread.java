package ThreadPackage;

import Testpackage.Classtwo;

import java.util.Scanner;

public class trialThread implements Runnable {
Thread t;
    public trialThread(){
        t = new Thread(this, "SecondThread");
        System.out.println("The thread running the codes is: " + t);
        t.start();
    }
    @Override
    public void run() {//the best way to run this application is to synchronise the run method
        // symply type synchronized public void run(){} and only one thread can run at a time.
        Scanner scan;

        System.out.println("Which type of phone are having? A smartphone or cell phone");
        scan = new Scanner(System.in);
        String ans = scan.nextLine();
        if(ans.equalsIgnoreCase("smartphone") || ans.equalsIgnoreCase("Smart phone")) {
            System.out.println("Which operating system does your phone have?");
            scan = new Scanner(System.in);
            String operating = scan.nextLine();
            Classtwo classtwo = new Classtwo(operating);
            classtwo.class_to_be_run();
        } else if(ans.equalsIgnoreCase("Cellphone") || ans.equalsIgnoreCase("cell phone")){
            System.out.println("The servives for string your record are currently unavailable, please wait after an updated version of the program comes out.");
        }

    }
}
