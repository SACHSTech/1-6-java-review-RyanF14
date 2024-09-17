package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;

public class Review6{
    public static void main(String[] args) throws IOException {
         BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
         double Total = 0;
         double add;
         double breaker = 0;
         double Tax;
         double Subtotal = 0;
         DecimalFormat df = new DecimalFormat("0.00");
         while(breaker != 256){
            System.out.print("Enter the price for an item: ");
            add = Double.parseDouble(keyboard.readLine());
            if(add != 0){
                Subtotal += add;
            }
            else if(add == 0){
                break;
            }
           
            
        }
        System.out.print("Subtotal: $");
        System.out.println(df.format(Subtotal));
        Tax = (Subtotal*0.13);
        Total = Subtotal + Tax;
        System.out.print("Tax: $");
        System.out.println(df.format(Tax));
        System.out.print("Total: $");
        System.out.println(df.format(Total));
    }
}