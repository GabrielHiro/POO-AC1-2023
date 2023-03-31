// Aluno: Gabriel Hiro Furukawa
// RA: 223190
// Turma: ADS 3°S
// Materia: POO(Edson Feitosa)

package EX02;

import java.util.Scanner;

public class EX02 {


	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		Aluno p = new Aluno();
		int a = 0;
		
		while(a != 3) {
			System.out.println("-- Menu --");
			System.out.println("Digite o numero para selecionar");
			System.out.println("1 - Criar aluno");
			System.out.println("2 - Mostrar aluno criado");
			System.out.println("3 - Sair");
			a = l.nextInt();
			
			switch(a) {
			case 1 -> {
                            System.out.println("Digite seu RA: ");
                            p.setRa(l.next());
                            System.out.println("Digite seu Nome: ");
                            p.setNome(l.next());
                            System.out.println("Digite a nota AC1: ");
                            p.setAc1(l.nextFloat());
                            System.out.println("Digite a nota AC2: ");
                            p.setAc2(l.nextFloat());
                            System.out.println("Digite a nota AG: ");
                            p.setAg(l.nextFloat());
                            System.out.println("Digite a nota AF: ");
                            p.setAf(l.nextFloat());
                        }
			case 2 -> System.out.println(p.imprimir());
			case 3 -> System.out.println("Saindo...");
			default -> {
                            System.out.println("Opção invalida");
                            System.out.println(" ");
                        }
			}
		}
		
		
	}
}