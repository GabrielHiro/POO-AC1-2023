// Aluno: Gabriel Hiro Furukawa
// RA: 223190
// Turma: ADS 3°S
// Materia: POO(Edson Feitosa)

package EX02;

public class Aluno {

    private String ra;
    private String nome;
    private float ac1;
    private float ac2;
    private float ag;
    private float af;

    public double calcularMedia() {
        return (ac1 * 0.15) + (ac2 * 0.30) + (ag * 0.10) + (af * 0.45);
    }

    public String imprimir() {
        return "Ra: " + ra
                + "\n Nome: " + nome + "\n AC1: " + ac1 + "\n AC2: " + ac2 + "\n AG: " + ag + "\n AF: " + af + "\n Média: " + calcularMedia() + "\n Situação: " + situacao();
    }

    public String situacao() {
        String result;
        if (calcularMedia() >= 5) {
            result = "aprovado";
        } else {
            result = "reprovado";
        }
        return result;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAc1() {
        return ac1;
    }

    public void setAc1(float ac1) {
        this.ac1 = ac1;
    }

    public float getAc2() {
        return ac2;
    }

    public void setAc2(float ac2) {
        this.ac2 = ac2;
    }

    public float getAg() {
        return ag;
    }

    public void setAg(float ag) {
        this.ag = ag;
    }

    public float getAf() {
        return af;
    }

    public void setAf(float af) {
        this.af = af;
    }

}
