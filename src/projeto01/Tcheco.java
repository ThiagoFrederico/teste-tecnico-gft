package projeto01;

public class Tcheco extends Idioma{

    public Tcheco(String nomeDoIdioma) {
        super(nomeDoIdioma);
    }

    @Override
    public void saudacao() {
        System.out.println(getNomeDoIdioma() + ": Ahoj Svete");
    }
}
