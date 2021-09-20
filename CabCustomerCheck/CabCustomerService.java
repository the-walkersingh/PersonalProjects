package CollectionFramework.Problems.CabCustomerCheck;

import java.util.ArrayList;

public class CabCustomerService {
    private ArrayList<CabCustomer> customerList = new ArrayList<CabCustomer>();        // [c1,c2]

    public void addCabCustomer(CabCustomer cust) {        // cust = c1
        customerList.add(cust);                            // customerList.add(c1)
    }

    public boolean isFirstCustomer(CabCustomer cust) {        // cust= c4

        for (CabCustomer c : customerList) {                    // c = c1								c = c2
            if (c.getPhone() == cust.getPhone())                // 987456321 == 7488981236 F			987456321 == 7488981236 F
                return false;                                //
        }

        return true;                                        // return true
    }


    public double calculateBill(CabCustomer cust) {
        double bill = 0.0;

        if (isFirstCustomer(cust))
            bill = 0.0;

        else if (cust.getDistance() <= 4)
            bill = 80.0;

        else
            bill = 80 + (cust.getDistance() - 4) * 6;

        return bill;

    }


    public String printBill(CabCustomer c) {
        return c.getCustomerName() + " please pay the bill of Rs." + calculateBill(c);
    }


}
