package com.company;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    private String services[] = {"1. Oil change","2. Change wheel","3. Pumping","4. Car diagnostics","0. Exit"};
    private int servicePrice[]={2500,5000,1500,7000};
    private String date;
    private ArrayList<String> service = new ArrayList<String>();
    private ObjectMapper objmap = new ObjectMapper();
    private File file = new File("data.txt");
    public Service(String[] services, int stringPrice) {
        this.services = services;
        this.servicePrice = servicePrice;
    }
    public Service(){

    }

    public Service(String date, ArrayList<String> service) {
        this.date = date;
        this.service = service;
    }

    public void showServices(){
        for (int i=0;i<services.length;i++) {
            System.out.println(services[i]);
        }
    }



    public void chooseService() {
                System.out.println("What service do you want to choose? Type the number");
                Scanner in = new Scanner(System.in);
                String service1 = in.nextLine();
                switch (service1){
                    case "1":
                        System.out.println("Enter you car number?");
                        String carnumber = in.nextLine();
                        Boolean carnumberstatus = true;
                        if(carnumberstatus){
                            System.out.println("On what date should I record you?");

//                         SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                            date = in.nextLine();
//                            dateFormat.format(date);
                            try {
                                service.add(new ObjectMapper().writeValueAsString(new Service()));
                            } catch (JsonProcessingException e) {
                                throw new RuntimeException(e);
                            }
                            System.out.println("Your application has been accepted on date: " + date + "! Please, don't be late!"
                                    + "The total price of the service: " + servicePrice[0] + "tenge!");
                        } else {
                            System.out.println("This car doesn't exist in database!");
                        }

                    case "2":
                        System.out.println("Enter you car number?");
                        String carnumber2 = in.nextLine();
                        Boolean carnumberstatus2 = true;
                        if(carnumberstatus2){
                            System.out.println("On what date should I record you?");
                            String sdate2 = in.nextLine();
                            System.out.println("Your application has been accepted on date: " + sdate2 + "! Please, don't be late!"
                                    + "The total price of the service:"+ servicePrice[1] + "tenge!");
                        } else {
                            System.out.println("This car doesn't exist in database!");
                        }
                        break;
                    case "3":
                        System.out.println("Enter you car number?");
                        String carnumber3 = in.nextLine();
                        Boolean carnumberstatus3 = true;
                        if(carnumberstatus3){
                            System.out.println("On what date should I record you?");
                            String sdate3 = in.nextLine();
                            System.out.println("Your application has been accepted on date: " + sdate3 + "! Please, don't be late!"
                                    + "The total price of the service:" + servicePrice[2] + "tenge!");
                        } else {
                            System.out.println("This car doesn't exist in database!");
                        }
                        break;
                    case "4":
                        System.out.println("Enter you car number?");
                        String carnumber4 = in.nextLine();
                        Boolean carnumberstatus4 = true;
                        if(carnumberstatus4){
                            System.out.println("On what date should I record you?");
                            String sdate4 = in.nextLine();
                            System.out.println("Your application has been accepted on date: " + sdate4 + "! Please, don't be late!"
                                    + "The total price of the service:" + servicePrice[3] + "tenge!");
                        } else {
                            System.out.println("This car doesn't exist in database!");
                        }
                        break;
                    default:
                        System.out.println("Incorrect command!");
                }


        }
    }

