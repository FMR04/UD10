/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Medina_Romero_Francisco_UD10_A11;
import java.util.*;
/**
 *
 * @author ALUMNO
 */
public class Main {
    public static void main(String[] args) {
      Map<String, Integer> stock = new TreeMap<>();
      Scanner teclado = new Scanner(System.in);

      int num;

      do {
          System.out.println("MENU STOCK");
          System.out.println("1 = Alta producto");
          System.out.println("2 = Baja producto");
          System.out.println("3 = Actualizar stock");
          System.out.println("4 = Listar existencias");
          System.out.println("5 = Salir");
          System.out.print("Selecciona una opcion: ");

          num = teclado.nextInt();
          teclado.nextLine();

          switch (num) {

              case 1:
                  System.out.print("Código del producto: ");
                  String codigoAlta = teclado.nextLine();

                  if (stock.containsKey(codigoAlta)) {
                      System.out.println("Ese código ya existe.");
                  } else {
                      System.out.println("Stock inicial:");
                      int unidades = teclado.nextInt();
                      teclado.nextLine();

                      stock.put(codigoAlta, unidades);
                      System.out.println("Producto procesado");
                  }
                  break;

              case 2:
                  System.out.println("Codigo del producto a eliminar:");
                  String codigoBaja = teclado.nextLine();

                  if (stock.containsKey(codigoBaja)) {
                      stock.remove(codigoBaja);
                      System.out.println("Producto eliminado");
                  } else {
                      System.out.println("No existe ese producto");
                  }
                  break;

              case 3:
                  System.out.println("Código del producto:");
                  String codigoActualizar = teclado.nextLine();

                  if (stock.containsKey(codigoActualizar)) {
                      System.out.print("Nuevo Stock:");
                      int nuevoStock = teclado.nextInt();

                      stock.put(codigoActualizar, nuevoStock);
                      System.out.println("Stock actualizado");
                  } else {
                      System.out.println("No existe el producto");
                  }
                  break;

              case 4:
                  System.out.println("Stock total: ");

                  if (stock.isEmpty()) {
                      System.out.println("No hay stock");
                  } else {
                      for (String codigo : stock.keySet()) {
                          System.out.println(codigo + " = " + stock.get(codigo));
                      }
                  }
                  break;

              case 5:
                  System.out.println("Cerrando");
                  break;

              default:
                  System.out.println("Numero no valido.");
          }
      } while (num != 5);
  }  
    
}
