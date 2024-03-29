/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aptec;
//

public class TASKSLIST {
    
    
    ////
    public TASKNODE Head;
    public TASKNODE Tail;
    public TASKNODE Current;
    public int size;

    
    
    public int getsize() {
        return this.size;
    }
    
    

    public void insert(TASK num) {
        TASKNODE temp = new TASKNODE(num);
        if (Head == null) {
            Head = temp;
            Tail = temp;
            size++;
        } else {
            Tail.setNext(temp);
            Tail = temp;
            size++;
        }
    }
    
    

    public boolean findData(TASK num) {
        TASKNODE temp = this.Head;
        while (temp != null) {
            if (temp.getVERTEX() == num) {
                //System.out.println(temp.getData());
                return true;
            } else {
                temp = temp.getNext();
            }
        }
        return false;
    }
    
    
    

    public void seelist() {
        TASKNODE temp = Head;
        while (temp != null) {
            System.out.println(temp.getVERTEX().getDESCRIPTION());
            temp = temp.getNext();
        }
    }
    
    
    public void sort() {
        if (size > 1) {
            for (int i = 0; i < size; i++ ) {
                TASKNODE currentNode = Head;
                TASKNODE next = Head.Next;
                for (int j = 0; j < size - 1; j++) {
                    if (currentNode.getVERTEX().getPRIORITY() < next.getVERTEX().getPRIORITY()) {
                        TASK temp = currentNode.VERTEX;
                        currentNode.VERTEX = next.VERTEX;
                        next.VERTEX = temp;
                    } 
                    currentNode = next;
                    next = next.getNext();                   
                } 
            }
        }
    }
    
    
      public void sortList() {  
        //Node current will point to head  
        TASKNODE current = Head, index = null;  
        TASKNODE temp;  
          
        if(Head == null) {  
            return;  
        }  
        else {  
            while(current != null) {  
                //Node index will point to node next to current  
                index = current.getNext();  
                  
                while(index != null) {  
                    //If current node's data is greater than index's node data, swap the data between them  
                    if(current.getVERTEX().getPRIORITY() < index.getVERTEX().getPRIORITY()) {  
                        temp= current;  
                        current = index;  
                        index = temp;  
                    }  
                    index = index.getNext();  
                }  
                current = current.getNext();  
            }      
        }  
    }
     
    
    

    
    
    
    
    
    
    
    
   
}
