package ES_1;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello ES_1 !");

// LOG esercizio 1 richiesta 1
        //log del metodo stringaPariDispari
        String name = "ciao";
        System.out.println("la lunghezza della stringa " + name + " è pari? " + stringaPariDispari("ciao"));
//LOG esercizio 1 richiesta 2
        int annoFornito = 2024;
        System.out.println("l'anno " + annoFornito + " è bisestile? " + annoBisestile(annoFornito));
//LOG esercizio 1 richiesta 3
    }

    // esercizio 1 richiesta 1
    public static boolean stringaPariDispari(String stringa) {
        if (stringa.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    // esercizio 1 richiesta 2
    // verifica se un anno è bisestile

    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0) {
            if (anno % 100 == 0) {
                if (anno % 400 == 0) {
                    return true; // è divisibile per 400
                } else {
                    return false; // non è divisibile per 400 ma si per 100
                }
            } else {
                return true; // non è divisibile per 100 ma si per 4
            }
        } else {
            return false; // non è divisibile per 4
        }
    }

}