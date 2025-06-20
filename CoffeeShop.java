import java.util.LinkedList;
import java.util.Scanner;

import org.w3c.dom.Node;

import users.*;

public class CoffeeShop {
    public static void main(String[] args) {
        int choice;
        String s;
        String[] arr = new String[10];
        LinkedList<String> list = new LinkedList<String>();

        Scanner sc = new Scanner(System.in);
        Staff staff = new Staff(null, null);
        Customer c;
        
        do {
            System.out.println("Welcome to coffeeshop");
            System.out.println("1. Add Product");
            System.out.println("2. Display Product");
            System.out.println("3. Quit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character left by nextInt()

            switch (choice) {
                case 1:
                    //add product
                    // Product.addProduct();
                    Product newProduct = new Product(1, "coffee", 5, "M", "Cold");
                    // Product.changeProductPrice( 1);
                    // Product.productList.add(newProduct);
                    
                    // Product.productList.element().addProduct();


                    break;
                case 2:
                    Product.displayProducts();
                    //display product
                case 3: 
                    break;
                default:
                    break;
            }
        } while (choice != 3);
        sc.close();
    }


}
