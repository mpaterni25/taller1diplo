package com.example.android.taller1;

/**
 * Created by android on 21/04/2018.
 */

public class metodos {

    public static int calculo(int sexo,int tipo, int marca, int cant) {
        int resultado = 0;
        switch (sexo) {
            case 0:
                switch (tipo) {
                    case 0:
                        switch (marca) {
                            case 0:
                                resultado = 120000 * cant;
                                break;
                            case 1:
                                resultado = 140000 * cant;
                                break;
                            case 2:
                                resultado = 130000 * cant;
                                break;
                        }
                        break;
                    case 1:
                        switch (marca) {
                            case 0:
                                resultado = 50000 * cant;
                                break;
                            case 1:
                                resultado = 80000 * cant;
                                break;
                            case 2:
                                resultado = 100000 * cant;
                                break;
                        }
                        break;
                }
                break;
            case 1:
                switch (tipo) {
                    case 0:
                        switch (marca) {
                            case 0:
                                resultado = 100000 * cant;
                                break;
                            case 1:
                                resultado = 130000 * cant;
                                break;
                            case 2:
                                resultado = 110000 * cant;
                                break;
                        }

                        break;
                    case 1:
                        switch (marca) {
                            case 0:
                                resultado = 60000 * cant;
                                break;
                            case 1:
                                resultado = 70000 * cant;
                                break;
                            case 2:
                                resultado = 120000 * cant;
                                break;
                        }
                        break;
                }
                break;
        }
            return resultado;
    }
}
