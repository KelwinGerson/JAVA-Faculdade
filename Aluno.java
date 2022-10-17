import javax.swing.JOptionPane;

public class Aluno extends TestaPessoa {
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
        JOptionPane.showMessageDialog(null, "Olá! Eu sou o aluno" + getNome() + ", meu telefone é" + getTelefone() + "e meu RA é " + ra + ".");
    }

    private String getTelefone() {
        return null;
    }

    private String getNome() {
        return null;
    }

    public Aluno(String nome, int telefone, String ra) {
        super(nome, telefone);
        setRa(ra);
    }
    
}
