package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome! Commands:" + '\n' + "1 - Customer" + '\n' + "2 - Service");
        Scanner in = new Scanner(System.in);
        Customer cust= new Customer();
        int option = -1;
        option = in.nextInt();
        do{
            switch (option) {
                case 1:
                   CustCommand cmd= new CustCommand();
                   cmd.showCustomerCommands();
                    option = in.nextInt();
                    switch (option){
                        case 1:
                            cust.showCustomer();
                            break;
                        case 2:
                            try {
                                cust.addCustomer();
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                            break;
                        case 3:
                            cust.editCustomer();
                            break;
                        case 4:
                            cust.deleteCustomer();
                            break;
                        default:
                            System.out.println("Incorrect command!");
                    }
                    break;
                    case 2:
                    Service srv = new Service();
                    System.out.println("1. Show services" + '\n' + "2. Choose service" + '\n' + "0. Exit");
                    Scanner in2 = new Scanner(System.in);
                    option = in2.nextInt();
                    switch (option){
                        case 1:
                            srv.showServices();
                            break;
                        case 2:
                            srv.chooseService();
                            break;
                        default:
                            System.out.println("Incorrect command!");
                            break;
                    }
                    break;
            }
        } while(option!=0);

    }
}
