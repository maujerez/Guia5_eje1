/*
 1) En un nuevo proyecto, crear una clase de nombre Arreglo con los siguientes métodos
estáticos (static):

a) Método sumarLista que reciba por parámetro un arreglo unidimensional de
enteros y muestre por pantalla la suma y promedio de los mismos.

b) Método buscarMayor que reciba por parámetro un arreglo bidimensional e
irregular de enteros y retorne el entero más grande que se encuentra en el arreglo.
c) Método cuentaVocales, que reciba por parámetro un String y retorne la cantidad
de vocales que tiene la cadena.

d) Método cuentaCaracter que reciba por parámetro un String y un carácter, luego
retorne la cantidad de veces que se repite en la cadena el carácter recibido.

Luego desde el método main de una clase de nombre PruebaArreglo, invocar los métodos
de la clase Arreglo creada por usted.
 */
package guia5_eje1;

public class Arreglo {

    public static void sumarLista(int[] arreglo) {
        int suma = 0;
        double prom = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        prom = suma / arreglo.length;
        System.out.println("la suma de los enteros en el arreglo es: " + suma + ".");
        System.out.println("el promedio de los enteros en el arreglo es: " + prom
                + ".");
    }

    public static void buscarMayor(int[][] arrelgoBi) {
        int mayor = 0;
        for (int i = 0; i < arrelgoBi.length; i++) {
            for (int j = 0; j < arrelgoBi[i].length; j++) {
                if (arrelgoBi[i][j] > mayor) {
                    mayor = arrelgoBi[i][j];
                }
                System.out.print(arrelgoBi[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("el mayor entero en la matriz es: " + mayor);

    }

    /*c) Método cuentaVocales, que reciba por parámetro un String y retorne la cantidad
de vocales que tiene la cadena.*/
    public static int cuentaVocales(String frase) {
        int cant = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                cant++;
            }
        }
        return cant;

    }

    /*d) Método cuentaCaracter que reciba por parámetro un String y un carácter, luego
retorne la cantidad de veces que se repite en la cadena el carácter recibido.*/
    public static int cuentaCaracter(String frase, char letra) {
        int cant = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                cant++;
            }
        }
        return cant;
    }

}
