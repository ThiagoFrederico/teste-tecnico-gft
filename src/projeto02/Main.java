package projeto02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite o ano de entrada: ");
        Scanner sc = new Scanner(System.in);
        int anoEntrada = sc.nextInt();

        Presente presente = new Presente(anoEntrada);

        presente.calcularTempoCasa();
        presente.presente();

        sc.close();
    }
}
