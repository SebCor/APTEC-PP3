/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aptec;


public class TASKSLIST {
    
    
    
    private TASKNODE Head;
    private TASKNODE Tail;
    private TASKNODE Current;
    private int size;

    
    
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
            System.out.println(temp.getVERTEX());
            temp = temp.getNext();
        }
    }
    
    
   
}
