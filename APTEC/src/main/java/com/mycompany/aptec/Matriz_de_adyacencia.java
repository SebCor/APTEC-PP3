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
    
    ////////
    
    public int n;
    public int [][] matriz;
    
  
    public Matriz_de_adyacencia(int n) {
        this.n = n;
        matriz = new int[n][n];
        //se inicializa matriz en el size de n
               
        
    }

    public void agregar(TASKNODE SOURCE, TASKNODE DESTINY, int Weight){
        
        matriz[SOURCE.getVERTEX().getIDTK()][DESTINY.getVERTEX().getIDTK()] = Weight;
    }     
    
    
    

    
//    public void imprimir(){
//        for(int i=0; i < n; i++){
//           for(int j=0; j< n; j++){
//               int O = matriz[i][j];
//               
//             
//                 System.out.print(matriz[i][j] + " " ); 
//               }
//               
//            }
//            System.out.println();
//        }
//    }
    


  public void imprimir(){
        for(int i=0; i< n-1; i++){
            for(int j=0; j< n-1; j++){
                System.out.print( matriz[i][j] + "  " );        
            }
            System.out.println();
        }  
    }
}
    
