package com.bridgelabz.binarysearchtree;

public class BinarySearchTreeMain {

	public static void main(String[] args) {
		MyBinaryTree<Integer> binaryTree = new MyBinaryTree<Integer>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		int space = 0,height = 10;
		binaryTree.printBinaryTree(binaryTree.getRoot(),space,height);
	}

}
