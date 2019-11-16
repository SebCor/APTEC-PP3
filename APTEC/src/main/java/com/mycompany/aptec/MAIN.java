/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aptec;

import java.util.Scanner;


public class MAIN {
    
     public static void main(String[] args) {
         
         RESOURCE_LIST listarecurso = new RESOURCE_LIST();
         TASKSLIST TaskList = new TASKSLIST();
        
           // DEFINIR EL SZE DEL GRAFO
         
         //
         
         
         Resources recurso1 = new Resources ();
         recurso1.setAVAILABLE(17);
         recurso1.setCAPABILITY("ALTA");
         recurso1.setID(989);
         recurso1.setNAME("MESAS");
         recurso1.setTYPE("Material");
         
         Resources recurso2 = new Resources ();
         recurso2.setAVAILABLE(91);
         recurso2.setCAPABILITY("ALTA");
         recurso2.setID(234);
         recurso2.setNAME("SILLAS");
         recurso2.setTYPE("Material");
         
         Resources recurso3 = new Resources ();
         recurso3.setAVAILABLE(81);
         recurso3.setCAPABILITY("ALTA");
         recurso3.setID(754);
         recurso3.setNAME("PROGRAMADOR");
         recurso3.setTYPE("");
         
         Resources recurso4 = new Resources ();
         recurso4.setAVAILABLE(79);
         recurso4.setCAPABILITY("ALTA");
         recurso4.setID(26387);
         recurso4.setNAME("CONTADOR");
         recurso4.setTYPE("Recurso Humano");
         
         Resources recurso5 = new Resources ();
         recurso5.setAVAILABLE(15);
         recurso5.setCAPABILITY("ALTA");
         recurso5.setID(732);
         recurso5.setNAME("DISEÑADOR");
         recurso5.setTYPE("Recurso Humano");
         
         System.out.println();
         System.out.println();
         
         listarecurso.insert(recurso5);
         listarecurso.insert(recurso4);
         listarecurso.insert(recurso3);
         listarecurso.insert(recurso2);
         listarecurso.insert(recurso1);
         
         listarecurso.seelist();
         
         
         
        TASK tarea1 = new TASK();
        tarea1.setIDTK(5);
        tarea1.setDESCRIPTION("No aplica");
        
        TASK tarea2 = new TASK();
        tarea2.setIDTK(1);                 // MONTAR LAS TAREAS y SUS ID
        
        TASK tarea3 = new TASK();
        tarea3.setIDTK(2);
        
        TASK tarea4 = new TASK();
        tarea4.setIDTK(3);
        
        TASK tarea5 = new TASK();
        tarea5.setIDTK(4);
        
        

        
        TaskList.insert(tarea5);
        TaskList.insert(tarea4);
        TaskList.insert(tarea3);  // montar la lista con todas las tareas del grafo 
        TaskList.insert(tarea2);
        TaskList.insert(tarea1);
        
        Matriz_de_adyacencia matriz = new Matriz_de_adyacencia(TaskList.getsize());
        
        TASKNODE tareaNodo = new TASKNODE();
        TASKNODE tareaNodo2 = new TASKNODE();
        TASKNODE tareaNodo3 = new TASKNODE();
        TASKNODE tareaNodo4 = new TASKNODE();
        TASKNODE tareaNodo5 = new TASKNODE();
        TASKNODE tareaNodo6 = new TASKNODE();
        
        tareaNodo.setACCWEIGHT(5);
        tareaNodo2.setACCWEIGHT(3);
        tareaNodo3.setACCWEIGHT(6);
        tareaNodo4.setACCWEIGHT(2);
        tareaNodo5.setACCWEIGHT(9);
        tareaNodo6.setACCWEIGHT(0);
        
        tareaNodo.setVERTEX(tarea1);
                      
        matriz.agregar(0, 0,tareaNodo6);
        matriz.agregar(0, 1,tareaNodo);
        matriz.agregar(0, 2,tareaNodo);
        matriz.agregar(0, 3,tareaNodo);
        matriz.agregar(0, 4,tareaNodo);
        
        tareaNodo2.setVERTEX(tarea2);
        
        matriz.agregar(1, 0,tareaNodo2);
        matriz.agregar(1, 1,tareaNodo6);
        matriz.agregar(1, 2,tareaNodo2);
        matriz.agregar(1, 3,tareaNodo2);
        matriz.agregar(1, 4,tareaNodo2);
        
        tareaNodo3.setVERTEX(tarea3);
        
        // METER NODOS / VERTICES AL GRAFO
        
        matriz.agregar(2, 0,tareaNodo3);
        matriz.agregar(2, 1,tareaNodo3);
        matriz.agregar(2, 2,tareaNodo6);
        matriz.agregar(2, 3,tareaNodo3);
        matriz.agregar(2, 4,tareaNodo3);
        
        tareaNodo4.setVERTEX(tarea4);
        
        matriz.agregar(3, 0,tareaNodo4);
        matriz.agregar(3, 1,tareaNodo4);
        matriz.agregar(3, 2,tareaNodo4);
        matriz.agregar(3, 3,tareaNodo6);
        matriz.agregar(3, 4,tareaNodo4);
        
        tareaNodo5.setVERTEX(tarea5);
        
        matriz.agregar(4, 0,tareaNodo5);
        matriz.agregar(4, 1,tareaNodo5);
        matriz.agregar(4, 2,tareaNodo5);
        matriz.agregar(4, 3,tareaNodo5);
        matriz.agregar(4, 4,tareaNodo6);
        
        matriz.imprimir();        // VER LOS VERTICES QUE SE ENCIUENTRAN EN EL GRAFO
        
        Prims prims = new Prims(TaskList.getsize());
        prims.primsAlgorithm(matriz);
        prims.printMST(matriz);
        
        
	}
        
        
        
    }
    

