package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    private ArrayList<Contact> contactList = new ArrayList<Contact>();

    //prompts user --> makes contact object --> adds contact object to the ArrayList
    public void makeContact(){
        Scanner usrInput = new Scanner(System.in);
        Contact newContact = new Contact();

        System.out.println("Contact Name");
        newContact.setName(usrInput.nextLine());
        System.out.println("Contact Address");
        newContact.setAddress(usrInput.nextLine());
        System.out.println("Contact Phone Number");
        newContact.setPhoneNumber(usrInput.nextLine());
        System.out.println("Contact Birthday");
        newContact.setBirthday(usrInput.nextLine());

        contactList.add(newContact);
    }

    //prints out the whole contact list array
    public void printAddressBook() {

        if (contactList.isEmpty()) {
            System.out.println("Address Book is Empty!");
        } else {
            for (Contact contact : contactList) {
                contact.printDetails();
            }

        }
    }

    //searches array by name
    public void searchByName(){
        String result = "Can't find who you're looking for...";
        System.out.println("Please enter a contacts name: ");
        Scanner input = new Scanner(System.in);
        String wantedName = input.nextLine();

        for(Contact contact : contactList){
            if(wantedName.equalsIgnoreCase(contact.getName())){
                result = "Found it!";
                contact.printDetails();
                break;
            }

        }
        System.out.println(result);
    }

//    //searches array by number
    public void searchByNumber(){
        String result = "Can't find who you're looking for...";
        System.out.println("Please enter a contacts Phone Number: ");
        Scanner input = new Scanner(System.in);
        String wantedNumber = input.nextLine();

        for(Contact contact : contactList){
            if(wantedNumber.equals(contact.getPhoneNumber())){
                result = "Found it!";
                contact.printDetails();
                break;
            }
        }
        System.out.println(result);
    }

    //deletes contact by changing contactList[i] to null
    public void deleteContact(){
        printAddressBook();
        String result = "Can't find who you're looking for...";
        System.out.println("What contact would you like to delete? \n" +
                "Please enter the name of the contact: ");
        Scanner input = new Scanner(System.in);
        String notWantedContact = input.nextLine();
        for(Contact contact : contactList){
            if(notWantedContact.equalsIgnoreCase(contact.getName())){
                result = contact.getName() + " has been removed";
                contactList.remove(contact);
                break;
            }
        }
        System.out.println(result);
    }
}
