/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework;

import java.util.*;

/**
 *
 * @author sk1665s
 */
public class NumLinkedList {
    public int listSize = 0;
    
    protected NumNode head;
    public  NumLinkedList() {
    head = new NumNode();   
    }
    
public void addLast(Double element) {
        NumNode tail;
        tail = head;
        while (tail.getNext() != null) {
            tail = tail.getNext();
            }
        //insert new node at end of list
        tail.setNext( new NumNode(element,null));
        listSize++;
    }

    
    public NumNode getHead() {
        return head;
    }

    public void setHead(NumNode head) {
        this.head = head;
    }

public boolean isEmpty() {
        return  head == null;
    }

    private void removeFirst() {
        NumNode oldhead;
        oldhead = head;
        //remove first node from linked list
        if (head != null) {
           head = head.getNext();
           oldhead.setNext(null);
           }
        else {
           throw new NoSuchElementException();
           }
    }

    public void removeLast() {
        NumNode temp, previous;
        temp = head;
        previous = temp;
        //go to last node and remember previous node at all times
        while (temp != null && temp.getNext() != null) {
            previous = temp;
            temp = temp.getNext();
            }
        if (previous != null) {
           //remove last node
           previous.setNext(null);
           }
        else {
           throw new NoSuchElementException();
           }
    }
    private void removeMid(Double element) {
        NumNode temp, previous;
        temp = head.getNext();
        previous = null;
        //go to node containing element and rermember previous node at all times
        while (temp.getElement() != element && temp.getNext() != null) {
            previous = temp;
            temp = temp.getNext();
            }
        if (previous != null && temp.getNext() != null) {
           //not first or last node so we can remove node defined by temp. 
           // set the previous node to that after temp
           previous.setNext(temp.getNext());
           temp.setNext(null);
        }
        else {
           throw new NoSuchElementException();
           }
    }
    public static void printList(NumLinkedList thelist) {
        NumNode temp;
        if(thelist.isEmpty())
            System.out.println("List is empty");
        else {
            temp = thelist.head;
            while (temp != null) {
               System.out.print(temp.getElement()+" ");
               temp = temp.getNext();
            }
            System.out.println();
        }
    }
    /*public int listSize(NumLinkedList thelist) {
        int size = 0;
        while (!thelist.isEmpty()){
            size++;
            thelist.removeLast();
        }
        
        return 0;
    }*/

}
