package ES_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello es4");

        Scanner scanner = new Scanner(System.in);
        //chiediamo all'utente di inserire un numero intero e avviamo lo scanner
        System.out.println("inserisci un numero intero per iniziare il conto alla rovescia: ");
        int numero = scanner.nextInt();

        //ciclo for per il conto alla rovescia
        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
        }
        //mex fine programma + chiusura scanner
        System.out.println("conto alla rovescia terminata.");
        scanner.close();
    }
}
