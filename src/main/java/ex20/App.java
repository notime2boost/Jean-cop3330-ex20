package ex20;

import java.text.NumberFormat;
import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Jean
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();

        System.out.println("What is the order amount?");
        double subtotal = input.nextDouble();
        System.out.println("What state do you live in?");
        String state = input.next();
        System.out.println("What county do you live in?");
        String county = input.next();

        if(state.equals("Wisconsin")){
            double tax = 0.05 * subtotal;
            if(county.equals("Eau Claire")){
                tax += 0.005;
                System.out.println("The tax is "+defaultFormat.format(tax));
            }
            if(county.equals("Dunn")){
                tax+= 0.004;
                System.out.println("The tax is "+defaultFormat.format(tax));
            }
            double total = tax + subtotal;
            System.out.println("The total is  "+defaultFormat.format(total));
        }

    }
}
