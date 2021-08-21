package projeto03;

public class Gato extends Animal{
    public Gato(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public String som() {
        return "miau";
    }

    @Override
    public double quantidadeDeRacao() {
        if (getPeso() <= 4) {
            return getPeso()*0.12;
        }else if (getPeso() > 4) {
            return getPeso()*0.15;
        }
        return 0;
    }
}
