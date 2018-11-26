/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizadores;

import java.util.LinkedList;

/**
 *
 * @author rlian
 */
public class Nodo_Variable {
    private String id,tipo,ambito;
    public LinkedList<String> temp = new LinkedList<String>();
    
    public Nodo_Variable(String id, String tipo, String ambito) {
        this.id = id;
        this.tipo = tipo;
        this.ambito = ambito;
        for (String string : temp) {
            
        }
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }
   
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Nodo_Variable{" + "id=" + id + ", tipo=" + tipo + ", ambito=" + ambito + '}';
    }
}
