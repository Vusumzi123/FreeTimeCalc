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
public class Operations {
    
    public BigDecimal sum(BigDecimal a, BigDecimal b ){
     
        return a.add(b);
    }
    
    public BigDecimal subs(BigDecimal a, BigDecimal b){
        
        return a.subtract(b);
    }
    
    public BigDecimal div(BigDecimal a, BigDecimal b){
        
        return a.divide(b);
    }
    
    public BigDecimal mult(BigDecimal a, BigDecimal b){
        
        return a.multiply(b);
    }
    
}
