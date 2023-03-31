// Aluno: Gabriel Hiro Furukawa
// RA: 223190
// Turma: ADS 3°S
// Materia: POO(Edson Feitosa)

package EX03;

public class Funcionario {

    private int Cracha;
    private String Nome;
    private char TipoVinculo;
    private float ValorHora;
    private float QtdeHora;
    private float Salario;
    private float ValorDesconto;

    //Imprimir
    public void imprimir() {
        float ValorReceber = 0;
        
        System.out.println("| - - - - | Folha de Pagamento | - - - - |");
        System.out.println("Crachá: " + Cracha);
        System.out.println("Nome : " + Nome);
        System.out.println("Tipo Vinculo : " + TipoVinculo);
        //Salario
        if (TipoVinculo == 'H') {
            float temp = ValorHora * QtdeHora;
            System.out.println("Salário: " + temp);
            ValorReceber = temp - ValorDesconto;
        } else {
            System.out.println("Salário: " + Salario);
            ValorReceber = Salario - ValorDesconto;
        }
        //Valor Desconto
        System.out.println("Desconto: " + ValorDesconto);

        //Valor a Receber
        System.out.println("Valor A Receber: " + ValorReceber);

    }

    public int getCracha() {
        return Cracha;
    }

    public void setCracha(int Cracha) {
        this.Cracha = Cracha;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public char getTipoVinculo() {
        return TipoVinculo;
    }

    public void setTipoVinculo(char TipoVinculo) {
        this.TipoVinculo = TipoVinculo;
    }

    public float getValorHora() {
        return ValorHora;
    }

    public void setValorHora(float ValorHora) {
        this.ValorHora = ValorHora;
    }

    public float getQtdeHora() {
        return QtdeHora;
    }

    public void setQtdeHora(float QtdeHora) {
        this.QtdeHora = QtdeHora;
    }

    public float getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }

    public float getValorDesconto() {
        return ValorDesconto;
    }

    public void setValorDesconto(float ValorDesconto) {
        this.ValorDesconto = ValorDesconto;
    }

}
