/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Muhtasim Kopot
 */
public class Calculator {
    
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("____Simple Calculator____");
    System.out.println("Enter yur choise:");
    System.out.println("Addition");
    System.out.println("Substraction");
    System.out.println("Multiplication");
    System.out.println("Divition");
    int first = sc.nextInt();
    System.out.println("Enter the first number: ");
    int a = sc.nextInt();
    System.out.println("Enter the second number: ");
    int b  = sc.nextInt();
    
    double result = 0;
    switch(first){
        case 1:
            result = a+b;
            break;
        case 2:
            result = a-b;
            break;
        case 3:
            result = a*b;
            break;
        case 4:
            if(b==0){
            System.out.print("Sorry! Divition is not possible");
            break;
            }
            else{
                result = a/b;
                break;
            }
        default:
            System.out.println("You have entered a wrong choice");
    
    }
   
   System.out.println("Your result is: "+result);
    
        // TODO code application logic here
    }
    
}
