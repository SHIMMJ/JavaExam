package com.simminjeong.algorithm.pro;

public class Tree {

    private int n;
    private Position treePosition;

    public Tree(Position treePosition) {
        this.treePosition = treePosition;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Position getTreePosition() {
        return treePosition;
    }

    public void setTreePosition(Position treePosition) {
        this.treePosition = treePosition;
    }



}
