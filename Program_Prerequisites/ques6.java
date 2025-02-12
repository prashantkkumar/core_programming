// 1. Calculate Simple Interest

import java.util.*;
public class ques6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle = ");
        int principle = sc.nextInt();
        System.out.println("Enter the rate = ");
        int rate = sc.nextInt();
        System.out.println("Enter the time = ");
        int time = sc.nextInt();

        int SI = (principle*rate*time)/100;
        System.out.println("Simple Interest is = "+SI);
    }
}
