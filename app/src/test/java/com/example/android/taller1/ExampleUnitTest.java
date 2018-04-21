package com.example.android.taller1;

import org.junit.Test;

import static com.example.android.taller1.metodos.calculo;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void prueba10ZapatosMujerClasicoNike() throws Exception {
        int sexo = 1 , tipo = 1 , marca = 0 , cantidad = 10;
        assertEquals(600000, calculo(sexo,tipo,marca,cantidad));
    }
    @Test
    public void prueba6ZapatosMujerZapatillaAdidas() throws Exception {
        int sexo = 1 , tipo = 0 , marca = 1 , cantidad = 6;
        assertEquals(600000, calculo(sexo,tipo,marca,cantidad));
    }
    @Test
    public void prueba8ZapatosHombreZapatillaAdidas() throws Exception {
        int sexo = 0 , tipo = 0 , marca = 1 , cantidad = 8;
        assertEquals(1120000, calculo(sexo,tipo,marca,cantidad));
    }
    @Test
    public void prueba4ZapatosHombreClasicoPuma() throws Exception {
        int sexo = 0 , tipo = 1 , marca = 2 , cantidad = 4;
        assertEquals(400000, calculo(sexo,tipo,marca,cantidad));
    }


    }
