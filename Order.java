import java.sql.Date;

public class Order {
    int customer_id;
    int staff_id;
    int product_id;
    String order_status; //successful order, completed order
    // String payment_method; //cash, KH OR
    String order_note;// No sugar
    int product_quantity; // 1 2 
    double order_price; // product_id (price) * quantity
    Date order_date;
    
} 
