package Testpackage;
import java.io.*;
import java.util.*;

public class Classtwo extends Classone {
    // this is a class for the for smartphone.
 Scanner scan;
    private String front_camera;
    private String operating_system;
    private String Internal_storage_size;
    private String RAM_size;
    private String processor_speed;

    public Classtwo(String operating_system){// this constructor is important to initial the value of operating system.
        setOperating_system(operating_system);
    }

    public String getFront_camera() { return front_camera; }
    public void setFront_camera(String front_camera) { this.front_camera = front_camera; }
    public void camera(){

        if(getCamera().equalsIgnoreCase("Yes")){
            System.out.println("Does your phone have a front camera?");
            scan = new Scanner(System.in);
            String ans = scan.nextLine();
            setFront_camera(ans);
            if(getFront_camera().equalsIgnoreCase("Yes")){
                System.out.println("It seems like a modern phone");

            }else if (getFront_camera().equalsIgnoreCase("no")){
                System.out.println("It seems like a vintage phone");
            }
            else{
                System.out.println("All modern android phones have a camera. I bet yours doesn't have a front camera, does it?");
                scan = new Scanner(System.in);
                String ab = scan.nextLine();
                switch (ab){//I have used the switch satement that is more like if statement.
                    //you can notice that the switch statement compares the parameter with the cases present. But I am not certain if it allows the .equalIgnorecasemethod.
                    case "No":
                        System.out.println("I told didnt I?");
                        break;
                    case "no":
                        System.out.println("I told didnt I?");
                        break;
                    case "NO":
                        System.out.println("I told didnt I?");
                        break;
                    case "Yes":
                        System.out.println("Your phone is strange.");
                        break;
                    case "yes":
                        System.out.println("Your phone is strange.");
                        break;
                    case "YES":
                        System.out.println("Your phone is strange.");
                        break;
                    default:
                        System.out.println("Are you scared I am right?");
                }
            }
        }
    }

    public String getOperating_system() { return operating_system; }
    public void setOperating_system(String operating_system) { this.operating_system = operating_system; }

    public String getInternal_storage_size() { return Internal_storage_size; }
    public void setInternal_storage_size(String internal_storage_size) { Internal_storage_size = internal_storage_size; }
    public void storage(){
        System.out.println("What is the storage of your phone?" );
        scan = new Scanner(System.in);
        String ans = scan.nextLine();
        setInternal_storage_size(ans);
    }

    public String getRAM_size() { return RAM_size; }
    public void setRAM_size(String RAM_size) { this.RAM_size = RAM_size; }
    public void ram(){
        System.out.println("What is the size of your phones RAM");
        scan = new Scanner(System.in);
        String ans = scan.nextLine();
        setRAM_size(ans);
    }

    public String getProcessor_speed() { return processor_speed; }
    public void setProcessor_speed(String processor_speed) { this.processor_speed = processor_speed; }
    public void processor(){
        System.out.println("What is the processing speed of your phone?" );
        scan = new Scanner(System.in);
        String ans = scan.nextLine();
        setProcessor_speed(ans);
    }

    class Windows_operating_system{
        private String windows_appstore;
        private String X_box;
        private String Windows_version;
        private String Windows_default_web_browser;

        public void appstore(String app){ windows_appstore = app; }
        public String return_appstore (){ return windows_appstore; }
        public void appstore(){
            System.out.println("Does your phone have an appstore?");
            scan = new Scanner(System.in);
            String ans = scan.nextLine();
           appstore(ans);
        }

        public void box(String x){ X_box = x; }
        public String return_x_box (){ return X_box; }
        public void x_box(){
            System.out.println("Does you have have a windows gaming x-box?");
            scan = new Scanner(System.in);
            String ans = scan.nextLine();
           box(ans);
        }

        public void setWindows_version (String window){ Windows_version = window; }
        public String return_version(){ return Windows_version; }
        public void version (){
            System.out.println("Which vindows version are you using.");
            scan = new Scanner(System.in);
            String ans = scan.nextLine();
            setWindows_version(ans);
        }

        public void browser(String browser){ Windows_default_web_browser = browser; }
        public String return_browser(){ return Windows_default_web_browser; }
        public void browse() {
            System.out.println("Which is the default web browser in your phone?");
            scan = new Scanner(System.in);
            String ans = scan.nextLine();
            browser(ans);
        }

    }

    class Android_operating_system{
        private String play_store;
        private String android_version;
        private String default_android_browser;

        public void store(String store){ play_store = store; }
        public String return_store(){ return play_store; }
        public void appstore(){
            System.out.println("Does your phone have playstore?" );
            scan = new Scanner(System.in);
            String ans = scan.nextLine();
          store(ans);
        }

        public void android_version(String version){ android_version = version; }
        public String return_version(){ return android_version; }
        public void android(){
            System.out.println("What is the android version of your phone?" );
            scan = new Scanner(System.in);
            String ans = scan.nextLine();
            android_version(ans);
        }

        public void default_browser(String browser){ default_android_browser = browser; }
        public String return_browser(){ return default_android_browser; }
        public void browse(){
            System.out.println("Which is the default browser for your phone?" );
            scan = new Scanner(System.in);
            String ans = scan.nextLine();
            default_browser(ans);
        }
    }


    public String owner(){
      // because I extended classone, this abstract method must be override.
        return null;
    }
    // It is not necessary to override the non-abstract methods so I will not override any since I can access all the public ones.
    /*I will create method that will run one of the inner/ nested classes when the operating system is chosen. This will be get
    * information from the getoperating_system() and process it in an iteration either.
    * This method also gets all the data about the phone and store them in there appropriate fields.*/

    public void class_to_be_run(){
        if(getOperating_system().equalsIgnoreCase("Android")){
            android();
        }else if(getOperating_system().equalsIgnoreCase("Windows")){
            windows();
        }else{
          repeatasking();
        }
    }


    //creating two methods for the two operating systems.
    public void android(){
        Android_operating_system ab = new Android_operating_system();
        model();
        mAh();
        dimension();
        storage();
        super.Camera();//this call to Camera method call the method in the super class.
        camera();
        ab.appstore();
        ab.android();
        ab.browse();  // you will notice that this same method is also called for windows but there is no error messages because the inner classes are different

    }
    public void windows(){
        Windows_operating_system window = new Windows_operating_system();
        model();
        mAh();
        dimension();
        storage();
        super.Camera();
        camera();
        window.appstore();
        window.browse();
        window.x_box();
        window.version();
    }

    private void repeatasking() { }
    /*
    objects of inner classes cannot be created. This will be demonstrated later.
     */

}
