import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TestaPessoa {

    public static Pessoa recebePessoa() {

        Pessoa p = null;
        String nome;
        int telefone = 0;

        nome = JOptionPane.showInputDialog("Qual e o nome da pessoa ?");

        // laço para receber o telefone até que um valor correto tenha sido inserido;
        boolean repete = true;

        do {
            try {
                telefone = Integer.parseInt(JOptionPane.showInputDialog("Qual é o telefone de " + nome + "?"));
                repete= false;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas números. Tente outra vez");
            }
        } while (repete);
        p = new Pessoa(nome, telefone);
        return p;
        

    }

    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<>();

        // Recebimento dos dados das pessoas:
        int continua;

        do {
            pessoas.add(recebePessoa());
            continua = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Pergunta", JOptionPane.YES_NO_OPTION);
        } while (continua == JOptionPane.YES_OPTION);

        // exibição dos dados das pessoas:
        for (Pessoa p : pessoas) {
            p.apresente();
        }
    } 
    
}
