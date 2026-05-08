/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD10_A10;
import java.util.*;
/**
 *
 * @author ALUMNO
 */
public class Main {
    public static void main(String[] args){
        Set<Socio> socios = new HashSet<>();
        
        socios.add(new Socio("03494227K","Fran"));
        socios.add(new Socio("03494227E", "Alfonso"));
        
        System.out.println(socios);
        
        Set<Socio> orden = new TreeSet<>(socios);
        System.out.println(orden);
        
        List<Socio> listado = new ArrayList<>(orden);
        listado.add(new Socio("034942279J", "Soledad"));
        System.out.println(listado);
        
        
    }   
}
