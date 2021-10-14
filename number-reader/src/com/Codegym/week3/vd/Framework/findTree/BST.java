package com.Codegym.week3.vd.Framework.findTree;

public class BST<E extends Comparable<E>> extends AbtractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST(){}

    public BST(E[] objects){
        for (int i = 0; i <objects.length ; i++) {
            insert(objects[i]);
        }
    }
    protected TreeNode<E> creteNewNode(E e){
        return new TreeNode<>(e);
    }
    @Override
    public boolean insert(E e) {
        if (root == null)
            root = creteNewNode(e);
        return false;
    }

    @Override
    public int getSize() {
        return 0;
    }
}
