package CollectionFramework.Problems.BooksListSorting;
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class BookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b1 = new Book("C language", "Dessin Ritchi", "MIT Publication", 500, 10);
        Book b2 = new Book("Java", "Abelson Rolli", "PBP Publication", 740, 8);
        Book b3 = new Book("Computer Science", "Rakshe Tyagi", "Sharda Publication", 500, 6);
        Book b4 = new Book("Physics", "Prabhakar Singh", "Penguin Publication", 300, 7);
        Book b5 = new Book("Chemistry", "Neha Talwar", "Rookie Publication", 250, 8);
        Book b6 = new Book("Biology", "Santhosh Karande", "Prakash Publication", 630, 7);
        Book b7 = new Book("Math", "Diwakar Tomar", "Random Publication", 450, 9);

        List<Book> booklist = new ArrayList<Book>();
        booklist.add(b1);
        booklist.add(b2);
        booklist.add(b3);
        booklist.add(b4);
        booklist.add(b5);
        booklist.add(b6);
        booklist.add(b7);
        System.out.println("\nBelow is the list of all the books available in our store: \n");
        display(booklist);

        byte cont = 0;
        do {
            System.out.println("You can sort Yourself Based Upon\n1. Name\n2. Author\n3. Publisher\n4. Price\n5. Rating \n");
            System.out.println("To exit the menu you can press any number other then Below");
            System.out.print("Enter the your option 1, 2, 3, 4 or 5 : ");
            int option = sc.nextInt();            // 1 or  2 or 3

            if (option == 1) {
                NameSort n = new NameSort();
                booklist.sort(n);
                System.out.println("\nSorting based upon Name : ");
                display(booklist);
            } else if (option == 2) {
                AuthorSort a = new AuthorSort();
                System.out.println("\nSorting based upon Author : ");
                booklist.sort(a);
                display(booklist);
            } else if (option == 3) {
                PublisherSort p = new PublisherSort();
                System.out.println("\nSorting based upon Publisher : ");
                booklist.sort(p);
                display(booklist);
            } else if (option == 4) {
                PriceSort p = new PriceSort();
                System.out.println("\nSorting based upon Price : ");
                booklist.sort(p);
                display(booklist);
            } else if (option == 5) {
                RatingSort p = new RatingSort();
                System.out.println("\nSorting based upon Rating : ");
                booklist.sort(p);
                display(booklist);
            } else {
                System.out.println("\nInvalid Option....");
            }

//            System.out.print("\nDo you want to Continue? true or false : ");
            System.out.println("To continue only Press 1 : ");
            cont = sc.nextByte();
        } while (cont==1);
        System.out.println("Thank You for using our software");
    }





        public static void display(List<Book> bList) {

            for (Book b : bList) {
                System.out.println(b);
            }
            System.out.println("***************************************************");

        }

}