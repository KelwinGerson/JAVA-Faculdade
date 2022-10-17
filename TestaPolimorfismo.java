import javax.swing.JOptionPane;

public class TestaPolimorfismo {

        public static void catracaDaEscola(Aluno aluno) {
        JOptionPane.showMessageDialog(null, "O aluno " + aluno.getNome() + " entrou na escola ", null, 0);
    }
        public static void entradaDaLoja(Pessoa pessoa) {
        JOptionPane.showMessageDialog(null, "A pessoa " + pessoa.getNome() + " entrou na loja ", null, 0);
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Kelwin", 123456798, "1as23");
        Pessoa pessoa = new Pessoa("Ana", 12345798);

        catracaDaEscola(aluno);
        entradaDaLoja(pessoa);

        entradaDaLoja(aluno);
    }

}