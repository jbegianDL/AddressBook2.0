package com.company;
import java.util.Scanner;

public class AddressBookDemo {

    public static void main(String[] args) {
        Scanner usrInput = new Scanner(System.in);
        AddressBook newAddressBook = new AddressBook();
        boolean repeat = true;
        String prompt = "\n Welcome to the Address Book! What would you like to do? " +
                "\n 1 - View All Entries" +
                "\n 2 - Search By Name" +
                "\n 3 - Search By Number" +
                "\n 4 - Delete An Entry " +
                "\n 5 - Add an Entry" +
                "\n 6 - Exit" +
                "\n Please input a number: ";


        //loops as long as repeat boolean is true
        do{
            System.out.println(prompt);
            int usrChoice = usrInput.nextInt();
            switch(usrChoice){
                case 1:
                    newAddressBook.printAddressBook();
                    break;
                case 2:
                    newAddressBook.searchByName();
                    break;
                case 3:
                    newAddressBook.searchByNumber();
                    break;
                case 4:
                    newAddressBook.deleteContact();
                    break;
                case 5:
                    newAddressBook.makeContact();
                    break;
                case 6:
                    System.out.println("Goodbye!");
                    repeat = false;
                    break;
                default:
                    System.out.println("Error - Incorrect Input");
            }

        }while(repeat);


    }
}
