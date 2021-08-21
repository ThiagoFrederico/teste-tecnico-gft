package projeto01;

public class Main {
    public static void main(String[] args) {
        Portugues portugues = new Portugues("Português");
        Ingles ingles = new Ingles("Inglês");
        Hungaro hungaro = new Hungaro("Hungaro");
        Tcheco tcheco = new Tcheco("Tcheco");

        portugues.saudacao();
        ingles.saudacao();
        hungaro.saudacao();
        tcheco.saudacao();
    }
}
