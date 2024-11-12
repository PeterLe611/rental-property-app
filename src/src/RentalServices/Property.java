package RentalServices;

import People.Host;
import People.Tenant;

import java.util.ArrayList;

/**
 * @author <Duc Loc Le - s4023679></Duc>
 **/

public abstract class Property {
    private int propertyID;
    private String address;
    private int price;
    private char status;
    private Tenant owner = null;
    private ArrayList<Host> hosts;


}
