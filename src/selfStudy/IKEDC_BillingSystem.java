package selfStudy;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class IKEDC_BillingSystem {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<IKEDC_Bill> list = new ArrayList<>();
        customerDetails(list, input);
        billDetails();
        generalInformation();
        billSummary();
        distributionRate();
        recentNews();
        contactInfo();
        postCredits();
    }

    private static void billSummary() {
        System.out.println();
        System.out.println("******************************************");
        System.out.println("* Previous balance:           #56,869.50 *");
        System.out.println("* Payment:                    #0.00      *");
        System.out.println("* Adjustment:                 #0.00      *");
        System.out.println("* NET arrears:                #56,869.50 *");
        System.out.println("* Energy charge:              #26,443.40 *");
        System.out.println("* Demand charge:              #0.00      *");
        System.out.println("* Fixed charge:               #0.00      *");
        System.out.println("* Loss of revenue:            #0.00      *");
        double vat = (7.5 / 100) * 26443.40;
        System.out.println("* VAT:                        #" + vat +"  *");
        System.out.println("* Other charges:              #0.00      *");
        System.out.println("* Current charge:             #28,426.66 *");
        System.out.println("* Total amount due:           #85,296.16 *");
        System.out.println("******************************************");
        billSummaryTable();
    }
    private static void billSummaryTable() {
        System.out.println();
        System.out.println("******************************************");
        System.out.println("* Please pay #:              85,296.16   *");
        System.out.println("* by                         14 Feb 2023 *");
        System.out.println("*     To avoid disconnection!            *");
        System.out.println("******************************************");
    }
    private static void generalInformation() {
        System.out.println();
        System.out.println("This is to inform you that customer indexing and enumeration for all our customers is still ongoing. ");
        System.out.println("We hereby solicit for your support during the period of this exercise.");
    }
    private static void billDetails() {
        System.out.println("Enter present reading: ");
        double presentReading = input.nextDouble();
        System.out.println("Enter previous reading: ");
        double previousReading = input.nextDouble();
        double consumption = presentReading - previousReading;
        System.out.println("Consumption: " + consumption);
        String presentDate = date();
        System.out.println("Date of present reading: " + presentDate);
        System.out.println("Rate (N/KWh): 21.80");
    }
    private static String date() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        String presentDate = formatter.format(date);
        return presentDate;
    }
    private static void customerDetails(ArrayList<IKEDC_Bill> list, Scanner input) {
        System.out.println("Enter your first and last name:");
        String userName = input.nextLine();
        System.out.println("Enter account number:");
        String accountNumber = input.nextLine();
        System.out.println("Enter meter number:");
        String meterNumber = input.nextLine();
        System.out.println("Enter tariff code:");
        String tariffCode = input.nextLine();
        System.out.println("Enter meter dials:");
        double meterDials = input.nextDouble();

        IKEDC_Bill ikedcBill = new IKEDC_Bill(userName,  accountNumber, meterNumber, tariffCode, meterDials);
        list.add(ikedcBill);
    }
    private static void distributionRate() {
        System.out.println();
        System.out.println("IE Distribution Network:");
        System.out.println("90");
        System.out.println("33kV Feeders");
        System.out.println("286");
        System.out.println("11kV Feeders");
        System.out.println("65");
        System.out.println("Injection Substations");
        System.out.println("18,499");
        System.out.println("Distribution Substations");
    }
    private static void postCredits() {
        System.out.println();
        System.out.println("Copyright 2022 Ikeja Electric | All Rights Reserved.");
    }
    private static void contactInfo() {
        System.out.println();
        System.out.println("Contact Info:");
        System.out.println("Address - Obafemi Awolowo Way, Alausa, Ikeja, Lagos.");
        System.out.println("Contact - 01-7000-250");
        System.out.println("Contact - 01-227-2940");
        System.out.println("eMail   - info@ikejaelectric.com");
        System.out.println("Website - https://ikejaelectric.com");
    }
    private static void recentNews() {
        System.out.println();
        System.out.println("Recent News:");
        System.out.println("Ikeja Electric Collaborates with NSCDC on Safety of Equipment for stable Electricity.");
        System.out.println("January 4, 2023.");
        System.out.println();
        System.out.println("Ikeja Electric bags Best Performing Disco, Most Gender Diverse Utility Company in 2022.");
        System.out.println("November 28, 2022.");
    }
}