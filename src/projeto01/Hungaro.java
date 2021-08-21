package projeto01;

public class Hungaro extends Idioma{
    public Hungaro(String nomeDoIdioma) {
        super(nomeDoIdioma);
    }

    @Override
    public void saudacao() {
        System.out.println(getNomeDoIdioma() + ": Helló Világ");
    }
}
