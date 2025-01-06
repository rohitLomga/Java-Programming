package Assignment_12._Contact_Management;

public class Contact {

    String name;
    String phone_number;
    String email;

    public Contact(String name, String phone_number, String email){
        this.name = name;
        this.phone_number = phone_number;
        this.email = email;
    }

    String getName(){

        return name;
    }

    String getPhone_number(){

        return phone_number;
    }

    String getEmail(){
        return email;
    }

    // To update the name of the contact
    public void setName(String name){
        this.name = name;
    }

    // To update the phone number
    public void setPhone_number(String phone_number){
        this.phone_number = phone_number;
    }

    // To update the email
    public void setEmail(String email){
        this.email = email;
    }
}
