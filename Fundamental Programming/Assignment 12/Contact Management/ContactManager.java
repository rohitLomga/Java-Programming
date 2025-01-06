package Assignment_12._Contact_Management;

import java.util.ArrayList;

public class ContactManager {
    ArrayList <Contact> contacts;

    public ContactManager(){
        contacts = new ArrayList<>();
    }

    public void addContacts(Contact contactDetails){
        contacts.add(contactDetails);
    }

    // Method to update the name of the contact
    public void updateName(String name, String newname){
        for(Contact c : contacts){
            if (c.getName().equals(name)){
                c.setName(newname);
                System.out.println("Name updated");
                return;
            }
        }
        System.out.println("Name not found");
    }

    // Method to update the email of the contact
    public void updateEmail(String email, String newEmail){
        for(Contact c : contacts){
            if(c.getEmail().equals(email)){
                c.setEmail(newEmail);
                System.out.println("Email updated");
                return;
            }
        }
        System.out.println("Email not found");

    }

    // Method to update the phone number
    public void updatePhoneNumber(String phone_number, String newPhoneNumber){
        for(Contact c : contacts){
            if(c.getPhone_number().equals(phone_number)){
                c.setPhone_number(newPhoneNumber);
                System.out.println("Phone number updated");
                return;
            }
        }
        System.out.println("Phone number not found");

    }

    // Method to show the details of the contacts
    public void listDetails(){
        if(contacts.isEmpty()){
            System.out.println("Contact list is empty");
            return;
        }

        for(Contact c : contacts){
            System.out.println("Name : " + c.getName() + ", Phone Number : " + c.getPhone_number() + ", Email : " + c.getEmail());
        }
    }

    // Method to search by name
    public void searchByName(String name){
        for(Contact c : contacts){
            if(c.getName().equals(name)){
                System.out.println("Name : " + c.getName() + ", Phone Number : " + c.getPhone_number() + ", Email : " + c.getEmail());
                return;
            }
        }
        System.out.println("Not found");
    }

}