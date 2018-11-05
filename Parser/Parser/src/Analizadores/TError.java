/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizadores;

/**
 *
 * @author rlian
 */
public class TError {
    String lexema, tipo, descripcion;
    int line,columna;

    public TError(String lexema, String tipo, String descripcion, int line, int columna) {
        this.lexema = lexema;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.line = line;
        this.columna = columna;
    }
    
}
