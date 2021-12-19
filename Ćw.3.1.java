import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj Imię");
        String imię = scan.next();
        System.out.println("Podaj Nazwisko");
        String nazwisko = scan.next();
        System.out.println("Podaj wiek");
        String wiek = scan.next();
        System.out.println("Podaj numer indexu");
        String index = scan.next();

        System.out.println(imię+" "+nazwisko+" "+wiek+" "+index+" ");

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
         *   a) Imię, nazwisko, wiek, nr indeksu,
         *   dane mają być wprowadzane z klawiatury w konsoli
         *   b) wyświetlić dane za pomocą println i printf
         */
 }
}
