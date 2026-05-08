/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD10_A07;
import java.util.*;
/**
 *
 * @author ALUMNO
 */
public class Main {
    public static void main(String[] args){
        List<Integer> lista1 = new ArrayList<>(Arrays.asList(10,20,30,40));
        List<Integer> lista2 = new ArrayList<>(Arrays.asList(99,99));

        lista1.add(0,5);
        lista1.addAll(1, lista2);
        
        int i4 = lista1.get(3);
        System.out.println("Indice 4 de la primera lista: " + i4 );
        int pos = lista1.size() - 1;
        int sust = lista1.set(pos , 500);
        System.out.println("sustituido: " + sust);
        
        lista1.remove(Integer.valueOf(0));
        lista1.remove(Integer.valueOf(99));
        System.out.println("Estado final: " + lista1);
    
    }
}
