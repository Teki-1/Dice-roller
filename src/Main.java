import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);


        Random random = new Random();

        int numOfDice;
        int total=0;

        System.out.println("Enter no. of dice you want to roll:");
        numOfDice=scanner.nextInt();
        if (numOfDice>0){
            System.out.println("Rolling dice!");
            for (int i =0; i<numOfDice; i++){
                int roll= random.nextInt(1,7);
                DiceArt(roll);
                System.out.println("You rolled a "+ roll);
                total+=roll;
            }
            System.out.println("Total dice roll is: "+ total);
        }
        else{
            System.out.println("Number must be higher than 0");
        }
        scanner.close();
    }
    static void DiceArt(int roll){
        String dice1= """
                 --------
                |        |
                |   ●    |
                |        |
                 --------
                """;
        String dice2= """
                 --------
                | ●      |
                |        |
                |      ● |
                 --------
                """;
        String dice3= """
                 --------
                | ●      |
                |   ●    |
                |      ● |
                 --------
                """;
        String dice4= """
                 --------
                | ●    ● |
                |        |
                | ●    ● |
                 --------
                """;
        String dice5= """
                 --------
                | ●    ● |
                |   ●    |
                | ●    ● |
                 --------
                """;
        String dice6= """
                 --------
                | ●    ● |
                | ●    ● |
                | ●    ● |
                 --------
                """;
        switch(roll){
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);

            default -> System.out.println("Invalid roll");
        }

    }

}
