package projeto01;

public abstract class Idioma {
    private String nomeDoIdioma;

    public Idioma(String nomeDoIdioma) {
        this.nomeDoIdioma = nomeDoIdioma;
    }

    public String getNomeDoIdioma() {
        return nomeDoIdioma;
    }

    public abstract void saudacao();
}
