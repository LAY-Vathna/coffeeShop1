public class Product {
    int product_id;
    String product_name; // ice-latte //ice-lattee
    double product_price;
    char size; //M // L
    String drink_type; // hot, cold, iced
    String description; // ["Matcha","Cream",calories]
    // int purchases = 0;
    //int coffeeShots; // 1 shot, 2 shots, 3 shots
    double discount; // 0.0, 10.0, 20.0
    String image; // "product1.jpg", "product2.png"
    public Product(int product_id, String product_name, double product_price, char size, String drink_type,
            String description, double discount, String image) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price;
        this.size = size;
        this.drink_type = drink_type;
        this.description = description;
        this.discount = discount;
        this.image = image;
    }
    
}
