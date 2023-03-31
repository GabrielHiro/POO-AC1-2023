// Aluno: Gabriel Hiro Furukawa
// RA: 223190
// Turma: ADS 3°S
// Materia: POO(Edson Feitosa)

package EX01;
import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		String resposta;
		Pessoa p = new Pessoa();
		boolean B = true;
		
		while(B == true) {
			System.out.println("-- Menu --");
			System.out.println("Digite o numero para selecionar");
			System.out.println(" 1 - Criar pessoa");
			System.out.println(" 2 - Mostrar pessoa criada");
			System.out.println(" 3 - Sair");
                        System.out.print(" Digite Aqui: ");
			resposta = l.next();
			
			switch(resposta) {
			case "1" -> {
                            System.out.print("Digite seu nome: ");
                            p.setNome(l.next());
                            System.out.print("Digite seu CPF: ");
                            p.setCpf(l.next());
                            System.out.print("Digite sua Idade: ");
                            p.setIdade(l.nextInt());
                            System.out.print("Digite seu Sexo: ");
                            p.setSexo(l.next());
                            System.out.println(" ");
                        }
			case "2" -> {
                            System.out.println("Nome: "+ p.getNome());
                            System.out.println("CPF: "+ p.getCpf());
                            System.out.println("Idade: "+ p.getIdade());
                            System.out.println("Sexo: "+ p.getSexo());
                            System.out.println(" ");
                        }
			case "3" -> {
                            System.out.println("Saindo...");
                            B = false;
                        }
			}
		}
	}

}