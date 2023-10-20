//Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem,
//utilizando um automóvel que faz 12 Km por litro.
//Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média. Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE. Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média, tempo gasto, a distância percorrida e a quantidade de litros
//utilizada na viagem. Dica: trabalhe com valores reais.

import java.util.Scanner;

class CalculoCombustivelViagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        double tempoGasto = scanner.nextDouble();

        System.out.print("Digite a velocidade média (em Km/h): ");
        double velocidadeMedia = scanner.nextDouble();

        double distancia = tempoGasto * velocidadeMedia;
        double litrosUsados = distancia / 12.0; // Utilizei 12.0 para garantir uma divisão de valores reais.

        System.out.println("Velocidade Média: " + velocidadeMedia + " Km/h");
        System.out.println("Tempo Gasto: " + tempoGasto + " horas");
        System.out.println("Distância Percorrida: " + distancia + " Km");
        System.out.println("Quantidade de Litros Utilizada: " + litrosUsados + " litros");

        scanner.close();
    }
}
