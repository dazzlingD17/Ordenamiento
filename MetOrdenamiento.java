//MARIANA DAZZLING DIAZ DE JESUS
//SAMARA GUTIERREZ VALLE
package metordenamiento;

import java.util.Arrays;
import java.util.Scanner;

public class MetOrdenamiento {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc;
        boolean x= true;
        Metodos met = new Metodos();
        int Matriz[][] = {
            {2, 7},
            {5, 0},
            {3, 4},
        };
        while(x){
        System.out.println("-----MENU-----");
        System.out.println("    ¿que metodo desea utilizar?");
        System.out.println("[1]METODO SHELLSORT");
        System.out.println("[2]METODO RADIX");
        System.out.println("[3] salir");
        
        opc = leer.nextInt();

        switch (opc) {
            case 1:
                System.out.println("[----METODO SHELLSORT----]");

                System.out.println("Matriz Original");
                for (int i = 0; i < Matriz.length; i++) {
                    System.out.println(Arrays.toString(Matriz[i]));
                }
                int arreglo[] = arreglo(Matriz);

                met.shell(arreglo);

                for (int k = 0, i = 0; i < Matriz.length; i++) {
                    for (int j = 0; j < Matriz[i].length; j++) {
                        Matriz[i][j] = arreglo[k];
                        k++;
                    }
                }

                System.out.println("Matriz Ordenada");
                for (int i = 0; i < Matriz.length; i++) {
                    System.out.println(Arrays.toString(Matriz[i]));
                }
                break;

            case 2:
                System.out.println("-----METODO RADIX-----");
                System.out.println("Matriz Original");
                for (int i = 0; i < Matriz.length; i++) {
                    System.out.println(Arrays.toString(Matriz[i]));
                }

                int arreglo2[] = arreglo(Matriz);

                arreglo2 = met.Radix(arreglo2);

                for (int k = 0, i = 0; i < Matriz.length; i++) {
                    for (int j = 0; j < Matriz[i].length; j++) {
                        Matriz[i][j] = arreglo2[k];
                        k++;
                    }
                }

                System.out.println("Matriz Ordenada");
                for (int i = 0; i < Matriz.length; i++) {
                    System.out.println(Arrays.toString(Matriz[i]));
                }
                break;
                
            case 3:
                x= false;

        }
    }
    }

    public static int[] arreglo(int M[][]) {
        int arreglo[] = new int[M.length * M[0].length];
        int k = 0;
        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                arreglo[k] = M[i][j];
                k++;
            }
        }
        return arreglo;
    }

}
