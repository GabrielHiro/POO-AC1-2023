
// Aluno: Gabriel Hiro Furukawa
// RA: 223190
// Turma: ADS 3°S
// Materia: POO(Edson Feitosa)

package L2EX02;

import java.util.Scanner;

public class L2EX02 {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int a = 0;
        int numero, idade;
        String nome;
        char sexo;
        double valorAutomovel;
        L2EX02Apolice apolice = new L2EX02Apolice();

        while (a != 3) {
            System.out.println("-- Menu --");
            System.out.println("Digite o numero para selecionar");
            System.out.println("1 - Criar Apólice");
            System.out.println("2 - Ver dados Apólice");
            System.out.println("3 - Sair");
            a = l.nextInt();

            switch (a) {
                case 1 -> {
                    System.out.println("Digite seu numero: ");
                    numero = l.nextInt();
                    System.out.println("Digite seu Nome: ");
                    nome = l.next();
                    System.out.println("Digite a sua idade: ");
                    idade = l.nextInt();
                    System.out.println("Digite o seu sexo: ");
                    sexo = l.next().charAt(0);
                    System.out.println("Digite o valor do seu automóvel: ");
                    valorAutomovel = l.nextDouble();
                    apolice = new L2EX02Apolice(numero, nome, idade, sexo, valorAutomovel);
                }
                case 2 -> System.out.println(apolice.imprimir());
                case 3 -> System.out.println("Saindo...");
                default -> System.out.println("Numero invalido, digite novamente: ");
            }
        }
    }
}
