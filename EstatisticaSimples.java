/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Estatistica_simples {
    
    
    public int max(ArrayList<Integer> lista){
        int max=lista.get(0);
       for(Integer x : lista){
           if(x>max)max=x;
       }
        
        return max;
    }
    
    public int min(ArrayList<Integer> lista){
        int min=lista.get(0);
       for(Integer x : lista){
           if(x<min)min=x;
       }
        return min;
    }
    
    public double media(ArrayList<Integer> lista){
        double media=0;
       for(Integer x : lista){
           media+=x;
       }
        return media/lista.size();
    }
    
    public int quantidade(ArrayList<Integer> lista){
        int quantidade=lista.size();
        return quantidade;
    }
    
}
