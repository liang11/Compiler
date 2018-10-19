/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Expression;
import Model.ExpressionList;
import Model.Lexer;
import Model.Token;
import View.MainFrame;
import View.PrincipalView;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author rlian
 */
public class ControllerPrincipalView implements ActionListener {
    private static ControllerPrincipalView controllerPrincipalView;
    private MainFrame mainFrame;
    private PrincipalView principalView;

    public ControllerPrincipalView() {
        mainFrame = new MainFrame();
        principalView = new PrincipalView();
        principalView.BtnFileChooser.addActionListener(this);
    }

    public static ControllerPrincipalView getControllerPrincipalView() {
        return controllerPrincipalView;
    }

    public static void setControllerPrincipalView(ControllerPrincipalView controllerPrincipalView) {
        ControllerPrincipalView.controllerPrincipalView = controllerPrincipalView;
    }

    public MainFrame getMainFrame() {
        return mainFrame;
    }

    public void setMainFrame(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    public PrincipalView getPrincipalView() {
        return principalView;
    }

    public void setPrincipalView(PrincipalView principalView) {
        this.principalView = principalView;
    }
    
    public static ControllerPrincipalView getSingletonInstance(){
        if(getControllerPrincipalView() == null){
            controllerPrincipalView = new ControllerPrincipalView();
        }
        return controllerPrincipalView;
    }
    
    public void initInterface(){
        mainFrame.setLayout(new BorderLayout());
        mainFrame.getContentPane().add(principalView);
        mainFrame.pack();
        mainFrame.setResizable(true);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(2);
    }
    
    public static int existsExpression(String exp, ArrayList<Expression> lista){
        for(int i = 0; i < lista.size(); i++){
            
        }
        return -1;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (principalView.BtnFileChooser == ae.getSource()) {
            try {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.showOpenDialog(null);
                File file = fileChooser.getSelectedFile();
                String file_path = file.getAbsolutePath();
                System.out.println("File Path: " + file_path);

                Reader reader = new BufferedReader(new FileReader(file_path));
                Lexer lexer = new Lexer(reader);    //Llama a Lexer.java y hace toda la lectura con las expresiones.
                principalView.jText.setText("");
                String result = "";
                ExpressionList lista_expresiones = new ExpressionList();
                while (true) {
                    Token token = lexer.yylex();    //Agarra los "return" que hace el Lexer.flex.
                    if (token == null) {
                        result = result + "EOF";
                        principalView.jText.append(result);
                        //System.out.println(result);
                        return;
                    }
                    switch (token) {    //lexer.line = linea en la que encontro el token; lexer.lexeme = texto que leyo al encontrar una coincidencia con una expresion.
                        case ERROR:
                            //result = result + "Error " + " Line: " + lexer.line + " " + lexer.lexeme + "\n";
                            break;
                        case Identificador:
                            String temp = lexer.lexeme;
                            temp = temp.toLowerCase();
                            lista_expresiones.addExpression(token, temp, lexer.line);
                            result = result + "Line: " + lexer.line + " | Token: " + token + " | " + temp + "\n";
                            break;
                        case Reserved_Word: case Operator: case Literal:  
                            result = result + "Line: " + lexer.line + " | Token: " + token + " | " + lexer.lexeme + "\n";
                            break;
                        case Comment:
                            result = result + "Line: " + lexer.line + " | Token: " + token + " | " + lexer.lexeme + "\n";
                            break;
                        default:
                            result = result + "Token: " + token + "\n";
                            break;
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No file chosen", "Warning", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
