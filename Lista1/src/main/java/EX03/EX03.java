// Aluno: Gabriel Hiro Furukawa
// RA: 223190
// Turma: ADS 3°S
// Materia: POO(Edson Feitosa)
package EX03;

import java.util.Scanner;

public class EX03 {

    public static void main(String[] args) {

        //Scanner
        Scanner Inp = new Scanner(System.in);

        //Funcionario
        Funcionario F = new Funcionario();

        int Ind = 0;
        while (Ind == 0) {
            System.out.println("| - - - | FUNCIONARIO | - - - |");
            System.out.println(" 1 – Criar Funcionário");
            System.out.println(" 2 – Mostrar Folha de Pagamento ");
            System.out.println(" 3 – Alterar remuneração  ");
            System.out.println(" 4 – Sair  ");
            System.out.print(" Digite Aqui: ");
            int a = Inp.nextInt();
            switch (a) {

                //Criar Funcionario
                case 1:

                    System.out.println(" Digite Abaixo as Informações do Funcionario: ");

                    
                    System.out.println("Cracha: ");
                    F.setCracha(Inp.nextInt());

                    System.out.println("Nome: ");
                    F.setNome(Inp.next());

                    System.out.println("Tipo Vinculo: ");
                    F.setTipoVinculo(Inp.next().charAt(0));
                    
                    if (F.getTipoVinculo() == 'H' ) {
                        System.out.println("Valor Hora: ");
                        F.setValorHora(Inp.nextFloat());
                        System.out.println("Quantidade de horas trabalhadas: ");
                        F.setQtdeHora(Inp.nextFloat());
                        
                    } else {
                        System.out.println("Salario: ");
                        F.setSalario(Inp.nextFloat());
                        System.out.println("Nova remuneração bruta: " + F.getSalario());
                    }
                       

                    System.out.println("Valor Desconto: ");
                    F.setValorDesconto(Inp.nextFloat());
                    break;

                // Mostrar Folha de Pagamento
                case 2:
                    F.imprimir();
                    break;

                // Alternar Remuneração
                case 3:
                    if (F.getTipoVinculo() == 'H' ) {
                        System.out.print("Valor Hora: ");
                        F.setValorHora(Inp.nextFloat());
                        System.out.print("Quantidade de horas trabalhadas: ");
                        F.setQtdeHora(Inp.nextFloat());
                        System.out.println("Nova remuneração bruta: " + F.getValorHora() * F.getQtdeHora());
                    } else {
                        System.out.print("Salario: ");
                        F.setSalario(Inp.nextFloat());
                        System.out.println("Nova remuneração bruta: " + F.getSalario());
                    }

                    break;

                //Sair
                case 4:
                    System.out.println("Saindo...");
                    Ind = 1;
                    break;

                //ERRO
                default:
                    System.out.println("Opção invalida, escolha novamente: /n");
                    break;
            }
        }

    }
}
