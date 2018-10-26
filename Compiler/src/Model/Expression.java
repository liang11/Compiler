/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author rlian
 */
public class Expression {
    public Token token;
    public String expresion;
    public ArrayList<Integer> line = new ArrayList<>();
    public ArrayList<Integer> amount = new ArrayList<>();

    public Expression(Token token, String expresion, int line) {
        this.token = token;
        this.expresion = expresion;
        this.line.add(line);
        this.amount.add(1);
    }
    
    public Token getToken() {
        return token;
    }

    public void setToken(Token token) {
        this.token = token;
    }

    public String getExpresion() {
        return expresion;
    }

    public void setExpresion(String expresion) {
        this.expresion = expresion;
    }

    public ArrayList<Integer> getLine() {
        return line;
    }

    public void setLine(ArrayList<Integer> line) {
        this.line = line;
    }

    public ArrayList<Integer> getAmount() {
        return amount;
    }

    public void setAmount(ArrayList<Integer> amount) {
        this.amount = amount;
    }
   
    public String appeareanceToString(){
        String result = "";
        int size = line.size();
        for(int i = 0; i < size; i++){
            result = result + line.get(i).toString();
            if(amount.get(i) > 1){
                result = result + "(" + amount.get(i).toString() + ")";
            }
            if((i+1) != size){
                result = result + ", ";
            }            
        }
        return result;
    }
    
}
