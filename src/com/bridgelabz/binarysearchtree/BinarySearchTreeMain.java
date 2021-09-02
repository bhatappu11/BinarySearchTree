package com.bridgelabz.binarysearchtree;

public class BinarySearchTreeMain {

	public static void main(String[] args) {
		MyBinaryTree<Integer> binaryTree = new MyBinaryTree<Integer>();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		binaryTree.add(22);
		binaryTree.add(40);
		binaryTree.add(60);
		binaryTree.add(95);
		binaryTree.add(11);
		binaryTree.add(65);
		binaryTree.add(3);
		binaryTree.add(16);
		binaryTree.add(63);
		binaryTree.add(67);
		System.out.println("The size of binary tree is :"+ binaryTree.getSize());
		System.out.println("The key 63 is present in BST? "+binaryTree.search(63));
		
		int space = 0,height = 10;
		binaryTree.printBinaryTree(binaryTree.getRoot(),space,height);
	}

}
