package ES_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello ES_2 !");


        //LOG Esercizio 2 richiesta 1
        System.out.print("inserisci un numero intero compreso tra 0-3: ");
        int numero = Integer.parseInt(scanner.nextLine());

        switch (numero) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Due");
                break;
            case 3:
                System.out.println("Tre");
                break;
            default:
                System.out.println("Errore: numero fuori range, Inserisci un numero compreso tra 0 e 3.");
        }
        scanner.close();
    }


}
