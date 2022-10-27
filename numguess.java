// NAME:Khivansara bhakti rakesh
// JAVA PROGRAMMING 
// TASK:TASK_2




import java.util.*;
public class numguess {
    public static void Num_Guess()
    {

        Scanner sc = new Scanner(System.in);
        int num=(int)(100*Math.random());                                              //it will select random number
        int rounds=5;
        int guess,i,again,score=0;

        System.out.println("Hello!! Welcome to the Number Guessing game..");
        System.out.println("Input a number between 1 to 100");


        for(i=0;i<5;i++) {
            System.out.println("\n Try to Guess a number..");
            guess=sc.nextInt();



            if(guess>100 || guess<0) {
                System.out.println("Sorry!! You have to enter only number between 1 to 100");
            }
            else if(guess==num)
            {
                System.out.println("Congrats!! You guessed right");
                score+=10;
                System.out.println("Your score is "+score);
                break;
            }
            else if (guess>num && i!=rounds-1) {
                System.out.println("Oops! Number is less than"+guess);
            }
            else if(guess<num && i!=rounds-1) {
                System.out.println("Oops! Number is greater than"+guess);
            }
        }

        if(rounds==i) {
            System.out.println("\n You have Completed round");
            System.out.println("\n The number is "+num);
            System.out.println("\n\n Do you want to continue..");
            System.out.println("Enter 1 for continue...");
            again=sc.nextInt();


            if(again==1) {
                Num_Guess();
            }
            else {
                System.out.println("Thank You!! See You Again....");
            }
        }
        sc.close();
    }
    public static void main(String[] args) {
        Num_Guess();
    }
}