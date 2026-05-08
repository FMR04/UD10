/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD10_A10;

/**
 *
 * @author ALUMNO
 */
public class Socio implements Comparable<Socio>{
    String DNI;
    String Nombre;

    public Socio(String DNI, String Nombre){
        this.DNI = DNI;
        this.Nombre = Nombre;
    }

    @Override
    public boolean equals(Object obj){
        return DNI.equals(((Socio) obj).DNI);
    }

    @Override
    public int hashCode(){
        return DNI.hashCode();
    }

    @Override
    public int compareTo(Socio otro){
        return DNI.compareTo(otro.DNI);
    }

    @Override
    public String toString(){
        return "[ " + DNI + " , " + Nombre + "]";
    }
}
