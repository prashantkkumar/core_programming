// 3. Power Calculation

import java.util.*;

public class ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base = ");
        int base = sc.nextInt();
        System.out.println("Enter the exponent = ");
        int expo = sc.nextInt();

        int res = (int)Math.pow(base, expo);
        System.out.println("The result is = "+res);
    }
}
