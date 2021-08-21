package projeto03;

public class Cachorro extends Animal{
    public Cachorro(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public String som() {
        return "auau";
    }

    @Override
    public double quantidadeDeRacao() {
        if (getPeso() <= 3) {
            return getPeso()*0.35;
        }else if (getPeso() > 3 &&  getPeso() <= 10 ) {
            return getPeso()*0.45;
        } else if (getPeso() > 10) {
            return getPeso()*0.50;
        }
        return 0;
    }
}
