import java.util.Scanner;

 class HotelPromocao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da diária normal: ");
        double diariaNormal = scanner.nextDouble();

        int numeroApartamentos = 42;
        double taxaPromocao = 0.22; // 22%
        double taxaOcupacaoSemPromocao = 0.4; // 40%
        double taxaOcupacaoComPromocao = 0.7; // 70%
        int diasNoMes = 30; // Supondo 30 dias em um mês

        // (a) O valor da diária no período da promoção
        double diariaPromocao = diariaNormal * (1 - taxaPromocao);

        // (b) O valor médio arrecadado sem a promoção, durante um mês
        double valorArrecadadoSemPromocao = numeroApartamentos * diariaNormal * diasNoMes * taxaOcupacaoSemPromocao;

        // (c) O valor médio arrecadado com a promoção, durante um mês
        double valorArrecadadoComPromocao = numeroApartamentos * diariaPromocao * diasNoMes * taxaOcupacaoComPromocao;

        // (d) O lucro ou prejuízo mensal com a promoção
        double lucroOuPrejuizo = valorArrecadadoComPromocao - valorArrecadadoSemPromocao;

        System.out.println("(a) Valor da diária no período da promoção: R$" + diariaPromocao);
        System.out.println("(b) Valor médio arrecadado sem a promoção, durante um mês: R$" + valorArrecadadoSemPromocao);
        System.out.println("(c) Valor médio arrecadado com a promoção, durante um mês: R$" + valorArrecadadoComPromocao);
        System.out.println("(d) Lucro ou prejuízo mensal com a promoção: R$" + lucroOuPrejuizo);

        scanner.close();
    }
}
