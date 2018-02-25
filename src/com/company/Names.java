package com.company;

import java.util.Arrays;
import java.util.Scanner;

//This is a program that says if you are the friend of the coder or not
//It will output a "You are so stupid" print if you are the coder's enemy
//It will output a "I wanna have a playdate with you" message if you are the coder's friend
//It will be about the coder's feeling with you.
//Coder:Top secret
public class Names {
    private static Scanner scanner = new Scanner(System.in);
    public void findName(){
        boolean quit = false;
        while (!quit){
            System.out.println("Enter your first and last name(press enter to quit the application)");
            String name1 = scanner.nextLine();
            switch (name1){

                case "":
                quit = true;
                    System.out.println("Exiting names application........");
                break;
                case "James Zeng":
                    enemy();
                    break;
                case "Arya Nuthlapati":
                    enemy();
                    break;
                case "Eli Grossman":
                    enemy();
                    break;
                case "Michael Yang":
                    friend();
                    break;

                case "james zeng":
                    enemy();
                    break;
                case "arya nuthlipati":
                    enemy();
                    break;
                case "eli grossman":
                    enemy();
                    break;
                case "michael yang":
                    friend();
                    break;

                case "Haixu Yuan"  :daddy();                break;
                case "haixu yuan"  :daddy();                break;

                case "Eric Yuan"  :daddy();                break;
                case "eric yuan"  :daddy();                break;

                case "Ya Ding"  :mommy();                break;
                case "ya ding"  :mommy();                break;

                case "Jessie Ding"  :mommy();                break;
                case "jessie ding"  :mommy();                break;


                case "Richard Liao"  :friend();                break;
                case "richard liao"  :friend();                break;

                case "Tegan Tao"  :friend();                break;
                case "tegan tao"  :friend();                break;


                case "Cynthia Liao"  :friend();                break;

                case "cynthia liao"  :friend();                break;

                case "Michael Liao":friendsParents();               break;
                case "michael liao":friendsParents();               break;

                case "Jennifer Jin":friendsParents();               break;
                case "jennifer jin":friendsParents();               break;

                case "Lei Tao":friendsParents();               break;
                case "lei tao":friendsParents();               break;

                case "Ke Wang":friendsParents();               break;
                case "ke wang":friendsParents();               break;

                case "BUTT SKIP":buttSkip();break;
                case "Butt Skip":buttSkip();break;
                case "Butt skip":buttSkip();break;
                case "butt skip":buttSkip();break;

                default:
                    normal(name1);
                    break;
            }

        }


    }




//
//        if (Arrays.asList("James Zeng","james zeng","Arya Nuthlipati","arya nuthlipati","Eli Grossman","eli grossman","Michael Yang","michael yang","Richard Liao","richard liao","Cynthia Liao","cynthia liao","Tegan Tao","tegan tao","Eric Yuan","eric yuan","Haixu Yuan","haixu yuan","Ya Ding","ya ding","Jessie Ding","jessie ding","Michael Liao","michael liao","Jennifer Jin","jennifer jin","Ke Wang","ke wang","Lei Tao","lei tao").contains(name1)){
//
//            }else {
//            normal();
//        }



    public void enemy(){

        System.out.println("You either love to eat poo and pee or you are so stupid that you make houses out of bombs and eat them and blow up and chop your own head off and kill yourself\n" +
                "And the coder is waiting to kill you stupid idiot with a gun!!!!! ");
    }
    public void friend(){
        System.out.println("I cannot wait to have a playdate with you");
    }
    public void normal(String name){

        System.out.println(name + " is a stranger to the coder or " + name + " might even be a dog or another animal");
    }

    public void daddy(){
        System.out.println("You are my daddy");
    }

    public void mommy(){
        System.out.println("You are my mommy");
    }

    public void friendsParents(){

        System.out.println("You are one of my friend's parents.I wanna book a playdate!");
    }

    public void buttSkip(){
        System.out.println("I HATE YOU SO MUCH,BUTT SKIP, AND I AM GOING TO KILL YOU AND TEAR YOU TO PIECES,BECAUSE YOU ARE THE STUPID STINKY BUTT SKIP!!!!!!!!!!!!!!!!!!!!!!!");


    }


}