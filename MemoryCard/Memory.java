package CollectionFramework.Problems.MemoryCard;

//Create Memory class with fields: brand_name,storage,model_name,price,rating;
//create MainClass and use sorting as per user requirement
public class Memory {
    String bname;
    String model;
    int storage;
    int price;
    float rate;
    int productid;
    static int pid = 100;

    public Memory() {
        productid = ++pid;
    }

    public Memory(String bname, String model, int storage, int price, float rate) {
        this();
        this.bname = bname;
        this.model = model;
        this.storage = storage;
        this.price = price;
        this.rate = rate;
    }

    public int getProductid() {
        return productid;
    }

    public String toString() {
        return "***************************************************\n" +
                "Product ID 	: " + productid + " \n" +
                "Brand Name 	: " + bname + " \n" +
                "Model No 	: " + model + "	\n" +
                "Storage 	: " + storage + " GB\n" +
                "Price 	    : " + price + " Rs\n" +
                "Rating 	    : " + rate + " Stars\n";
    }
}
