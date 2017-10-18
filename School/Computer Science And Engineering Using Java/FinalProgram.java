package finalprogram;

import java.util.Scanner;
import java.util.Random;

public class FinalProgram {

    public static void main(String[] args) {
        System.out.println("MATH BLASTER v0.1");
        System.out.println("Input Your Answer And Hit Enter To Confirm Answer.");
        Math();
    }
    
    public static void Math(){
        int Round,Score;
        int x,y,z;
        int q0,q1,q2,q3,q4,q5,q6,q7,q8,q9;
        Round = 1;
        Score = 0;
        while(Round <= 100){
            // Number Randomiser, Each round has it's own unique set of numbers.
            Random rand = new Random();
            int n1 = rand.nextInt(33) + 1;
            int n2 = rand.nextInt(66) + 34;
            int n3 = rand.nextInt(99) + 67;
            x = n1;
            y = n2;
            z = n3;
            
            
            // Structure [Array] of Questions
            String[] Questions;
            Questions = new String[10];
            Questions[0] = x + " + " + y;
            Questions[1] = y + " + " + x;
            Questions[2] = x + " - " + y;
            Questions[3] = y + " - " + x;
            Questions[4] = x + " * " + y;
            Questions[5] = y + " * " + x;
            Questions[6] = x + " / " + y;
            Questions[7] = y + " / " + x;
            Questions[8] = x + " + " + y + " - " + z + "     !WORTH 3 POINTS!";
            Questions[9] = x + " * " + y + " / " + z + "     !WORTH 3 POINTS!";
                  
            q0 = x + y;
            q1 = y + x;
            q2 = x - y;
            q3 = y - x;
            q4 = x * y;
            q5 = y * x;
            q6 = x / y;
            q7 = y / x;
            q8 = x + y - z;
            q9 = x * y / z;
            
            // Question and Answer
            skip();
            System.out.println("Current Score: " + Score + " Current Round: " + Round);
            skip();
            String CurQ = getRndq(Questions);
            System.out.print("Question: " + CurQ);
            Scanner answer = new Scanner(System.in);
            skip();
            System.out.println("Your Answer: ");
            int Ans = answer.nextInt();
            skip();
            skip();
            skip();
            skip();
            
            // Checker ***NOTE*** It may equal a different question and give you a point even if it was wrong. Inputting '0' will count it right most of the time
            if(Ans == q0){
                System.out.println("The Answer Was Correct! You Earned 1 Point!");
                Score++;
            }else if(Ans == q1){
                System.out.println("The Answer Was Correct! You Earned 1 Point!");
                Score++;
            }else if(Ans == q2){
                System.out.println("The Answer Was Correct! You Earned 1 Point!");
                Score++;
            }else if(Ans == q3){
                System.out.println("The Answer Was Correct! You Earned 1 Point!");
                Score++;
            }else if(Ans == q4){
                System.out.println("The Answer Was Correct! You Earned 1 Point!");
                Score++;
            }else if(Ans == q5){
                System.out.println("The Answer Was Correct! You Earned 1 Point!");
                Score++;
            }else if(Ans == q6){
                System.out.println("The Answer Was Correct! You Earned 1 Point!");
                Score++;
            }else if(Ans == q7){
                System.out.println("The Answer Was Correct! You Earned 1 Point!");
                Score++;
            }else if(Ans == q8){
                System.out.println("The Answer Was Correct! You Earned 3 Points!");
                Score++;
                Score++;
                Score++;
            }else if(Ans == q9){
                System.out.println("The Answer Was Correct! You Earned 3 Points!");
                Score++;
                Score++;
                Score++;
            }else{
                gameOver(Score,Round);
            }
            // Game goes up to 100 Rounds
            Round++;
        }
    }
    
    public static String getRndq(String[] array){
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }
    
    public static void gameOver(int scr, int rnd){
        skip();
        skip();
        skip();
        skip();
        skip();
        System.out.println("GAME OVER");
        System.out.println("Your Score: " + scr);
        System.out.println("Rounds Survived: " + rnd);
        System.exit(0);
    }
    
    public static void skip(){
        System.out.println();
    }
}
