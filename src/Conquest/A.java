package Conquest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        while (entrada.ready()){
            String input = entrada.readLine();
            if (input.equals("esquerda")) System.out.println("ingles");
            else if (input.equals("direita")) System.out.println("frances");
            else if (input.equals("nenhuma")) System.out.println("portugues");
            else if (input.equals("as duas")) System.out.println("caiu");
        }
    }
}
