import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Player1 player = new Player1();
        Player1 player2 = new Player1();


        System.out.println("new value " + player.attackRandom);

        while (player.health >= 0){
            Scanner myScanner = new Scanner(System.in);
            System.out.println("press a to attack" );
            String svar = myScanner.nextLine();


            if (svar.equals("a")) {
                player.health -= player.attackRandom;
                System.out.println("HP: " + player.health);
                System.out.println("do you want to hit again?");

            }
        }

        System.out.println("You won!!!");


    }
}