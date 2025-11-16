/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comprame.dac;

import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Rafae
 */
public class Lista {
    
    protected  Producto lista[]=new Producto[20];

    public Lista(String nombreFichero) {
        
        String frase;
        String frase1;
        String nombre;
        String numero;
        String separado[]=new String[2];
        int pos=0;
        try{
           File file = new File(nombreFichero);
           FileReader filereader=new FileReader(file);
           BufferedReader  bufferedReader=new BufferedReader(filereader);
           
                frase1=bufferedReader.readLine();
             
                frase=bufferedReader.readLine();
                //nos aseguramos en la primera iteracion que no importe si no hay contenidos en la lista
                if(frase!=null){
                separado=frase.split(":");
                nombre=separado[0];
                numero=separado[1];
                }
                 while(frase!=null){
                     
                        separado=frase.split(":");
                          nombre=separado[0];
                         numero=separado[1];
                         
                    lista[pos]= new Producto(nombre,numero);
                     
                        frase=bufferedReader.readLine();
                        
                         
                     pos=pos+1;
                 
                }
           
           bufferedReader.close();
           
        }catch(FileNotFoundException e1){
              System.out.println(e1.getMessage());
         }catch(IOException e2){
              System.out.println(e2.getMessage());
     }
        
    }
    
    
    public void actualizarArray(int tam){
    
    }
    
    public  void nuevoProducto() throws LlenaException{
        String nombre;
        String unidades;
        boolean insertado=false;
        
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Por favor introduzca el nombre del producto: ");
        nombre= scan.nextLine();
        System.out.println("Por favor introduzca el numero de unidades: ");
        unidades=scan.nextLine();
        for(int i=0;i<lista.length;i++){
            //nos cercionamos de que no exista, si existe no se añade a la lista
            if( lista[i]!=null && (lista[i].getProducto()).equals(nombre)){ 
                insertado=true;
            }else{
                
            if(lista[i]==null && insertado==false){
                lista[i]=new Producto(nombre,unidades);
                insertado=true;
            }
                }
        }
        if(insertado==false){
            throw new LlenaException();
        }
        insertado=false;
        
    }
    
    public void visualizarLista(){
        for(int i=0; i<lista.length;i++){
        
        if(lista[i]==null){
        
        }else{
            System.out.println(lista[i].toString());
        }
            
        }
        
    }
    
    public void modificar() throws UnidadesA0Exception{
       Scanner scan=new Scanner(System.in);
        boolean seguir=false;
        String entrada;
        String producto;
        String numero;
        
        while(seguir==false){
            System.out.println("A seleccionado Producto, elija que desea hacer:\n-------------------------------------------------"
                    + "\n1.Modificar unidades\n2.Elimiar Producto\n3.Eliminar Lista\n4.Volver a menu principal");
            entrada=scan.nextLine();
        switch(entrada.toUpperCase()){
            case "1":
                
                System.out.println("Introduzca el producto a modificar: ");
                producto=scan.nextLine();
                
                System.out.println("Introduzque las unidades deseadas:");
                numero=scan.nextLine();
                
                if(numero.equals("0")){
                    throw new UnidadesA0Exception();
                }
                
                for(int i=0;i<lista.length;i++){
            if(lista[i]==null){
            
            }else{
               if( (producto.toUpperCase()).equals(((lista[i].getProducto()).toUpperCase()).substring(0,producto.length()))){
                   lista[i].setUnidades(numero);
               }
                
            }
        }
                break;
            case "2":
               System.out.println("Introduzca el producto a eliminar: ");
                producto=scan.nextLine();
                 for(int i=0;i<lista.length;i++){
            if(lista[i]==null){
            
            }else{
             
                if(producto.length()==(lista[i].getProducto()).length()){
                    
                if( (producto.toUpperCase()).equals(((lista[i].getProducto()).toUpperCase()).substring(0,producto.length()))){
                   lista[i]=null;
                    }
                  }
                }
        }
                break;
            case "3":
                System.out.println("Eliminando lista...");
                for(int i=0;i<lista.length;i++){
                    lista[i]=null;
                }
                break;
            case "4":
                seguir=true;
                System.out.println("Volviendo a menu principal...");
                break;
            case "MODIFICAR UNIDADES":
                
                 System.out.println("Introduzca el producto a modificar: ");
                producto=scan.nextLine();
                
                System.out.println("Introduzque las unidades deseadas:");
                numero=scan.nextLine();
                
                if(numero.equals("0")){
                    throw new UnidadesA0Exception();
                }
                
                for(int i=0;i<lista.length;i++){
            if(lista[i]==null){
            
            }else{
               if( (producto.toUpperCase()).equals(((lista[i].getProducto()).toUpperCase()).substring(0,producto.length()))){
                   lista[i].setUnidades(numero);
               }
                
            }
        }
                break;
           case"ELIMINAR PRODUCTO":
               System.out.println("Introduzca el producto a eliminar: ");
                producto=scan.nextLine();
                 for(int i=0;i<lista.length;i++){
            if(lista[i]==null){
            
            }else{
                
                if(producto.length()==(lista[i].getProducto()).length()){
                    
                if( (producto.toUpperCase()).equals(((lista[i].getProducto()).toUpperCase()).substring(0,producto.length()))){
                   lista[i]=null;
                    }
                  }
                }
        }
                    break;
           case"ELIMINAR LISTA":
                System.out.println("Eliminando lista...");
                for(int i=0;i<lista.length;i++){
                    lista[i]=null;
                }
                System.out.println("Lista eliminada.");
               break;
           case"VOLVER A MENU PRINCIPAL":
               seguir=true;
                System.out.println("Volviendo a menu principal...");
               break;
        }
        }
        
    }
    
