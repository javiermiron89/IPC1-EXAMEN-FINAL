/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal_201602694;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier
 */
public class ExamenFinal_201602694 {

     /**
      * @param args the command line arguments
      */
     public static void main(String[] args) {
          Lista_Doble lista = new Lista_Doble();
          int opcion = 0;
          int elemento;
          //
          //Crear un menu
          do{
               try {
                    //Creamos el menu de opciones
                    opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Mostrar Elementos de Inicio a Fin \n" + "2. Insertar Inicio \n" + "3. Insertar Final \n" 
                    + "4. Buscar y Modificar \n" + "5. Tamaño \n" + "6. Mostra Ultimo \n" + "7. Buscar Elimnar (Eliminar final) \n" + "8. Salir\n", JOptionPane.INFORMATION_MESSAGE));
                    switch(opcion){
                         case 1:
                              //Verificar si la lista no esta vacia
                              if (!lista.estaVacia()) {
                                   lista.MostrarListaDobleInicioFin();
                              } else {
                                   JOptionPane.showMessageDialog(null, "No se encuentran nodos agregados", "Error", JOptionPane.INFORMATION_MESSAGE);
                              }
                              break;
                         case 2:
                              //Pedir el elemento
                              elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento del nodo", "Agregar un nodo al inicio", JOptionPane.INFORMATION_MESSAGE));
                              lista.InsertarAlInicio(elemento);
                              break;
                         case 3:
                              //Pedir el elemento
                              elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento del nodo", "Agregar un nodo al final", JOptionPane.INFORMATION_MESSAGE));
                              lista.InsertarAlFinal(elemento);
                              break;
                         case 4:
                              elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento a modificar", "Modificar", JOptionPane.INFORMATION_MESSAGE));
                              if (lista.EnLaLista(elemento) == true) {
                                   JOptionPane.showMessageDialog(null, "El elemento " + elemento + " si esta en la lista", "En la lista", JOptionPane.INFORMATION_MESSAGE);
                              } else {
                                   JOptionPane.showMessageDialog(null, "El elemento " + elemento + " no esta en la lista", "No se encuentra enn la lista", JOptionPane.INFORMATION_MESSAGE);
                              }
                              break;
                         case 5:
                              JOptionPane.showMessageDialog(null, "La lista tiene esta " + " cantidad de elementos", "En la lista", JOptionPane.INFORMATION_MESSAGE);
                              break;
                         case 6:
                              if (!lista.estaVacia()) {
                                   elemento = lista.MostrarUltimo();
                                   JOptionPane.showMessageDialog(null, "El ultimo elemento es: " + elemento, "Mostrar Ultimo", JOptionPane.INFORMATION_MESSAGE);
                              } else {
                                   JOptionPane.showMessageDialog(null, "No se encuentran nodos agregados", "Error", JOptionPane.ERROR_MESSAGE);
                              }
                              break;
                         case 7:
                              if (!lista.estaVacia()) {
                                   elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento a eliminar", "Buscando Nodo", JOptionPane.INFORMATION_MESSAGE));
                                   if (lista.EnLaLista(elemento)) {
                                        elemento = lista.eliminarFinal();
                                        JOptionPane.showMessageDialog(null, "El eliminado es: " + elemento, "Eliminar del final", JOptionPane.INFORMATION_MESSAGE);
                                   } else {
                                        JOptionPane.showMessageDialog(null, "El elemento: " + elemento + " no esta en la lista", "No esta en la lista", JOptionPane.INFORMATION_MESSAGE);
                                   }
                              } else {
                                   JOptionPane.showMessageDialog(null, "No se encuentran nodos agregados", "Error", JOptionPane.INFORMATION_MESSAGE);
                              }
                              break;
                         case 8:
                              JOptionPane.showMessageDialog(null, "Gracias por utilizar el programa", "Salir", JOptionPane.INFORMATION_MESSAGE);
                              break;
                         default:
                              JOptionPane.showMessageDialog(null, "Opcion no disponible", "Error", JOptionPane.ERROR_MESSAGE);
                              break;
                    }
               } catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Error al ingresar la opcion: " + ex.getMessage(), "ERRROR", JOptionPane.ERROR_MESSAGE);
               }
          } while(opcion != 8);
     }
     
}
