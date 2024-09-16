package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;
public class Review4{
    public static void main(String[] args) throws NumberFormatException, IOException {
        double Subtotal = 0.00;
        double Total;
        double Tax;
        double input;
        DecimalFormat df = new DecimalFormat("0.00");
        int loop;
        System.out.print("How many items do you want to buy? ");
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        loop = Integer.parseInt(keyboard.readLine());
        for(int i = 0; i < loop; i++){
            System.out.print("Enter the price for item " + (i + 1) + ": ");
            input = Double.parseDouble(keyboard.readLine());
            Subtotal += input;
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