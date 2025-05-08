import java.util.Scanner;

public class ComptarVocals {
    public static void main(String[] args) {
        // Pas 1: llegir l'entrada de l'usuari
        System.out.println("Please, insert the message:");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        in.close();

        // Pas 2: comptar les 'a' (també à, á)
        int a = 0;
        char[] ch = input.toLowerCase().toCharArray();
        for (int k = 0; k < ch.length; k++)
            if (ch[k] == 'a' || ch[k] == 'à' || ch[k] == 'á') a++;

        // Pas 3: comptar les 'e' (també è, é)
        int e = 0;
        ch = input.toLowerCase().toCharArray();
        for (int k = 0; k < ch.length; k++)
            if (ch[k] == 'e' || ch[k] == 'è' || ch[k] == 'é') e++;

        // Pas 4: comptar les 'i' (també í, ï)
        int i = 0;
        ch = input.toLowerCase().toCharArray();
        for (int k = 0; k < ch.length; k++)
            if (ch[k] == 'i' || ch[k] == 'í' || ch[k] == 'ï') i++;

        // Pas 5: comptar les 'o' (també ò, ó)
        int o = 0;
        ch = input.toLowerCase().toCharArray();
        for (int k = 0; k < ch.length; k++)
            if (ch[k] == 'o' || ch[k] == 'ò' || ch[k] == 'ó') o++;

        // Pas 6: comptar les 'u' (també ú, ü)
        int u = 0;
        ch = input.toLowerCase().toCharArray();
        for (int k = 0; k < ch.length; k++)
            if (ch[k] == 'u' || ch[k] == 'ú' || ch[k] == 'ü') u++;

        // Pas 7: mostrar els resultats
        System.out.println(String.format("Amount of 'a': %d", a));
        System.out.println(String.format("Amount of 'e': %d", e));
        System.out.println(String.format("Amount of 'i': %d", i));
        System.out.println(String.format("Amount of 'o': %d", o));
        System.out.println(String.format("Amount of 'u': %d", u));
        System.out.println(String.format("Total amount of vowels: %d", a + e + i + o + u));
    }
}
