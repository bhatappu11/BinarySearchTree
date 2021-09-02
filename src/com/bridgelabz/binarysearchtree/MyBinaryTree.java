package com.bridgelabz.binarysearchtree;

public class MyBinaryTree<K extends Comparable<K>> {
	private MyBinaryNode<K> root;
	
	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}
	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if(current == null)
			return new MyBinaryNode<K>(key);
		int compareResult = key.compareTo(current.key);
		if(compareResult == 0) return current;
		if(compareResult < 0) {
			current.left = addRecursively(current.left, key);
		} else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}
	public MyBinaryNode<K> getRoot(){
		return root;
	}
	public void printBinaryTree(MyBinaryNode<K> root,int space, int height)
    {
        if (root == null) {
            return;
        }
        space += height;
        printBinaryTree(root.right, space, height);
        System.out.println();
        for (int i = height; i < space; i++) {
            System.out.print(' ');
        }
        System.out.print(root.key);
        System.out.println();
        printBinaryTree(root.left, space, height);
    }
	public int getSize() {
		return this.getSizeRecursive(root);
	}
	
	private int getSizeRecursive(MyBinaryNode<K> current) {
		return current == null ? 0 :1 + this.getSizeRecursive(current.left)+this.getSizeRecursive(current.right);
	}
	public boolean search(K key) {
		return this.searchRecursively(root,key);
		
	}
	private boolean searchRecursively(MyBinaryNode<K> current, K key) {
		if(current == null ) return false;
		int compareResult = key.compareTo(current.key);
		if(compareResult == 0) return true;
		if(compareResult > 0) {
			return searchRecursively(current.right, key);
		}
		else
			return searchRecursively(current.left, key);
	}
	
	
 
}
 