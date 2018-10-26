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
public class ExpressionList {
    private ArrayList<Expression> expressionList;

    public ExpressionList() {
        this.expressionList = new ArrayList<Expression>();
    }

    public ArrayList<Expression> getExpressionList() {
        return expressionList;
    }

    public void setExpressionList(ArrayList<Expression> expressionList) {
        this.expressionList = expressionList;
    }
       
    public void addExpression(Token token, String expression, int line){
        Expression exp = new Expression(token, expression, line);
        if(this.contiene(exp)){
            Expression temp = this.getExp(expression);
            if(temp.getLine().contains(line)){
                int idx = temp.getLine().indexOf(line);
                int cant_temp = temp.getAmount().get(idx);
                temp.getAmount().set(idx, cant_temp + 1);
            } else{
                temp.getLine().add(line);
                temp.getAmount().add(1);
            }
        } else{
            expressionList.add(exp);
        }
    }
    
    public boolean contiene(Expression o){
        String temp = o.getExpresion();
        for (Expression expressionList1 : expressionList) {
            if(expressionList1.getExpresion().equals(temp)){
                return true;
            }
        }
        return false;
    }
    
    public Expression getExp(String expression){
        for (Expression expression1 : expressionList) {
            if(expression1.getExpresion().equals(expression)){
                return expression1;
            }
        }
        return null;
    }
}
