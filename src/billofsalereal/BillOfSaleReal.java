/*
 * Nick Dernovsek
 * BillOfSaleReal.java
 * This program calculates that total price with taxes and the
 * change for a bill.
 */

package billofsalereal;

/**
 *
 * @author nider6687
 */

import java.text.DecimalFormat;
public class BillOfSaleReal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double price = 12.49;
        double paid = 20.0;
        double tax = 12.49*0.13;
        DecimalFormat x = new DecimalFormat("###.##");
        //changes that amount of deimals for tax to only 2
        double change = 20.00%12.49;
        
        System.out.println("Bill");
        System.out.println("*********");
        System.out.println(" ");
        System.out.println("Price:   "+ price + "$");
        System.out.println("Paid:    "+ paid + "$");
        System.out.println("Tax:     "+ x.format(tax) + "$");
        System.out.println("Change:  "+ change + "$");
        
    }
    
}
