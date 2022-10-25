package org.example.thecommandpattern.salesorderchallange;

import org.example.thecommandpattern.PrintCommand;

public class SalesOrderClient {
    private static Jacket jacket = new Jacket();

    public static void main(String[] args) {
        OrderHandler placeOrder = new OrderHandler();
        OrderHandler returnOrder = new OrderHandler();

        placeOrder.invoke(new PlaceOrderCommand(jacket));
        returnOrder.invoke(new ReturnOrderCommand(jacket));
    }
}
