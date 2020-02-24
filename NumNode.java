/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework;

/**
 *
 * @author sk1665s
 */
public class NumNode {


   private double element;
  private NumNode next;
  /** Creates a node with null references to its element and next node. */
  public NumNode() {
    this.element = 0;
    this.next = null;
  }
  /** Creates a node with the given element and next node.
     * @param e
     * @param n */
  public NumNode(Double e, NumNode n) {
    element = e;
    next = n;
  }
  // Accessor methods:
  public Double getElement() {
    return element; 
  }
  public NumNode getNext() { 
    return next;
  }
  // Modifier methods:
  public void setElement(Double newElem) { 
    element = newElem; 
  }
  public void setNext(NumNode newNext) {
    next = newNext; 
  }
    
}
