package com.company;

public class CustCommand {
    private String cuscmd[]={"1 - Show customers", "2 - Add new customer", "3 - Edit customer", "4 - Delete customer", "0 - Exit"};

    public CustCommand(){

    }

    public void showCustomerCommands() {
        System.out.println("Welcome! Commands:");
        for (int i = 0; i < cuscmd.length; i++) {
            System.out.println(cuscmd[i]);
        }
    }

}
