// Aluno: Gabriel Hiro Furukawa
// RA: 223190
// Turma: ADS 3°S
// Materia: POO(Edson Feitosa)

package L2EX03;

public class L2EX03_Vendedor {
    private int codigo;
    private String nome;
    private double percentualComissao;
    
    //Inicio Public's
    
    public void Vendedor(){
        
    }
    
    public void Vendedor(int Codigo, String Nome, double PercentualCom){
        codigo = Codigo;
        nome = Nome;
        percentualComissao = PercentualCom;
        
    }
    
    public double calcularPagementoComissao(double ValorVenda){
        double RespCPC = ValorVenda * percentualComissao/100;
        
        return RespCPC;
    }
    
    public double calcularPagementoComissao(double ValorVenda, double desconto){
        double RespCPC = ValorVenda * percentualComissao/100;
        
        return RespCPC - desconto;
    }
    
    public String imprimir(double ValorVenda, double desconto){
        return "Codigo: " + codigo
                + "\n Nome: " + nome
                + "\n Valor Venda: " + ValorVenda
                + "\n Comissão: " + percentualComissao
                + "\n Desconto: " + desconto
                + "\n Valor a Pagar: " + calcularPagementoComissao(ValorVenda);
    }
    
    
    //SET and GETTERs
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
}
