/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aptec;


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
        tarea1.setIDTK(0);
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
    

