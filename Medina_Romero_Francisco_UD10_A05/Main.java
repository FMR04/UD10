/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD10_A05;
import java.util.*;
/**
 *
 * @author ALUMNO
 */
public class Main {
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> numeroscopia = new ArrayList<>();

        for (int i = 0; i < 100; i++){
            int num = (int)(Math.random()* 10) + 1;
            numeros.add(num);
        }

        System.out.println("Original: " + numeros);

        numeroscopia.add(5);
        numeros.removeAll(numeroscopia);

        System.out.println("Sin 5: " + numeros);
    }
}
