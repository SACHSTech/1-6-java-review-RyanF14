package gr11review.part1;
import java.util.Random;    
public class Review8{
    
        public static void main(String[] args) {
            Random rand = new Random();
            int random1;
            int random2;
            int random3;
            int triples = 0;
            for(int i = 0; i < 1000; i++){
                random1 = rand.nextInt(9);
                random2 = rand.nextInt(9);
                random3 = rand.nextInt(9);
                System.out.print(random1 + " ");
                System.out.print(random2 + " ");
                System.out.println(random3);
                if(random1 == random2 && random1 ==random3 && random2 == random3){
                    triples = triples + 1;
                }
                
            }
            System.out.println(triples);
        }
}