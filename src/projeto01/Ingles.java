package projeto01;

public class Ingles extends Idioma{

    public Ingles(String nomeDoIdioma) {
        super(nomeDoIdioma);
    }

    @Override
    public void saudacao() {
        System.out.println(getNomeDoIdioma() +": Hello World");
    }
}
