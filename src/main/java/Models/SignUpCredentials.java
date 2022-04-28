package Models;

import java.lang.*;
enum Genders{
    Male,
    Female
}
public class SignUpCredentials {
    private String Username;
    private String Password;
    private String Email;
    private String Name; 
    private String Surname;
    private String PhoneNumber;
    private Int Age;
    private Gender Gender;

    public SignUpCredentials(String username, String password, String email, String name, String surname, String phonenumber, Genders gender, Int age) {
        Username = username;
        Password = password;
        Email = email;
        Name = name;
        Surname = surname;
        PhoneNumber = phonenumber;
        Age = age;
        Gender = gender; 
    }

    public String getUsername(){
        return Username;
    }

    public String getPassword(){
        return Password;
    }

    public String getEmail(){
        return Email;
    }

    public String getName(){
        return Name;
    }

    public String getSurname(){
        return Surname;
    }
    
    public String getPhone(){
        return PhoneNumber;
    }

    public String getAge(){
        return Age;
    }

    public String Gender(){
        return Gender;
    }
}


