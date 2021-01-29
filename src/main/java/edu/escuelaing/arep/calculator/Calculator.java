/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.calculator;

import java.util.List;

/**
 *
 * @author Esteban Bernal
 */
public class Calculator {

    /**
     *
     * @param Numbers
     * @return
     */
    
    public Calculator(){}
    public static Double Mean(List<Double> Numbers) {
        Double result = 0.0;
        for(Double x: Numbers){
            result += x;
        }
        int SizeList = Numbers.size();
        
        return result/SizeList;
    }
    
    public static Double Deviation(List<Double> Numbers){
        Double result = 0.0;
        Double mean = Mean(Numbers);
        int SizeList = Numbers.size();
        for(Double x: Numbers){
            result += Math.pow(x-mean,2);
        }
        return Math.sqrt(result/(SizeList-1));
    }

}
