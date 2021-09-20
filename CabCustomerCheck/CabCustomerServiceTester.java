package CollectionFramework.Problems.CabCustomerCheck;

public class CabCustomerServiceTester {

    public static void main(String[] args) {
        CabCustomer c1 = new CabCustomer(5601, "Rakesh", "JNTU", "Gachibowli", 10, 987456321L);
        CabCustomer c2 = new CabCustomer(5602, "Arun", "Ameerpet", "KPHP", 15, 7456981236L);
        CabCustomer c3 = new CabCustomer(5603, "Varun", "Ammerpet", "Gachibowli", 20, 887456321L);
        CabCustomer c4 = new CabCustomer(5604, "Ganesh", "Mehidhipatnam", "KPHP", 25, 7488981236L);


		/*System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println("==============================================================================");*/


        CabCustomerService service = new CabCustomerService();
        service.addCabCustomer(c1);
        service.addCabCustomer(c3);
//        System.out.println(c1.getCustId() + " " + service.calculateBill(c1));
//        System.out.println(c4.getCustId() + " " + service.calculateBill(c4));

        System.out.println(service.printBill(c1));
        System.out.println(service.printBill(c2));
        System.out.println(service.printBill(c3));
        System.out.println(service.printBill(c4));

    }

}
