import javax.swing.JOptionPane;

public class OlaMundoGrafico {

    public static void main(String[] args) {
        String resposta;
        resposta = JOptionPane.showInputDialog("Qual e seu nome ?");
        
        JOptionPane.showMessageDialog(null, "Ola" + resposta + "! E um prazer conhece-lo");
        
    }
}