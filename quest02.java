//Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit
//A fórmula de conversão de temperatura a ser utilizada é F = (9 * C + 160) / 5,
//em que a variável F representa é a temperatura em graus Fahrenheit e a variável C representa a temperatura em graus Celsius.

import java.util.Scanner;

class ConversorCelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperaturaCelsius = scanner.nextDouble();

        double temperaturaFahrenheit = (9 * temperaturaCelsius + 160) / 5;

        System.out.println("A temperatura em graus Fahrenheit é: " + temperaturaFahrenheit);

        scanner.close();
    }
}
