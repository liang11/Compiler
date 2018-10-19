/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import jdk.management.resource.internal.ApproverGroup;

/**
 *
 * @author rlian
 */
public class ExpressionList {
    private ArrayList<Expression> expressionList;

    public ExpressionList() {
        this.expressionList = new ArrayList<Expression>();
    }
   
    public void addExpression(Token token, String expression, int line){
        Expression exp = new Expression(token, expression, line);
        if(this.contiene(exp)){
            int idx = expressionList.indexOf(exp);
            System.out.println(idx);
//            Expression temp = expressionList.get(idx);
//            int pos = temp.appearance.indexOf(new Appearances(line,1));
                        
        } else{
            expressionList.add(exp);
        }
    }
    
    public boolean contiene(Expression o){
        System.out.println("Entre al contains");
        String temp = o.getExpresion();
        for (Expression expressionList1 : expressionList) {
            if(expressionList1.getExpresion().equals(temp)){
                System.out.println("son IGAELES!");
                return true;
            }
        }
        return false;
    }
    
}
