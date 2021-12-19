import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int index =7;
        int wynik = (index % 2 == 0) ? 0 : 1;
        System.out.println( wynik);
        System.out.println("Podaj liczbe zmienno przecinkową");
        
        
        
        double a = scan.nextDouble();
        if (a>10)
        {
            System.out.println("Gdynia gdynia gdynia");
        }
        else {
            System.out.println("Gdańsk Gdańsk");
        }


        /* ćw.5 */

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */


        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

    }
}
