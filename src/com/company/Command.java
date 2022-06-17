package com.company;

public class Command {
    private String commands[]={"1 - Customer", "2 - Service"};

    public Command(){

    }

    public void showCommands(){
        System.out.println("Welcome! Commands:");
        for(int i=0;i<commands.length;i++){
            System.out.println(commands[i]);
        }
    }

}
