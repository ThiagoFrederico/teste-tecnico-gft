package projeto03;

public class Main {
    public static void main(String[] args) {
        Double totalRacao = 0d;

        Gato gato1 = new Gato("Coca", 20);
        Gato gato2 = new Gato("Foxy", 3);
        Cachorro cachorro1 = new Cachorro("Eintein", 10);
        Gato gato3 = new Gato("Edward", 5);

        totalRacao = (cachorro1.quantidadeDeRacao() + gato1.quantidadeDeRacao() + gato2.quantidadeDeRacao() + gato3.quantidadeDeRacao());

        System.out.println(totalRacao + " Kg");

    }
}
