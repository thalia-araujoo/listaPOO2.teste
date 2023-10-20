/*Faça um programa que:
  - Leia a cotação do dólar
  - Leia um valor em dólares
  - Converta esse valor para Real
  - Mostre o resultado */

  import java.util.Scanner;

class ConversorDolarReal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();

        System.out.print("Digite o valor em dólares: ");
        double valorDolar = scanner.nextDouble();

        double valorReal = valorDolar * cotacaoDolar;

        System.out.println("Valor em dólares: $" + valorDolar);
        System.out.println("Cotação do dólar: R$" + cotacaoDolar);
        System.out.println("Valor em reais: R$" + valorReal);

        scanner.close();
    }
}

