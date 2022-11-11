package module11.t01.t03;

import java.io.Serializable;

public class User implements Serializable {
    String firstName;
    String lastName;
    String phoneNumber;
    int age;

    public User(String firstName, String lastName, String phoneNumber, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }
    String getFirstName() {return firstName;}
    String getLastName() {return lastName;}
    String getPhoneNumber() {return phoneNumber;}
    int getAge(){ return age;}

}
