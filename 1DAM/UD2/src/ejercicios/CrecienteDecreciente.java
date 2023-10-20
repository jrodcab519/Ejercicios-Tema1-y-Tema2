package ejercicios;

import java.util.Scanner;

public class CrecienteDecreciente {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int actual = 0;
        int anterior = 0;

        int contador = 1;

        boolean creciente = true;
        boolean decreciente = true;

        do {

            System.out.print(">");
            actual = s.nextInt();

            if( contador > 1 && actual >= 0){

                if (actual > anterior){ // actual > anterior es creciente por lo tanto se seguro que ya no es decreciente
                    decreciente = false;
                } else if (actual < anterior){// actual < anterior es decreciente por lo tanto se seguro que ya no es creciente
                    creciente = false;
                } else { // si no pues son iguales, seguro ya que no es ni creciente ni decreciente
                    creciente = false;
                    decreciente = false;
                }
            }

            anterior = actual;
            contador++;

        } while (actual >= 0);

        if( creciente && decreciente){
            System.out.print("No se han introducido números");

        } else if(creciente && !decreciente){
            System.out.print("Es creciente");
        } else if(!creciente && decreciente){
            System.out.print("Es decreciente");
        } else if(!creciente && !decreciente){
            System.out.print("No es creciente ni decreciente");
        }
    }
}
