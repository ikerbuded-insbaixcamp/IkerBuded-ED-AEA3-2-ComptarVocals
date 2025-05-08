import java.util.Scanner;

public class ComptarVocals {
    public static void main(String[] args) {
        // Pas 1: llegir l'entrada
        System.out.println("Please, insert the message:");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        in.close();

        // Pas 2: inicialitzem comptadors
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        // ÚNIC bucle amb índex per comptar totes les vocals (incloses les accentuades)
        char[] ch = input.toLowerCase().toCharArray();
        for (int k = 0; k < ch.length; k++) {
            char c = ch[k];
            switch (c) {
                // Variants de 'a'
                case 'a': case 'à': case 'á':
                    a++; break;
                // Variants de 'e'
                case 'e': case 'è': case 'é':
                    e++; break;
                // Variants de 'i'
                case 'i': case 'í': case 'ï':
                    i++; break;
                // Variants de 'o'
                case 'o': case 'ò': case 'ó':
                    o++; break;
                // Variants de 'u'
                case 'u': case 'ú': case 'ü':
                    u++; break;
                default: break;
            }
        }

        // Pas 3: imprimir resultats
        System.out.println(String.format("Amount of 'a': %d", a));
        System.out.println(String.format("Amount of 'e': %d", e));
        System.out.println(String.format("Amount of 'i': %d", i));
        System.out.println(String.format("Amount of 'o': %d", o));
        System.out.println(String.format("Amount of 'u': %d", u));
        System.out.println(String.format("Total amount of vowels: %d", a + e + i + o + u));
    }
}
