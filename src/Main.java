import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        scanner.close();

        Random random = new Random();

        int numOfDice;
        int total;

        System.out.println("Enter no. of dice you want to roll:");
        numOfDice=scanner.nextInt();
        if (numOfDice>0){
            System.out.println("Rolling dice!");
            for (int i =0; i<numOfDice; i++){
                int roll= random.nextInt(1,7);
                System.out.println("You rolled a "+ roll);
            }
        }
        else{
            System.out.println("Number must be higher than 0");
        }
    }

}