    public  void buscar(){
        Scanner scan=new Scanner(System.in);
        
        String buscado;
        System.out.println("Escriba que producto desea buscar: ");
        buscado=scan.nextLine();
        
        for(int i=0;i<lista.length;i++){
            if(lista[i]==null){
            
            }else{
               if( (buscado.toUpperCase()).equals(((lista[i].getProducto()).toUpperCase()).substring(0,buscado.length()))){
                   System.out.println(lista[i].toString());
               }
                
            }
        }
    
    }
    
    public void salir(String nombreFichero){
        //creamos todos los archivos de respaldo
        
            File fileP= new File(nombreFichero);
         try{
             
              BufferedWriter out = new BufferedWriter(new FileWriter(fileP,false));
                out.write("Productos:Unidades");
                out.newLine();
              for(int i=0;i<lista.length;i++){
                  
                   if(lista[i]==null){
        
                   
                   }else{
                       
                       out.write(lista[i].getProducto());
                       out.write(":");
                       out.write(lista[i].getUnidades());
                       out.newLine();
                       
                     }
              }
              
               out.close();
              
         }catch(FileNotFoundException e1){
              System.out.println(e1.getMessage());
         }catch(IOException e2){
              System.out.println(e2.getMessage());
     }
         
         try{
              File file= new File("compracopia.txt");
              BufferedWriter out = new BufferedWriter(new FileWriter(file,false));
                out.write("Productos:Unidades");
                out.newLine();
              for(int i=0;i<lista.length;i++){
                  
                   if(lista[i]==null){
        
                   
                   }else{
                       
                       out.write(lista[i].getProducto());
                       out.write(":");
                       out.write(lista[i].getUnidades());
                       out.newLine();
                       
                     }
              }
              
               out.close();
              
         }catch(FileNotFoundException e1){
              System.out.println(e1.getMessage());
         }catch(IOException e2){
              System.out.println(e2.getMessage());
     }
         
         try{
              
              File file= new File("log.txt");
              BufferedWriter out = new BufferedWriter(new FileWriter(file,false));       
                out.write(lista.length);
                out.write(":");
                out.write(fileP.getAbsolutePath());
                
               out.close();
              
         }catch(FileNotFoundException e1){
              System.out.println(e1.getMessage());
         }catch(IOException e2){
              System.out.println(e2.getMessage());
     }
         
    }
    
}
