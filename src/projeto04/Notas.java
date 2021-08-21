package projeto04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Notas {
    private int n1,n2;
    List<String> notas = new ArrayList(Arrays.asList("Dó","Ré","Mi","Fá","Sol","Lá","Si"));

    public Notas(int n1, int n2){
        this.n1 = n1;
        this.n2 = n2;
    }

    public void  exec() {
        for (int i = n1; i <= n2; i++ ) {
            if (i >= 7) {
                i = 0;
                n1 = 0;
                n2 = n2 - 7;
            }

            System.out.printf("%s ",notas.get(i));
        }
    }

}
