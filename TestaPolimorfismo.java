import javax.swing.JOptionPane;

public class TestaPolimorfismo {

    public static void catracaDaEscola(Aluno aluno) {
        JOptionPane.showMessageDialog(null, "O aluno" + aluno.getNome() + "entrou na escola", null, 0);
    }

}