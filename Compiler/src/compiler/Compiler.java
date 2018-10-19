/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler;

import Controller.ControllerPrincipalView;
import java.io.File;

/**
 *
 * @author rlian
 */
public class Compiler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        jflex.Main.generate(new File("C:\\TEC\\Compiladores\\Proyecto\\Compiler\\src\\Model\\Lexer.flex"));
        Controller.ControllerPrincipalView principalView = new ControllerPrincipalView();
        principalView.initInterface();
    }
    
}
