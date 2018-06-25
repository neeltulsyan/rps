 import java.util.Scanner;
public class rockPaperScissors
{
    public static int playerChoice=0;
    public static Scanner input=new Scanner(System.in);
    public static int computerChoice=0;
    public static void main(String[] args)
    {
        clear();
        explainRules();
        for(int i=0;i<10;i++)
        {
            run();
        }
    }

    public static void run()
    {
        userChoice();
        wait(1000);
        cpuChoice();
        wait(1000);
        outcome();
        wait(1000);
    }

    public static void explainRules()
    {
        System.out.println("Welcome to Rock, Paper, Scissors!  You will face the computer in a game of RPS!");
        wait(1000);
        System.out.println("Rock beats Scissors");
        wait(1000);
        System.out.println("Scissors beats Paper");
        wait(1000);
        System.out.println("Paper beats Rock");
    }

    public static void userChoice()
    {
        boolean correctResponse=false;

        while(correctResponse==false)
        {
            System.out.println("Enter your choice (1 for rock, 2 for paper, 3 for scissors).");
            
            try
            {
                playerChoice=input.nextInt();
                correctResponse=true;
            }
            catch(Exception e)
            {
                System.out.println("Sorry you must enter 1, 2, or 3!");
            }
        }

        if(playerChoice==1)
        {
            System.out.println("The player chose rock!");
        }
        else if(playerChoice==2)
        {
            System.out.println("The player chose paper!");
        }
        else if(playerChoice==3)
        {
            System.out.println("The player chose scissors!");
        }
        else
        {
            System.out.println("Sorry you must enter 1, 2, or 3!");
            userChoice();
        }
    }

    public static void cpuChoice()
    {
        computerChoice=random(1, 3);
        if(computerChoice==1)
        {
            System.out.println("The computer chose rock!");
        }
        else if(computerChoice==2)
        {
            System.out.println("The computer chose paper!");
        }
        else
        {
            System.out.println("The computer chose scissors!");
        }

    }

    public static void outcome()
    {
        System.out.println(". . .");
        wait(2000);
        if(playerChoice==1&&computerChoice==3 || playerChoice==2 && computerChoice==1 || playerChoice==3 && computerChoice==2)
        {
            System.out.println("You won!!");
        }
        else if(playerChoice==computerChoice)
        {
            System.out.println("Tie!");
        }
        else
        {
            System.out.println("Sorry, the computer won!");
        }
    }

    public static int random(int min, int max)
    {
        int range = (max - min) + 1;     
        int r =(int)(Math.random() * range) + min;
        return r;
    }

    public static void clear()
    {
        System.out.print("\f");
    }

    public static void wait(int t)
    {
        try
        {
            Thread.sleep(t);
        }
        catch(Exception e)
        {

        }
    }
}