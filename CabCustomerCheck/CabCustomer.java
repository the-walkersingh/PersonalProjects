package CollectionFramework.Problems.CabCustomerCheck;

public class CabCustomer {

    private int custId;
    private String customerName;
    private String pickupLocation;
    private String dropLocation;
    private int distance;
    private long phone;

    public CabCustomer() {
        // TODO Auto-generated constructor stub
    }

    //Parameter Constructor
    public CabCustomer(int custId, String customerName, String pickupLocation,
                       String dropLocation, int distance, long phone) {
        this.custId = custId;
        this.customerName = customerName;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.distance = distance;
        this.phone = phone;
    }

    public int getCustId() {
        return custId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public int getDistance() {
        return distance;
    }

    public long getPhone() {
        return phone;
    }

    public String toString() {
        return "Below are the details : \n" +
                "Customer ID 	  : " + custId + "\n" +
                "Name 	          : " + customerName + "	\n" +
                "Pick-up Location : " + pickupLocation + "\n" +
                "Drop Location 	  : " + dropLocation + "\n" +
                "Distance 	      : " + distance + " Km\n" +
                "Phone No	      : " + phone + "\n";
    }
}