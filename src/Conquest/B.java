package Conquest;

import java.util.Scanner;

public class B {
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int tamanho = entrada.nextInt();
        int[] valores = new int[tamanho];
        int contador = 0;
        for (int i = 0; i < tamanho; i++) {
            valores[i] = entrada.nextInt();
        }
        for (int i = 1; i < tamanho; i++) {
            if (valores[i] > valores[i-1]) {
                System.out.print(valores[i]);
                System.out.print(' ');
            }
            else contador++;
        }
        for(int i=0;i<=contador;i++){
            System.out.print('*');
            System.out.print(' ');
        }
    }
}
