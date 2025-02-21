import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Empresa X
        System.out.println("Sistema da Empresa X");

        // Declaração de variáveis
        double salario;
        double salarioi;

        // Entrada
        System.out.println("Olá funcionário, informe seu salário:");
        salario = input.nextDouble();

        // Processamento
        if (salario >= 5000) {
            salarioi = salario * 0.8;
            System.out.println("Seu salário teve 20% de imposto retirado.");
            System.out.println("Seu salário atual é: R$" + salarioi);

            // Saída caso tenha sido recolhido imposto
        } else {
            System.out.println("Nada de imposto foi retirado do seu salário.");
            System.out.println("Seu salário atual é: R$" + salario);

            // Saída caso não tenha sido recolhido imposto
        }
    }
}
