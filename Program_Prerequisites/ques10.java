// 5. Convert Kilometers to Miles


import java.util.*;

public class ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the km  = ");
        double km = sc.nextDouble();

        double miles = km*0.621371;
        System.out.println("Miles = "+miles);
    }
}
