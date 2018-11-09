package Analizadores;

public class TError {
    String mensaje;
    int line,columna;

    public TError(String mensaje, int line) {
        this.mensaje = mensaje;
        this.line = line;
    }
    
    public String toString(){
        return this.mensaje + " error en la linea: " + this.line;
    }
    
}