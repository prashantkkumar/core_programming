// 3. Celsius to Fahrenheit Conversion

import java.util.*;;
public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        
        // Converting Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");

    }
}
