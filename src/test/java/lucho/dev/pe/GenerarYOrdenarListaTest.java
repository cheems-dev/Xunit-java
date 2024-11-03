package lucho.dev.pe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
class GenerarYOrdenarListaTest {
    private GenerarYOrdenarLista generador;


    @BeforeEach
    void setUp() {
        generador = new GenerarYOrdenarLista();
    }

    @AfterEach
    void tearDown() {
        generador = null;
    }

    @Test
    @DisplayName("Caso 1: Lista vacía")
    void testOrdenarListaVacia() {
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> resultado = generador.ordenarLista(lista);
        assertTrue(resultado.isEmpty(), "La lista debería estar vacía");
    }

    @Test
    @DisplayName("Caso 2: Lista con un elemento")
    void testOrdenarListaUnElemento() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        ArrayList<Integer> resultado = generador.ordenarLista(lista);
        assertEquals(5, resultado.get(0), "El único elemento debería ser 5");
    }

    @Test
    @DisplayName("Caso 3: Lista con varios elementos")
    void testOrdenarListaVariosElementos() {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(34);
        lista.add(12);
        lista.add(77);
        lista.add(5);
        lista.add(43);

        ArrayList<Integer> resultado = generador.ordenarLista(lista);
        ArrayList<Integer> esperado = new ArrayList<>();
        esperado.add(5);
        esperado.add(12);
        esperado.add(34);
        esperado.add(43);
        esperado.add(77);

        assertEquals(esperado, resultado, "La lista debería estar ordenada en forma ascendente");
    }
}