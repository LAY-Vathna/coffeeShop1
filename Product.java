import java.util.LinkedList;
import java.util.Scanner;

public class Product {
    int product_id;
    String product_name; // ice-latte //ice-lattee
    double product_price;
    String size; //M // L
    String drink_type; // hot, cold, iced

    static LinkedList<Product> productList = new LinkedList<>();

    private Product()
    {

    }

    public Product(int product_id, String product_name, double product_price, String size, String drink_type) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.size = size;
        this.drink_type = drink_type;
    }

    public static void addProduct()
    {
        Scanner sc = new Scanner(System.in);
        Product newProduct = new Product();

        System.out.print("Input product Name: ");
        newProduct.product_name = sc.nextLine();
        System.out.print("Input product Price: ");
        newProduct.product_price = sc.nextDouble();
        sc.nextLine(); // Consume the newline character left by nextDouble()
        System.out.print("Input product Size: ");
        newProduct.size = sc.nextLine();
        System.out.print("Input product DrinkType: ");
        newProduct.drink_type = sc.nextLine();
        newProduct.product_id = productList.size() + 1; // Auto-increment ID based on list size
        
        productList.add(newProduct);
        System.out.println("Product added successfully!");
    }
    public static void displayProducts() {
        if (productList.isEmpty()) {
            System.out.println("No products available.");
            return;
        }
        System.out.println("Product List:");
        for (Product product : productList) {
            System.out.println("ID: " + product.product_id + ", Name: " + product.product_name + 
                               ", Price: " + product.product_price + ", Size: " + product.size + 
                               ", Drink Type: " + product.drink_type);
        }
    }
    void removeProduct()
    {

    }
    // static void editProduct(Product product)
    // {
        
    // }
    // void editProduct()
    // {
        
    // }
}
