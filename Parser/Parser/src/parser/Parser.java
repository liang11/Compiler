/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

import Analizadores.Analizador_Lexico;
import Analizadores.Analizador_Sintactico;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.StringReader;
/**
 *
 * @author rlian
 */
public class Parser {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            FileReader fr = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fr);
            String str;
            String programa = "";
            while((str = br.readLine()) != null)
            {                
                programa += str+"\n";
                //programa += str;
                //programa += "\r";
                //programa += "X"+str;
            }
            br.close();
            
            Analizador_Lexico analizador_lexico = new Analizador_Lexico(new BufferedReader(new StringReader(programa)));
            Analizador_Sintactico analizador_sintactico = new Analizador_Sintactico(analizador_lexico);            
            System.out.println("Programa:\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n" + programa);System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\n\n");
            
            analizador_sintactico.parse();
            System.out.println(analizador_sintactico.resultado);
            
            
            //System.out.println((char)27 + "[31m" + "31 - Rojo");
            //System.out.println((char)27 + "[32m" + "32 - Verde");
            //System.out.println((char)27 + "[33m" + "33 - Amarillo");
            //System.out.println((char)27 + "[34m" + "34 - Azul");
            //System.out.println((char)27 + "[35m" + "35 - Morado");
            //System.out.println((char)27 + "[36m" + "36 - Cyan");
            //System.out.println((char)27 + "[37m" + "37 - Gray");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
}
