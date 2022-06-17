package com.company;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Customer   {
    private int cus_id = 1;
    private static int icount=0;
    private String firstName;
    private String lastName;
    private Car car;

    private ObjectMapper objmap = new ObjectMapper();

    private ArrayList<String> cus = new ArrayList<String>();
    private ListIterator li = null;
    private File file = new File("data");
    //private FileWriter writer;
    public Customer()  {
        this.cus_id = icount++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.car=car;
    }

    public Customer(int cus_id, String firstName, String lastName, Car car) {
        this.cus_id = icount++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.car = car;
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getCus_id() {
        return cus_id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id= " + cus_id + '\'' +
                "firstName='" + firstName + '\'' +
                ",lastName='" + lastName + '\'' +
                ",car=" + car +
                '}';
    }

    public void setCus_id(int cus_id) {
        this.cus_id = cus_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void showCustomer(){
        Scanner in = null;
        try {
            in = new Scanner(Paths.get("data.txt"), "UTF-8");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        while(in.hasNextLine()){
            System.out.println(in.nextLine());

        }
    }

    public void addCustomer() throws IOException {
        Scanner in2 = new Scanner(System.in);
        String result;
        System.out.println("Enter how many customers do you want to add?");
        int n = in2.nextInt();
        for (int i=0;i<n;i++){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter ID of customer?");
            int empid= in2.nextInt();
            System.out.println("Enter customer fist name?");
            String firstName = s.nextLine();
            System.out.println("Enter customer last name?");
            String lastName = s.nextLine();
            cus.add(new ObjectMapper().writeValueAsString(new Customer(empid, firstName, lastName, new Car())));
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter("data.txt", true)));
            writer.println(String.valueOf(cus));
            System.out.println("Your data has been inserted successfully!!!");
            writer.close();
        }

    }

    public void editCustomer(){
        System.out.println("Enter ID of customer to update data?");
        Scanner s = new Scanner(System.in);
        int custid = s.nextInt();

    }

    public void deleteCustomer(){
        System.out.println("Enter ID of customer to edit?");
        Scanner s= new Scanner(System.in);
        int custid = s.nextInt();
        li = cus.listIterator();
        while(li.hasNext()){
            Customer cus = (Customer)li.next();
            if(cus.cus_id ==  custid){
                li.remove();
                System.out.println("Customer with the ID: " + custid + "has been deleted successfully!");
            }
        }
    }
}
