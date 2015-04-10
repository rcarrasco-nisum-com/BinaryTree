package com.binaryTree.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class Tree {
    
    private List<Node> nodes;

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
    
    public void insertElements(List<Integer> numbers) {

        Node node = new Node(0);
    /*
        for (Integer numberToInsert : numbers) {

                if (node.getKey() == 0){
                    node.setKey(numberToInsert);
                }
                else if (numberToInsert < node.getKey()) {
                    if (node.getLeftNode() == null) {
                        node.setLeftNode(new Node(numberToInsert));
                    } else {
                        nodes.add(new Node(numberToInsert));
                        break;
                    }
                } else if (numberToInsert > node.getKey()) {
                    if (node.getRightNode() == null) {
                        node.setRightNode(new Node(numberToInsert));
                    } else {
                        nodes.add(new Node(numberToInsert));
                        break;
                    }
                }

        }*/

        for (Integer numberToInsert : numbers) {

            if (node.getKey() == 0){
                node.setKey(numberToInsert);
            }


        }

    }
}
