package projeto01;

public class Portugues extends Idioma{

    public Portugues(String nomeDoIdioma) {
        super(nomeDoIdioma);
    }

    @Override
    public void saudacao() {
        System.out.println(getNomeDoIdioma() + ": Olá Mundo");
    }
}
