/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comprame.dac;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Rafae
 */
public class COMPRAMEDAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        boolean salir=false;
        String teclado;
        String nombreFichero="Lista.txt";
        Lista lista1=new Lista(nombreFichero);
        
   while(salir==false){
   
       System.out.println("Bienvenido a COMPRAME-DAC por favor haga su selección:\n-------------------------------------------------------"
               + "\n1.Añadir producto\n2.Visualizar lista\n3.Modificar lista\n4.Buscar producto\n5.Salir");
       teclado=scan.nextLine();
       switch(teclado.toUpperCase()){
           case "1":
               try{
               lista1.nuevoProducto();
               }catch(LlenaException e){
                   
               }
               break;
           case "2":
                lista1.visualizarLista();
               break;
           case "3":
                try{
             lista1.modificar();
                }catch(UnidadesA0Exception e){}
               break;
           case "4":
               lista1.buscar();
               break;
           case "5":
              lista1.salir(nombreFichero);
               salir=true;
               System.out.println("Cerrando... gracias por utilizar nuestro servicio");
               break;
               
           case "AÑADIR PRODUCTO":
              try{
               lista1.nuevoProducto();
               }catch(LlenaException e){
                   
               }
               break;
           case "VISUALIZAR LISTA":
            lista1.visualizarLista();
               break;
            case "MODIFICAR LISTA":
                //incluye la opción de eliminar la lista completamente
                try{
             lista1.modificar();
                }catch(UnidadesA0Exception e){}
               break;
            case "BUSCAR PRODUCTO":
                 lista1.buscar();
               break;
            case "SALIR":
                lista1.salir(nombreFichero);
               salir=true;
                System.out.println("Cerrando... gracias por utilizar nuestro servicio");
               break;
               default:
                   System.out.println("Parece que se equivoco al elegir la opción, por favor vuelva a elegirla:");
                }
        }
    
    }
}
