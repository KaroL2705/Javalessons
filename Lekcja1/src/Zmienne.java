public class Zmienne {
    public static void main(String [] args){
        /*
            Typy zmiennych liczbowych:
                - int- 32 bit- od -2^31 do 2^31-1
                - long- 64 bit- od -2^63 do 2^63-1
                - short- 16 bit od -32,768 do 32,767
                - byte- 8 bit od -128 do 127
         */
        int a= 10;
        long b= 1234567890L;
        short c= 15000;
        byte d= 100;

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);

        /*
            Zmienne znakowe:
            - char - 2 bajtowy
         */

        char znak= 'g';
        System.out.println(znak);


        //Zmienna string (pisemna, tekstowa)
        String e= "To jest test";

            System.out.println(e);

        String imie= "Karol";
        String nazwisko="Świercz";

            System.out.println("Imię: " + imie + " Nzawisko: " + nazwisko );


        /*
            Zmiennie zmiennoprzecinkowe
                - float- 32 bit- od 1,4 *10^-45 do 3,4*10^138
                - double- 64 bit- od 4,9*10^-324 do 1,8*10^308
         */

        double liczba2= 4.67;
        float liczba3= 4.57f;

        System.out.println(liczba2);
        System.out.println(liczba3);


        /*
            Jak nazywać zmienne?
                - wielkość liter ma znaczenie
                - powinno sie zaczynac z małą literą
                - jesli dwuczłonowe zapisywane pierwszy człon z małej a drugi z dużej np. String daneOsobowe= ...
                - nie można używać key wordów np. public
                - nie można zacząć rozpoczynać nazwy od liczby
                - nie wolno korzystać ze spacji
                - monżna natomiast rozpocząć od podkreślinika (używa się go do stałych)
                - zmienne stałe zapisuje sie z final

         */
        final double LICZBA_PI= 3.14;
        System.out.println(LICZBA_PI);
    }
}
