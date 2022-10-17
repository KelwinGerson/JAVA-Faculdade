
import javax.swing.JOptionPane;

public class Pessoa {

    protected String nome;
    int telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    // validation
    public void setTelefone(int telefone) {
        if (telefone >= 1000000) {
            this.telefone = telefone;
        }
    }
    
    public Pessoa(String nome, int telefone) {
        setNome(nome);
        setTelefone(telefone);
    }
    
    //método
    public void apresente() {
        JOptionPane.showMessageDialog(null, "Ola! Meu nome e " + nome + " e meu telefone e " +  telefone + ".");
    }
}
