/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD10_A04;
import java.util.*;
/**
 *
 * @author ALUMNO
 */
public class Main {
    public static void main(String[] args){
        ArrayList<Integer> numeros = new ArrayList<>();

        
        for (int i = 0; i < 100; i++) {
            int num = (int) (Math.random() * 10) + 1;
            numeros.add(num);
        }       
Iterator<Integer> iterador = numeros.iterator();    
        while (iterador.hasNext()){
            if (iterador.next() == 5){
                iterador.remove();
            }
        }
        
        System.out.println("Lista: " + numeros);
    }
}
