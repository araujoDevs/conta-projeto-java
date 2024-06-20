public class BancoTerminal {
    public static void main(String[] args) {
        // Definição das variáveis
        double saldo = 25;
        double valorSolicitado = 18;

        // Simulação da operação de saque
        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente");
        }

        // Impressão do saldo atual
        System.out.println("Saldo atual: " + saldo);

        // Segunda execução com novos valores
        saldo = 15;
        valorSolicitado = 22;

        // Simulação da operação de saque com novos valores
        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado;
        } else {
            System.out.println("Saldo insuficiente");
        }

        // Impressão do novo saldo
        System.out.println("Novo saldo: " + saldo);
    }
}