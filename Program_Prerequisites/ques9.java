// 4. Calculate Average of Three Numbers


import java.util.*;

public class ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number = ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number = ");
        int n2 = sc.nextInt();
        System.out.println("Enter the third number = ");
        int n3 = sc.nextInt();

        int avg = (n1+n2+n3)/3;
        System.out.println("Average of three numbers is = "+avg);


    }
}
