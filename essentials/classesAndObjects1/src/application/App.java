package application;

import entities.User;

public class App {
    public static void main(String[] args) {
        
        User u1 = new User();
        u1.fname = "Marcus";
        u1.lname = "Silva";
        u1.age = 30;
        System.out.println(u1.fname);

        User u2 = new User();
        u2.fname = "Luis";
        u2.lname = "Silva";
        u2.age = 36;
        System.out.println(u2.fname);
    }
}
