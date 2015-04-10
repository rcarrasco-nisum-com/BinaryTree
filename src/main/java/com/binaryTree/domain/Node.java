package com.binaryTree.domain;

import org.springframework.stereotype.Component;

@Component
public class Node {

    private int key;
    private Node leftNode;
    private Node rightNode;

    public Node() {
    }

    public Node(int key) {
        this.key = key;
        this.leftNode = null;
        this.rightNode = null;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

}
