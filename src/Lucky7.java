
import java.util.*;

public class Lucky7 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        int randNum1 = random.nextInt(11);
        int randNum2 = random.nextInt(11);
        int randNum3 = random.nextInt(11);
        System.out.printf("%d %d %d \n",randNum1,randNum2,randNum3);
        int LuckyNum = 7;

        if(randNum1 == LuckyNum || randNum2 == LuckyNum || randNum3 == LuckyNum){
            System.out.println("You won");
        }
        else 
            System.out.println("You lost");
        
    }
}
