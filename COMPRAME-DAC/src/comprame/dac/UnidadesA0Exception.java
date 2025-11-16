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

/**
 *
 * @author Rafae
 */
public class UnidadesA0Exception extends Exception{

    public UnidadesA0Exception() {
        
          String Cancela="no debe poner las unidades a 0, borrelo en vez de modificarlo";
          try{
              //añadimos el mensaje a la lista de errores existentes
              File file= new File("archivo.txt");
              BufferedWriter out = new BufferedWriter(new FileWriter(file,true));       
              
              out.write(Cancela);
              out.close();
         }catch(FileNotFoundException e1){
              System.out.println(e1.getMessage());
         }catch(IOException e2){
              System.out.println(e2.getMessage());
             
     }
        
 System.out.println(Cancela);
    }

    public UnidadesA0Exception(String message) {
        super(message);
    }

    public UnidadesA0Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public UnidadesA0Exception(Throwable cause) {
        super(cause);
    }

    public UnidadesA0Exception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
