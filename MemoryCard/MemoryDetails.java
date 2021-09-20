package CollectionFramework.Problems.MemoryCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//In this sorting is done on basis of Product ID, Brand Name, Price, Rating, Storage
public class MemoryDetails {

    public static void main(String[] args) {
        Memory m1 = new Memory("Samsung", "ST334", 500, 1299, 8.8f);
        Memory m2 = new Memory("HP", "HP998", 1000, 2200, 8.1f);
        Memory m3 = new Memory("Asus", "A221", 550, 1200, 7.8f);
        Memory m4 = new Memory("ADATA", "AD647", 1500, 2300, 9.6f);
        Memory m5 = new Memory("SanDisk", "SD34", 500, 1200, 8.8f);
        Memory m6 = new Memory("Transcend", "T531", 1000, 2000, 8.2f);
        Memory m7 = new Memory("Toshiba", "TB101", 520, 1300, 9.1f);
        //adding all the elements to the list of ArrayList type
        ArrayList<Memory> mem = new ArrayList<>();
        mem.add(m1);
        mem.add(m2);
        mem.add(m3);
        mem.add(m4);
        mem.add(m5);
        mem.add(m6);
        mem.add(m7);
        System.out.println("Below is the details of all the Pendrive ");
        System.out.println("ALl product details before sorting : ");
        display(mem);//Printing details before sorting

        //Now we will ask user to choose any way to sort the data using loop
        byte response = 0;//its zero becaue in do-while loop it will run once and if user wants to run it
        //again he can type 1
        System.out.println("You can sort the list by yourself.....!!!!");
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("You have below options : ");
            System.out.println(" 1 for Product ID\n 2 for Brand Name\n 3 for Price\n 4 for Rating\n 5 for Storage ");
            System.out.println("WARNING: To Quit Press 0 ");
            System.out.print("Now enter your Choice : ");
            int choice = sc.nextInt();
            if (choice == 1) {
                ProductIDSort p = new ProductIDSort();
                mem.sort(p);
                System.out.println("\n##############Sorting based on ProductID    : ");
                display(mem);
            } else if (choice == 2) {
                BrandSort b = new BrandSort();
                mem.sort(b);
                System.out.println("\n##############Sorting Based on Brand Names  :");
                display(mem);
            } else if (choice == 3) {
                PriceSort pr = new PriceSort();
                mem.sort(pr);
                System.out.println("\n##############Sorting Based on Price List :");
                display(mem);
            } else if (choice == 4) {
                RatingSort ra = new RatingSort();
                mem.sort(ra);
                System.out.println("/n##############Sorting based on Rating :");
                display(mem);
            }else if (choice==5){
                StorageSort s=new StorageSort();
                mem.sort(s);
                display(mem);
            }else if(choice==0){
                break;
            }
            System.out.println("Want to choose again......!!!!!!!!  ");
            System.out.print("If yes then press 1 or other Number to Quit: ");
            response = sc.nextByte();
        } while (response == 1);
        System.out.println("\n#####*****Thanks for Using our Service*****######");


    }

    public static void display(ArrayList<Memory> MemList) {

        for (Memory m : MemList) {
            System.out.println(m);
        }
        System.out.println("***************************************************");

    }
}
