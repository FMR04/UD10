/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD10_A01;

/**
 *
 * @author ALUMNO
 */
import java.util.Arrays;

public class Main {

    public static <T> T[] guardar(T elemento, T[] tabla) {
        T[] nuevaTabla = Arrays.copyOf(tabla, tabla.length + 1);
        nuevaTabla[tabla.length] = elemento;
        return nuevaTabla;
    }

    public static void main(String[] args) {
        String[] palabras = {};
        Integer[] numeros = {};

        palabras = guardar("Hola", palabras);
        palabras = guardar("Mundo", palabras);

        numeros = guardar(10, numeros);
        numeros = guardar(20, numeros);

        System.out.println("Strings: " + Arrays.toString(palabras));
        System.out.println("Integer: " + Arrays.toString(numeros));
    }
}
