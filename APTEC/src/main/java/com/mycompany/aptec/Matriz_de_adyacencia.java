/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aptec;

/**
 *
 * @author Sebastian
 */
public class Matriz_de_adyacencia {
    // SI NO ENTIENDE VER ESTE VIDEO : https://www.youtube.com/watch?v=wrV2idk3iPc
    
    /////
    
    public int n;
    public TASKNODE [][] matriz;
    
  
    public Matriz_de_adyacencia(int n) {
        this.n = n;
        matriz = new TASKNODE[n][n];
        //se inicializa matriz en el size de n
               
        
    }

    public void agregar(int i, int j, TASKNODE tarea){
        matriz[i][j] = tarea;
    }     
    
    
    

    
    public void imprimir(){
        for(int i=0; i < n; i++){
           for(int j=0; j< n; j++){
               TASKNODE O = matriz[i][j];
               
               if(O != null){
                 System.out.print(matriz[i][j].getACCWEIGHT() + " " ); 
               }
               
            }
            System.out.println();
        }
    }
    
    
}