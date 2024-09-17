package gr11review.part1;
import java.io.*;
import java.text.DecimalFormat;
public class Review5{
    public static void main(String[] args) throws NumberFormatException, IOException {
        DecimalFormat df = new DecimalFormat("##.##");
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        int invested;
        double compoundRate;
        int targetAmount;
        int years;
        double finaltotal;
        double total = 0;
        double compound;
        double hack = 7;
        int i = 0;
        System.out.print("Enter the yearly invested amount:");
        invested = Integer.parseInt(keyboard.readLine());
        //System.out.println(" ");
        System.out.print(" Enter the compound interest rate:");
        compoundRate = Double.parseDouble(keyboard.readLine());
        compoundRate =  compoundRate/100;
        //System.out.println(" ");
        System.out.print(" Enter the target amount:");
        targetAmount = Integer.parseInt(keyboard.readLine());
        //System.out.println(" ");
        while(total < targetAmount){
            total = total + invested*(Math.pow(1+compoundRate,i));
            
            //total =  finaltotal;

            //System.out.println(total);
            
            //System.out.println(total);
            
            //System.out.println(total);
            i++;
        }
        if(i==8){
            System.out.println(" The target amount will be earned in " + (i-1) + " years.");
        }
        else{
            System.out.println(" The target amount will be earned in " + (i) + " years.");
        }
        
        
        //else{System.out.println(" The target amount will be earned in " + (i-1) + " years.");}
    }
}