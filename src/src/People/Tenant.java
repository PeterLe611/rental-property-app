package People;

import RentalServices.Property;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * @author <Duc Loc Le - s4023679></Duc>
 **/


public class Tenant extends Person{
    private ArrayList<Property> rentalAgreements;
    private ArrayList<Payment> paymentsHistory;

    Tenant(int citizenID, String fName, Date dateOfBirth){
        super(citizenID, fName, dateOfBirth);

        Scanner scan = new Scanner(System.in);
        this.getContacts(scan);
    }
}
