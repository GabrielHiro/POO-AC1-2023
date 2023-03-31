// Aluno: Gabriel Hiro Furukawa
// RA: 223190
// Turma: ADS 3°S
// Materia: POO(Edson Feitosa)

package L2EX04;

import java.util.Scanner;

public class L2EX04 {

    public static void main(String[] args) {
        //Scanner

        Scanner Inp = new Scanner(System.in);

        //vendedor
        L2EX03_Vendedor V = new L2EX03_Vendedor();
        int Ind = 0;

        while (Ind == 0) {
            System.out.println("| - - - | FUNCIONARIO | - - - |");
            System.out.println(" 1 – Cadastra Vendedor");
            System.out.println(" 2 – Calcular Comissão ");
            System.out.println(" 3 – Sair  ");
            System.out.print(" Digite Aqui: ");
            int a = Inp.nextInt();

            switch (a) {
                case 1 -> {
                    System.out.println(" Digite Abaixo as Informações do Vendedor: ");

                    System.out.println("Codigo: ");
                    V.setCodigo(Inp.nextInt());

                    System.out.println("Nome: ");
                    V.setNome(Inp.next());

                    System.out.println("Percentual: ");
                    V.setPercentualComissao(Inp.nextDouble());
                }

                case 2 -> {
                    System.out.println("Valor Receber: ");
                    double tempA = Inp.nextDouble();
                    V.calcularPagementoComissao(tempA);

                    System.out.println("Desconto: ");
                    double tempB = Inp.nextDouble();

                    V.calcularPagementoComissao(tempA, tempB);

                    System.out.println(V.imprimir(tempA, tempB));
                }
                case 3 -> {
                    System.out.println("Saindo...");
                    Ind = 1;
                }
                default ->
                    System.out.println("Opção invalida, escolha novamente: /n");
            }
        }
    }
}
