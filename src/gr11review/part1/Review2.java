package gr11review.part1;
import java.io.*;

public class Review2{
    public static void main(String[] args) throws NumberFormatException, IOException {
        int joke;
        BufferedReader Keyboard = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("0 - print a joke about hair");
        System.out.println("1 - print a joke about feet");
        System.out.println("2 - Print a joke about clothes");
        System.out.println("3 - print a joke about teachers");
        System.out.print("Select: ");
        joke = Integer.parseInt(Keyboard.readLine());
        switch (joke) {
            case 0:
                System.out.println("you want to know the most unfortunate name?");
                System.out.println("My mother had a friend named harrison butt, he lived a hard life in high school. Nice guy though apparently");
                break;
            case 1:
                System.out.println("🤨");
                break;
            case 2:
                System.out.println("this joke will knock your socks off");
                break;
            case 3:
                System.out.println("what's the deal with teachers, am i right?");
                break;

        
            
        }

    }
}
