/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comprame.dac;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Rafae
 */
public class LlenaException extends Exception{

    public LlenaException() {
        Scanner scan=new Scanner(System.in);
        String Llena="Lista Llena";
        String tam;
          try{
                 //añadimos el mensaje a la lista de errores existentes
              File file= new File("archivo.txt");
              BufferedWriter out = new BufferedWriter(new FileWriter(file,true));       
              
              out.write(Llena);
              out.close();
         }catch(FileNotFoundException e1){
              System.out.println(e1.getMessage());
         }catch(IOException e2){
              System.out.println(e2.getMessage());
     }
        
        System.out.println(Llena);
        System.out.println("Desea cambiar el tamaño?");
        tam=scan.nextLine();
        
    }

    public LlenaException(String message) {
        super(message);
    }

    public LlenaException(String message, Throwable cause) {
        super(message, cause);
    }

    public LlenaException(Throwable cause) {
        super(cause);
    }

    public LlenaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
