// 2. Perimeter of a Rectangle

import java.util.Scanner;

public class ques7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length as input = ");
        double len = sc.nextDouble();
        System.out.println("Enter the width as input = ");
        double wid = sc.nextDouble();

        double peri = 2*(len*wid);
        System.out.println("Perimeter of rectangle is = "+peri);
    }
}
