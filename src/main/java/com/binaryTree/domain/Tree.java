package com.binaryTree.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Tree {
    
    private List<Node> nodes = new ArrayList<Node>();

    public Tree() {
    }

    public Tree(List<Node> nodes) {
        this.nodes = nodes;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }
    
    public void insertElements(List<Integer> numbers){
        
        this.nodes.add(new Node(0));

        for (Integer number : numbers) {

            for (Node node : nodes) {
                
            }
        }
        
    }
}
