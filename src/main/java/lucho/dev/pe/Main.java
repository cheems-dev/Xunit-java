package lucho.dev.pe;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GenerarYOrdenarLista generador = new GenerarYOrdenarLista();

        System.out.print("Ingresa la cantidad de números a generar: ");
        int cantidad = scanner.nextInt();

        ArrayList<Integer> listaGenerada = generador.generarLista(cantidad);
        System.out.println("Lista generada: " + listaGenerada);

        ArrayList<Integer> listaOrdenada = generador.ordenarLista(listaGenerada);
        System.out.println("Lista ordenada en forma ascendente: " + listaOrdenada);
    }
}