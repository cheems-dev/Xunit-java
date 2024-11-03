package lucho.dev.pe;

import java.util.ArrayList;
import java.util.Random;

public class GenerarYOrdenarLista {
    public ArrayList<Integer> generarLista(int cantidad) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            lista.add(random.nextInt(100) + 1); // Genera números entre 1 y 100
        }
        return lista;
    }


    public ArrayList<Integer> ordenarLista(ArrayList<Integer> lista) {
        int n = lista.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (lista.get(j) > lista.get(j + 1)) {
                    int temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }
        return lista;
    }
}
