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

import java.util.Scanner;

public class Guia5_eje1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int arreglo[] = {15, 65, 10, 2, 8};
        int[][] arregloBi = new int[3][];
        for (int i = 0; i < arregloBi.length; i++) {
            arregloBi[i] = new int[i + 2];
        }
        for (int i = 0; i < arregloBi.length; i++) {
            for (int j = 0; j < arregloBi[i].length; j++) {
                arregloBi[i][j] = (int) (Math.random() * 10 + 1);

            }

        }
        Arreglo.sumarLista(arreglo);
        Arreglo.buscarMayor(arregloBi);
        System.out.println(Arreglo.cuentaVocales("esternocleidomasteoideo"));
        System.out.println(Arreglo.cuentaCaracter("fisiconucear", 'i'));

    }

}
