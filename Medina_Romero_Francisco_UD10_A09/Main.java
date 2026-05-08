/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD10_A09;
import java.util.*;
/**
 *
 * @author ALUMNO
 */
public class Main {
    public void main(String[] args){
        List<Integer> treinta = new ArrayList<>(Arrays.asList());
        
        for (int i = 0; i < 30; i++){
            int num = (int) (Math.random() * 10) + 1;
            treinta.add(num);
        }
        
        // No tiene ningún orden
        Set<Integer> numerosH = new HashSet<>(treinta);
        System.out.println("Hash set " + numerosH);
        // Ordena de forma natural automaticamente
        Set<Integer> numerosT = new TreeSet<>(treinta);
        System.out.println("Tree set " + numerosT);
        // Se ordena según el orden de inserción
        Set<Integer> numerosL = new LinkedHashSet<>(treinta);
        System.out.println("LinkedHashSet: " + numerosL);
              
        
        
    }
}
