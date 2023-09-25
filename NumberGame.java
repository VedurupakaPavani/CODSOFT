import java.util.Random;
import java.util.Scanner;
public class RandomNumber 
{
    public static void main(String[] args)
    {
        int result,guess;
        final int MAX=100;
        boolean CHOICE=false;
        Scanner number=new Scanner(System.in);
        Random rand=new Random();
        result=rand.nextInt(MAX);
     while(!CHOICE)
        {
            System.out.println("guess a number between 1 to 100");
            guess=number.nextInt();
            if(guess>result)
            {
                System.out.println("the number is high");
            }
            else if(guess<result)
            {
                System.out.println("the number is too low");
            }
            else{
                System.out.println("good job,the number is " + result);
                CHOICE=true;
            }
    }
 System.exit(0);
}
}
