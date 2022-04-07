public class OperatoryLogiczne {
    public static void main(String[] args) {
        /*
            OPERATORY LOGICZNE
            TRUE/FALSE

            ! - negacja
            !(true) - false
            !(false) - true

            && - koniunkcja (w tym samym momencie)
            true true - true
            true false - false
            false true - false
            false false - false

            || alternatywa (czyli to albo to)
            true true - true
            true false - true
            false true - true
            false false - false

         */

        int a = 5;
        int b = 5;
        int c = 6;

        if (a == b)
            System.out.println("tak");

        if (!(a == b))
            System.out.println("tak");

    }
}
