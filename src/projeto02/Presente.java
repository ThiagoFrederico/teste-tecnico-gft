package projeto02;

public class Presente {
    int anoAtual = 2021;
    int anoEntrada;
    int tempoCasa;

    public Presente(int anoEntrada) {
        this.anoEntrada = anoEntrada;
    }


    public int calcularTempoCasa() {
        tempoCasa = anoAtual - anoEntrada;
        return tempoCasa;
    }

    public void presente(){

        switch (tempoCasa) {
            case 1:
                System.out.println("Vale Presente");
            break;

            case 2:
                System.out.println("Smart Watch");
            break;

            case 5:
                System.out.println("Fone Bluetooth");
            break;

            case 10:
                System.out.println("Vale Jantar");
            break;

            case 15:
                System.out.println("Vale Jantar Top");
            break;

            default:
                System.out.println("Esse ano não vai ter presente");
        }
    }
}
