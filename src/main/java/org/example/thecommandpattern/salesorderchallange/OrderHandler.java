package org.example.thecommandpattern.salesorderchallange;



public class OrderHandler {

    public void invoke(Command command){
        command.execute();
    }
}
