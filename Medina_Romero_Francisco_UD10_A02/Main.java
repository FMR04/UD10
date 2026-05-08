/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD10_A02;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ALUMNO
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        try (Scanner teclado = new Scanner(System.in)) {
            int num;

            System.out.println("Mete numeros (-1 para terminar)");

            do {
                num = teclado.nextInt();
                    if (num != -1 && num >= 0) {
                        numeros.add(num);
                    }
                } while (num != -1);

            System.out.println("Coleccion completa: " + numeros);

            System.out.print("Numeros pares: ");
            for (int numero : numeros) {
                if (numero % 2 == 0) {
                    System.out.print(numero + " ");
                }
            }

            Iterator<Integer> it = numeros.iterator();
            while (it.hasNext()) {
                if (it.next() % 3 == 0) {
                    it.remove();
                }
            }

            System.out.println("Colección despues de eliminar multiplos de 3: " + numeros);

        } catch (Exception e) {
            System.out.println("Error al introducir los datos");
        }
    }
}
