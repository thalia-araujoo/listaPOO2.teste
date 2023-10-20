//Elabore um programa que leia um número (1 a 9) e imprima
//a tabuada desse número.

import java.util.Scanner;

class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número (1 a 9): ");
        int numero = scanner.nextInt();
        
        if (numero >= 1 && numero <= 9) {
            System.out.println("Tabuada do " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        } else {
            System.out.println("Número fora do intervalo permitido.");
        }
        
        scanner.close();
    }
}
