public class TestaPessoa {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(null, 0);
        p1.setNome("Manoel");
        p1.setTelefone(123456789);
        p1.apresente();

        Pessoa p2 = new Pessoa("Joaquim", 987654321);
        p2.apresente();
    }
}
