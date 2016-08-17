/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.dmartínezc.a03;

import java.util.Scanner;

/**
 *
 * @author Daniel Alexandro Martínez Ch. A00513954
 */
public class EDDMartínezCA03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int array[] = new int[];
        int array[] = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        int x;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Que numero deseas encontrar? ");
        x = scan.nextInt();

        MetodosDeBusqueda.busquedaSecuencial(array, x);
        MetodosDeBusqueda.busquedaBinaria(array, x);
    }

    /**
     * Method usado en caso de querer que el ususario genere un array
     * @return arr1, el array creado por el ususario
     */
    public static int[] createArray() {
        Scanner scan = new Scanner(System.in);
        int n;
        do {
            System.out.println("Especifique el numero de espacios en el array: ");
            n = scan.nextInt();
        } while (n <= 0);
        int arr1[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Especifique el dato en la posicion " + i + ": ");
            arr1[i] = scan.nextInt();
        }
        return arr1;
    }

}
