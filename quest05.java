import java.util.Scanner;

 class CalculoIdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe sua idade em anos, meses e dias");
        System.out.print("Anos: ");
        int anos = scanner.nextInt();

        System.out.print("Meses: ");
        int meses = scanner.nextInt();

        System.out.print("Dias: ");
        int dias = scanner.nextInt();

        int idadeEmDias = (anos * 365) + (meses * 30) + dias;

        System.out.println("Idade expressa em dias: " + idadeEmDias);

        scanner.close();
    }
}
