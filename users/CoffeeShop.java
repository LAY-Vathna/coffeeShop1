package users;
import java.util.LinkedList;
import java.util.Scanner;

import org.w3c.dom.Node;

import mInterface.Authentication;

public class CoffeeShop {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        System.out.println(c1);

        Customer c3 = new Customer("test@123.com", "12345678",
    "1234");
        System.out.println(Authentication.login(c3));
    }
}
