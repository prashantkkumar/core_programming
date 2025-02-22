package week1_ExtraQuestions2;

import java.util.Scanner;

public class Calculator {
    public static double add(double a, double b) { 
    	return a + b; 
    }
    
    
    public static double subtract(double a, double b) { 
    	return a - b; 
    	
    }
    

    public static double multiply(double a, double b) { 
    	return a * b; 
    	
    }
    
    
    public static double divide(double a, double b) { 
    	return a / b;
    	
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        
        System.out.print("Choose operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double result;
        
        switch (op) {
            case '+': 
            	result = add(num1, num2); 
            	break;
            	
            case '-':
            	result = subtract(num1, num2); 
            	break;
            	
            case '*': 
            	result = multiply(num1, num2); 
            	break;
            	
            case '/': 
            	result = divide(num1, num2); 
            	break;
            	
            default: 
                System.out.println("Invalid operation!");
                return;
        }

        System.out.println("Result: " + result);
    }
}


