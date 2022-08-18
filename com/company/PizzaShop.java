package com.company;
import java.util.*;

public class PizzaShop {
    public static void main(String[] args) {
	// write your code here
        int finput;
        System.out.println("*******************************************"+
                           "\nWelcome to Josie's Pizza of West Chester!"+
                           "\n*******************************************");

        System.out.println("\n\nSpeacialty Pizza Menu"+
                "\n!1) Meat Lovers"+
                "\n2) Vegetarian"+
                "\n3) Hawaiian"+
                "\n4) Philly Steak"+
                "\n5) BBQ Chicken"+
                "\n6) Exit Menu"+
                "\n\nYour Choice (1-6)?");
        Scanner sc=new Scanner(System.in);

        finput=sc.nextInt();

        if (finput<5){
            System.out.println("\n*******************************************"+
                    "\nAvailabe Sizes and Prices"+
                    "\n1) 10'' Personal    - $10.00"+
                    "\n2) 14'' Medium      - $14.50"+
                    "\n3) 16'' Large       - $19.00"+
                    "\n4) 18'' Extra Large - $23.50"+

            "\n\nYour choice (1-4)?" );}


            else{
                System.out.println("nooo");}

        }
    }

