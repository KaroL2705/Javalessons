public class OperatoryArytmetyczne {
    public static void main (String[] args){
        /*
            OPERATORY ARYTMRTYCZNE

            Służą do operawnia na zmiennych

            "+" dodawanie
            "-" odejmowanie
            "*" mnożenie
            "/" dzielenie

            "=" przypisanie wartości
            "+="
            "-="
            "/="
            "*="
            "%="

            "%" reszta z dzielenia (tzw. modulo)

            ++ inkrementacja
            -- dekrementacja

            y++ post inkrementacja
            y-- post dekrementacja

            ++y pre inkrementacja
            --y pre dekrementacja
         */

        int a= 5;
        a +=2;
        System.out.println(a);
        int b= 10%3;
        System.out.println(b);

        int c= 10;
        System.out.println(c++);
        System.out.println(c--);
        System.out.println(--c);

    }

}
