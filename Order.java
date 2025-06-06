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
    public Order(int customer_id, int staff_id, int product_id, String order_status, String order_note,
            int product_quantity, double order_price, Date order_date) {
        this.customer_id = customer_id;
        this.staff_id = staff_id;
        this.product_id = product_id;
        this.order_status = order_status;
        this.order_note = order_note;
        this.product_quantity = product_quantity;
        this.order_price = order_price;
        this.order_date = order_date;
    }

    
    
} 
