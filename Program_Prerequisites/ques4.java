// 4. Area of a Circle

import java.util.*;

public class ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius as input = ");
        double r = sc.nextInt();
        
        double area = 3.14* Math.pow(r,2);
        System.out.println("The area of the circle is = "+area);
    }
}
