/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.LinkedList;

/**
 *
 * @author esteb
 */
public class Node<N> {
    private N value;
    private N NextNode = null;
    
    public Node(N node){
        this.value = node;
    }
    
    public N getNode(){
        return value;
    }
    
    public N getNextNode(){
        return NextNode;
    }
    
    public void setNextNode(N NewNextNode){
        this.NextNode=NewNextNode;
    }
}
