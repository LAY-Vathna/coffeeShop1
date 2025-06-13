import java.util.LinkedList;
import java.util.Scanner;

public class Product {
    private int product_id;
    private String product_name; // ice-latte //ice-lattee
    private double product_price; // 3$
    private String size; //M // L
    private String drink_type; // hot, cold, iced

    private static LinkedList<Product> productList = new LinkedList<>();

    private Product()
    {
    }

    

    public int getProduct_id() {
        return product_id;
    }



    public String getProduct_name() {
        return product_name;
    }



    public double getProduct_price() {
        return product_price;
    }



    public String getSize() {
        return size;
    }

    


    public void setProduct_price(double product_price) {
        //write logic urself
        // this.product_price = product_price;
    }



    public String getDrink_type() {
        return drink_type;
    }



    public static LinkedList<Product> getProductList() {
        return productList;
    }



    public String changeProductPrice(double newPrice) {
        System.out.println(this.product_name + "from class");
    
        return "change not successful";
    }
    public static String changeProductPrice(Product newProduct, double newPrice) {
        System.out.println(newProduct.product_name + "from class");

        return "change not successful";
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

    // private static void editProduct(Product product)
    // {
        
    // }
    // void editProduct()
    // {
        
    // }
}
