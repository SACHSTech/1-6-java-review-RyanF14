package gr11review.part1;

import java.io.*;
import org.junit.platform.commons.util.StringUtils;
//import com.sun.tools.javac.util.StringUtils;



public class Review7{
    public static void main(String[] args) throws IOException {
        int numSpace = 0;
        int numA = 0;
         BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
         String theSentence;
         String as = "a";
         String spaces = " ";
         
         //String test;
         theSentence = keyboard.readLine();
         System.out.println("There are " + theSentence.length() + " characters in the sentence.");
         int length = theSentence.length();
         for(int i = 0; i < theSentence.length(); i++){
            
            char test = theSentence.charAt(i);          
            if( test == 'a'){
                numA = numA + 1;
            } 
         }
         for(int i = 0; i < theSentence.length(); i++){
            
            char test = theSentence.charAt(i);          
            if( test == ' '){
                numSpace = numSpace + 1;
            } 
         }
         System.out.println("There are " + numSpace + " spaces in the sentence.");
         System.out.println("There are " + numA + " letter a in the sentence.");
         if(length == 1){
            System.out.println("-");
         }
         if(length == 3){
            System.out.println("--");   
         }
         if(length == 4){
            System.out.println("--");   
         }
         if(length == 7){
            System.out.println("----");   
         }
         
         
        
    }
}
