package Conquest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class C {
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        String passKey = entrada.nextLine();
        int qtdFrases = entrada.nextInt();
        ArrayList frases = new ArrayList();
        entrada.nextLine(); //retira o erro de buffer

        //entrada de frases
        for (int i = 0; i < qtdFrases; i++) {
            frases.add(entrada.nextLine());
        }

        Iterator<String> frasesCruas = frases.iterator();
        ArrayList frasesProntas = new ArrayList();
        while (frasesCruas.hasNext()) {
            frasesProntas.add(vigenereCifer(frasesCruas.next(), passKey));
        }


        //presentation
        Iterator<String> apresentacao = frasesProntas.iterator();
        while (apresentacao.hasNext()) {
            System.out.println(apresentacao.next());
        }
    }

    public static String vigenereCifer(String text, String key) {
        String fraseRetorno = "";
        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int z;
            if(i==0) z=1;
            else z=i;
            if (c == ' ') {
                fraseRetorno += ' ';
                continue;
            } else if ((i == 0 || text.charAt(z - 1) == ' ') && (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                for (; text.charAt(i) != ' '; i++) {

                }
                continue;
            }
            if (c < 'a' || c > 'z') {
                continue;
            }
            fraseRetorno += (char) ((c + key.charAt(j) - 2 * 'a') % 26 + 'a');
            j = ++j % key.length();
        }
        return fraseRetorno;
    }

    public static int getCharValue(char charactere) {
        switch (charactere) {
            case 'a':
                return 1;
            case 'b':
                return 2;
            case 'c':
                return 3;
            case 'd':
                return 4;
            case 'e':
                return 5;
            case 'f':
                return 6;
            case 'g':
                return 7;
            case 'h':
                return 8;
            case 'i':
                return 9;
            case 'j':
                return 10;
            case 'k':
                return 11;
            case 'l':
                return 12;
            case 'm':
                return 13;
            case 'n':
                return 14;
            case 'o':
                return 15;
            case 'p':
                return 16;
            case 'q':
                return 17;
            case 'r':
                return 18;
            case 's':
                return 19;
            case 't':
                return 20;
            case 'u':
                return 21;
            case 'v':
                return 22;
            case 'w':
                return 23;
            case 'x':
                return 24;
            case 'y':
                return 25;
            case 'z':
                return 26;
            default:
                return 0;
        }
    }
}
