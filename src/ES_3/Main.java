package ES_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hello esercizio 3");
        //log esercizio 3
        String stringa = "";
        while (!stringa.equals(":q")) {
            System.out.println("Inserisci una stringa (o ':q' per uscire): ");
            stringa = scanner.nextLine();

            if (!stringa.equals(":q")) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < stringa.length(); i++) {
                    sb.append(stringa.charAt(i));
                    if (i < stringa.length() - 1) {
                        sb.append(", ");
                    }
                }
                System.out.println(sb.toString());
            }
        }
        System.out.println("finsh program");
        scanner.close();

    }


}
