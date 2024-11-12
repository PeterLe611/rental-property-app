package People;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author <Duc Loc Le - s4023679></Duc>
 **/

public abstract class Person {
    private int citizenID;
    private String fName;
    private Date dateOfBirth;
    private HashMap<String, String> contacts;

    Person(int citizenID, String fName, Date dateOfBirth) {
        this.citizenID = citizenID;
        this.fName = fName;
        this.dateOfBirth = dateOfBirth;
        this.contacts = new HashMap<>(); // Declaring every variable in the constructor
    }

    public void getContacts(Scanner scan){
        String type, contact;
        System.out.println("How many contacts do you want to add: "); int n = scan.nextInt();

        scan.nextLine(); // Clearing leftovers in the input buffers

        for(int i = 0; i < n; i++){
            System.out.println("Enter contact type (phone, email, etc.): "); type = scan.nextLine();
            System.out.println("Enter contact details: "); contact = scan.nextLine();

            contacts.put(type, contact);
        }
    }
}
