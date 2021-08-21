package projeto04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.print("Digite o número inicial: ");
        n1 = sc.nextInt();

        System.out.print("Digite o número final: ");
        n2 = sc.nextInt();

        Notas program = new Notas(n1,n2);

        program.exec();

        sc.close();


    }
}
