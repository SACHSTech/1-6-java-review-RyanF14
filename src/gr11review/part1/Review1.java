package gr11review.part1;

import java.io.*;
import java.util.ArrayList;

public class Review1{
    static int intMonth;
    static int intDay;
    static BufferedReader Keyboard = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws NumberFormatException, IOException{
        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int total = 0;
        System.out.print("Enter the month number: ");
        intMonth = Integer.parseInt(Keyboard.readLine());
        System.out.print("Enter the day number: ");
        intDay = Integer.parseInt(Keyboard.readLine());
        for(int i = intMonth; i > 0; i--){
            total += months[i] ;
            //System.out.println(total);
        }
        total += intDay;
        System.out.println(total);
    }
}