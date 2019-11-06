/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aptec;


public class MAIN {
    
     public static void main(String[] args) {
         
         
         TASKSLIST TaskList = new TASKSLIST();
         Matriz_de_adyacencia matriz = new Matriz_de_adyacencia(5);   // DEFINIR EL SZE DEL GRAFO
        
        TASK tarea1 = new TASK();
        tarea1.setIDTK(0);
        
        TASK tarea2 = new TASK();
        tarea2.setIDTK(1);                 // MONTAR LAS TAREAS y SUS ID
        
        TASK tarea3 = new TASK();
        tarea3.setIDTK(2);
        
        TASK tarea4 = new TASK();
        tarea4.setIDTK(3);
        
        TASK tarea5 = new TASK();
        tarea5.setIDTK(4);
        
        
        TASKNODE T1 = new TASKNODE(tarea1);
        TASKNODE T2 = new TASKNODE(tarea2);
        TASKNODE T3 = new TASKNODE(tarea3);    // NODOS QUE SERAN INGRESADOS AL GRAFO
        TASKNODE T4 = new TASKNODE(tarea4);
        TASKNODE T5 = new TASKNODE(tarea5);
        
        TaskList.insert(tarea5);
        TaskList.insert(tarea4);
        TaskList.insert(tarea3);  // montar la lista con todas las tareas del grafo 
        TaskList.insert(tarea2);
        TaskList.insert(tarea1);
        
      
                      
        matriz.agregar(0, 1,tarea1);
        matriz.agregar(0, 1,tarea1);
        matriz.agregar(0, 2,tarea1);
        matriz.agregar(0, 3,tarea1);
        
        matriz.agregar(1, 0,tarea2);
        matriz.agregar(1, 0,tarea2);
        matriz.agregar(1, 4,tarea2);
        
        matriz.agregar(2, 0,tarea3);     // METER NODOS / VERTICES AL GRAFO
        matriz.agregar(2, 3,tarea3);
        matriz.agregar(2, 4,tarea3);
        
        matriz.agregar(3, 0,tarea4);
        matriz.agregar(3, 2,tarea4);
        
        matriz.agregar(4, 1,tarea5);
        matriz.agregar(4, 2,tarea5);
        matriz.agregar(4, 4,tarea5);
        
        
        
        matriz.imprimir();           // VER LOS VERTICES QUE SE ENCIUENTRAN EN EL GRAFO
        
	}
        
        
        
    }
    

