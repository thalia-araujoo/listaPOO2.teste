import java.util.Scanner;

 class InversaoNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um valor inteiro de três dígitos: ");
        int numero = scanner.nextInt();

        if (numero >= 100 && numero <= 999) {
            int digito1 = numero % 10;
            int digito2 = (numero / 10) % 10;
            int digito3 = numero / 100;
            int numeroInvertido = digito1 * 100 + digito2 * 10 + digito3;

            System.out.println("O valor original é: " + numero);
            System.out.println("O valor invertido é: " + numeroInvertido);
        } else {
            System.out.println("O número inserido não possui três dígitos.");
        }

        scanner.close();
    }
}
