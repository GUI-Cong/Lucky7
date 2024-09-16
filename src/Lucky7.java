
import java.util.*;

public class Lucky7 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();
        
        //System.out.printf("%d %d %d \n",randNum1,randNum2,randNum3);
        int LuckyNum = 7;
        System.out.println("How much do you want to spend money?");
        Scanner in = new Scanner(System.in);
        int endMoney = 0;
        String answer = "";
        for(endMoney=in.nextInt();endMoney>0 && endMoney < 100;answer.equals("yes")){
            int randNum1 = random.nextInt(11);
            int randNum2 = random.nextInt(11);
            int randNum3 = random.nextInt(11);
            System.out.printf("%d %d %d \n",randNum1,randNum2,randNum3);
            endMoney--;
            if(randNum1 == LuckyNum && randNum2 == LuckyNum && randNum3 == LuckyNum){
                endMoney+=10;
            }else if(randNum1 != LuckyNum && randNum2 != LuckyNum && randNum3 != LuckyNum){
                endMoney+=0;
            }else if(randNum2 == LuckyNum && randNum1 != LuckyNum && randNum3 != LuckyNum){
                endMoney+=3;
            }else if(randNum3 == LuckyNum && randNum1 != LuckyNum && randNum2 != LuckyNum){
                endMoney+=3;
            }else if(randNum1 == LuckyNum && randNum2 != LuckyNum && randNum3 != LuckyNum){
                endMoney+=3;
            }else
                endMoney+=5; 
            System.out.println("If you want to play again? Yes or No");
            answer = in.next();
            if(answer.equals("no")){
                break;
            }
        }
        if(endMoney >= 100){
            System.out.println("You won!");
        }
        else if(endMoney == 0){
            System.out.println("You lost.");
        }
    }
}
