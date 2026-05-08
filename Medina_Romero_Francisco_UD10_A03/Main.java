/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD10_A03;
import java.util.*;
/**
 *
 * @author ALUMNO
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> NoRepeat = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int num = (int) (Math.random() * 10) + 1;
            numeros.add(num);
        }
        for (int num : numeros) {
            if (!NoRepeat.contains(num)) {
                NoRepeat.add(num);
            }
        }

        System.out.println("Colección original: " + numeros);
        System.out.println("Colección sin repetidos: " + NoRepeat);
    }
}
