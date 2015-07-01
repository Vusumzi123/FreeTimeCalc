/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.math.BigDecimal;

/**
 *
 * @author vuszi
 */
public class Actions extends Vars{
        
    
    public String numPress(char num){
        
        this.calcInput = ""+num;
        this.cacheInput = this.cacheInput+this.calcInput;
        this.calcOutput =this.calcOutput+this.calcInput;
        this.myVar = BigDecimal.valueOf(Double.parseDouble(this.cacheInput));
        
        System.out.println("myVar = "+this.myVar);  //console debug
        
        return this.calcOutput;
        
    }
    
    public String operatorPress(char op){
        
        this.flag=op;
        
        switch (this.flag){
            case '+':
                this.cache= new Operations().sum(this.cache, this.myVar);
                break;
            case '-':
                this.cache= new Operations().subs(this.cache, this.myVar);
                break;
            case '*':
                this.cache= new Operations().mult(this.cache, this.myVar);
                break;
            case '÷':
                this.cache= new Operations().div(this.cache, this.myVar);
                break;
            case 'e':
                break;
        }
        

        this.result=this.cache;
        this.calcOutput=this.calcOutput+op;
        
        this.cacheInput ="";  //limpia cache de entrada
        
        System.out.println("result ="+this.result); //console debug
        
        
        this.myVar=BigDecimal.valueOf(0);
        return this.calcOutput;
    }
    
    
    public String eqPress(){
        switch (this.flag){
            case '+':
                this.cache= new Operations().sum(this.cache, this.myVar);
                break;
            case '-':
                this.cache= new Operations().subs(this.cache, this.myVar);
                break;
            case '*':
                this.cache= new Operations().mult(this.cache, this.myVar);
                break;
            case '÷':
                this.cache= new Operations().div(this.cache, this.myVar);
                break;
            case 'e':
                break;
        }
        
        this.result=this.cache;
        this.cacheInput="";
        this.calcOutput=""+result;
        this.myVar=BigDecimal.valueOf(0);
        
        System.out.println("result ="+this.result); //console debug
        
        
        return this.calcOutput;
    }
    
}
