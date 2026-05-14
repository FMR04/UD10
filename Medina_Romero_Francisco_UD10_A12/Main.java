/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD10_A12;
import java.util.*;
/**
 *
 * @author ALUMNO
 */
public class Main {
    public static void main(String[] args){
        List<Integer> listaa = new ArrayList<>(List.of(100,50,500,50,200));

        int Cantidad = Collections.frequency(listaa, 50);
        System.out.println("Cantidad de 50: " + Cantidad );
       
        int notaMasAlta = Collections.max(listaa);
        int notaMasBaja = Collections.min(listaa);

        System.out.println("Mas alto: " + notaMasAlta);
        System.out.println("Nota mas baja: " + notaMasBaja);
        
        Collections.shuffle(listaa);
        System.out.println("Shuffle: " + listaa);
        
        Collections.sort(listaa);
        System.out.println("Lista ordenada: " + listaa);
        
        int buscar = Collections.binarySearch(listaa, 50);
        System.out.println(buscar);
    }
}
