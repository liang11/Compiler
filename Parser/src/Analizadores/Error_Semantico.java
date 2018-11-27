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
public class Error_Semantico {
    private String mensaje, token;

    public Error_Semantico(String mensaje, String token) {
        this.mensaje = mensaje;
        this.token = token;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Error_Semantico{" + "mensaje=" + mensaje + ", token=" + token + '}';
    }
}
