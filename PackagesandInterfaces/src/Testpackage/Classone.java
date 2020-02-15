package Testpackage;

import java.util.Scanner;

/*
* the is a class that cannot form objects
* I will us it to create abstract class that objects cannot be created out of
* the class will basically be handling basic data about the objects to be created so that the codes are not run every time.*/
public abstract class Classone {
    Scanner scan;
// this class is creating basic information about phones and computer.
    private String model;
    private String battery_mAh;
    private String height, width, length;
    private String back_camera;
    private String storage;

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void model(){
        System.out.println("What is the model of your phone?");
        scan = new Scanner(System.in);
        String model = scan.nextLine();
        setModel(model);
    }

    public String getBattery_mAh() {
        return battery_mAh;
    }
    public void setBattery_mAh(String battery_mAh) {
        this.battery_mAh = battery_mAh;
    }
    public void mAh(){
        System.out.println("What is the battery's mAh.?");
        scan = new Scanner(System.in);
        String model = scan.nextLine();
        setModel(model);
    }

    public String getHeight() {
        return height;
    }
    public void setHeight(String height) {
        this.height = height;
    }
    public String getWidth() {
        return width;
    }
    public void setWidth(String width) {
        this.width = width;
    }
    public String getLength() {
        return length;
    }
    public void setLength(String length) {
        this.length = length;
    }
    public void dimension(){
        System.out.println("What is the height of your phone?");
        scan = new Scanner(System.in);
        String height  = scan.nextLine();
        setHeight(height);
        System.out.println("What is the length?");
        scan = new Scanner(System.in);
        String length = scan.nextLine();
        setLength(length);
        System.out.println("What is the width of you phone?");
        scan = new Scanner(System.in);
        String width = scan.nextLine();
        setWidth(width);
    }

    public String getCamera() {
        return back_camera;
    }
    public void setCamera(String camera) {
        this.back_camera = camera;
    }
    public void Camera(){
        System.out.println("Does your phone have a back camera?");
        scan = new Scanner(System.in);
        String camera = scan.nextLine();
        setCamera(camera);
    }

    public String getStorage() {
        return storage;
    }
    public void setStorage(String storage) {
        this.storage = storage;
    }

    public void storage(){
        System.out.println("What is the storage capacity of your phone?");
        scan = new Scanner(System.in);
        String storage = scan.nextLine();
        setStorage(storage);
    }
    /*note that the following method must be override in all the classes that extend this class.

     */
    public abstract String owner();



}
