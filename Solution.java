package com.finserv.basics;

import java.util.*;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode next;
	
	TreeNode(int val){
		this.val=val;
	}
	
	TreeNode(int val,TreeNode left,TreeNode right,TreeNode next){
		this.val=val;
		this.left=left;
		this.right=right;
		this.next=next;
		
	}
}

public class Solution {
	
	static TreeNode root;
	public static void populate(TreeNode root) {
		
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		
		queue.add(root);
		
		while(!queue.isEmpty())
		{
			int size=queue.size();
			
			for(int i=0;i<size;i++)
			{
				TreeNode node=queue.poll();
				
				System.out.print(node.val+" ");
				if(node.left!=null) {
					queue.add(node.left);
				}
				if(node.right!=null) {
					queue.add(node.right);
					
				}
				
			}
			System.out.println();
		}
		
		
		
	}
	public static void main(String[] args)
	{
		Solution obj=new Solution();
		
		obj.root=new TreeNode(1);
		obj.root.left=new TreeNode(2);
		obj.root.right=new TreeNode(3);
		obj.root.left.left=new TreeNode(4);
		obj.root.left.right=new TreeNode(5);
		obj.root.right.right=new TreeNode(7);
		
		obj.populate(root);
		
		
		
	}

}
