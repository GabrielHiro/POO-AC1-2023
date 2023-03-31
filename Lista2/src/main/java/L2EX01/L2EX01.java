
// Aluno: Gabriel Hiro Furukawa
// RA: 223190
// Turma: ADS 3°S
// Materia: POO(Edson Feitosa)

package L2EX01;

import java.util.Scanner;

public class L2EX01 {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        double num1, num2;
        int a = 0;
        L2EX01Calculadora c = new L2EX01Calculadora();

        System.out.println("Digite um numero");
        num1 = l.nextDouble();
        System.out.println("Digite outro numero");
        num2 = l.nextDouble();

        while (a != 5) {
            System.out.println("-- Menu --");
            System.out.println("Digite o numero para selecionar");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");
            a = l.nextInt();

            switch (a) {
                case 1 -> System.out.println(c.soma(num1, num2));
                
                case 2 -> System.out.println(c.subtracao(num1, num2));
                
                case 3 -> System.out.println(c.multiplicacao(num1, num2));
                
                case 4 -> System.out.println(c.divisao(num1, num2));
                
                case 5 -> System.out.println("Saindo...");
                
                default -> System.out.println("Numero invalido, digite novamente");
            }
        }
    }
}
