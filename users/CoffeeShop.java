package users;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.w3c.dom.Node;

import mInterface.Authentication;

// @FunctionalInterface
// interface Greeting {
//     public abstract void greet(String name, double price);
// }

// @FunctionalInterface
// interface Calculator
// {
//     public abstract int calculate(int a, int b);
// }

public class CoffeeShop {
    public static void main(String[] args) {

        JFrame firstFrame = new JFrame();
        firstFrame.setTitle("Coffee Shop");

        firstFrame.setSize(500, 500);
        firstFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        firstFrame.setLayout(null);

        JButton button = new JButton("Click Me1");
        button.setBounds(0, 0, 100, 50);
        button.setBackground(Color.pink);
        button.addActionListener(e->
        {
            System.out.println("Button 1 clicked");
        });

        // ButtonListener buttonListener = new ButtonListener();
        // button.addActionListener(buttonListener);
        

        JButton button2 = new JButton("Click Me2");
        button2.setBounds(0, 100, 100, 50);
        button2.setBackground(Color.YELLOW);

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 System.out.println("Button 2 clicked");
            }
        });



        firstFrame.add(button);
        firstFrame.add(button2);
        firstFrame.setVisible(true);
        // Calculator sum = (a, b) -> a + b;
        // Calculator sub = (a, b) -> a - b;
        // Calculator mul = (a, b) -> a * b;
        // Calculator div = (a, b) -> {
        //     if (b == 0) {
        //         System.out.println("Cannot divide by zero");
        //         return 0;
        //     }
        //     return a / b;
        // };
        // System.out.println("Sum: " + sum.calculate(10, 5));
        // System.out.println("Subtraction: " + sub.calculate(10, 5));
        // System.out.println("Multiplication: " + mul.calculate(10, 5));
        // System.out.println("Division: " + div.calculate(10, 5));

        // Greeting g = (name, price) -> {
        //     System.out.println("hello " + name + "drink price is " + price);
        // };
        // g.greet("test", 2.5);
        // Greeting g1 =  new Greeting() {
        //     @Override
        //     public void greet(String name) {
        //         System.out.println("hello " + name);
        //     }
        // };
        // g1.greet("test");



        // Customer c1 = new Customer();
        // System.out.println(c1);

    //     Customer c3 = new Customer("test@123.com", "12345678",
    // "1234");
    //     System.out.println(Authentication.login(c3));

        // Customer c4 = new Customer(){
        //     @Override
        //     public String toString() {
        //         // TODO Auto-generated method stub
        //         return "confidential for special customer";
        //     }
        //     @Override
        //     public void setLoyaltyPoints(int loyaltyPoints) {
        //         // TODO Auto-generated method stub
        //         this.loyaltyPoints = loyaltyPoints;
        //     }
        // };

        // System.out.println(c4);

        // Account a2 = new Account() {
            
        // };

        // Authentication a1 = new Authentication() {

        //     @Override
        //     public void register() {
        //         // TODO Auto-generated method stub
                
        //     }
            
        // };

    }
}
