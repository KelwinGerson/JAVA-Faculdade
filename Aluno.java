import javax.swing.JOptionPane;

public class Aluno extends Pessoa {
    private String ra;

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        if (!ra.equals("")) {
            this.ra = ra;
        } else {
            throw new IllegalArgumentException("RA Inváldio");
        }
    }
    
    public void apresente() {
        JOptionPane.showMessageDialog(null, "Ola! Eu sou o aluno: " + getNome() + ", e meu telefone e: " + getTelefone() + ", RA: " + ra + ".");
    }

    public Aluno(String nome, int telefone, String ra) {
        super(nome, telefone);
        setRa(ra);
    }
    
}
