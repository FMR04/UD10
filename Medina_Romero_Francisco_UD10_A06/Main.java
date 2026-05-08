/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD10_A06;
import java.util.*;
/**
 *
 * @author ALUMNO
 */
public class Main {
    public void main (String[] args){
        Collection<Integer> numeros = new ArrayList<>();
        
        for (int i = 0; 20 > i; i++){
            int ale = (int) (Math.random() * 10) + 1;
            numeros.add(ale);
        }
        
        Integer[] tabla = numeros.toArray(new Integer[0]);
        
        Arrays.sort(tabla);
        Collection<Integer> orden = new ArrayList<>(Arrays.asList(tabla));
        
        System.out.println("Original: " + numeros);
        System.out.println("Orden: " + orden);
    }
}
