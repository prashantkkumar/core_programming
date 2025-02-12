// 5. Volume of a Cylinder

import java.util.*;
public class ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius as input = ");
        double r = sc.nextInt();
        System.out.println("Enter the height as input = ");
        double h = sc.nextInt();
        
        double volume = 3.14* Math.pow(r,2)*h;
        System.out.println("The volume of cylinder is = "+volume);
    }
}
