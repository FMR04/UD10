/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD10_A08;
import java.util.*;
/**
 *
 * @author ALUMNO
 */
public class Main {
    public static void main(String[] args){
        List<String> listaA = new ArrayList<>(Arrays.asList("Ana","Luis","Marta","Luis"));
        List<String> listaB = new ArrayList<>(Arrays.asList("Ana","Luis","Marta","Luis"));
        
        System.out.println("Iguales: " + listaA.equals(listaB));
        
        listaB.indexOf("Luis");
        listaB.lastIndexOf("Luis");
        
        listaA.sort(null);
        System.out.println("Iguales 2 vez: " + listaA.equals(listaB));
        
        listaB.sort(Comparator.reverseOrder());
        System.out.println("Ordenado al resev: " + listaB);
    }
}
