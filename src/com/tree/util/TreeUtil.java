package com.tree.util;

import com.tree.TreeNode;

public class TreeUtil {
	
	public void visit(TreeNode node){
        System.out.print(node.val+" ");
    }
	
	public void preOrderRecursion(TreeNode node){
        if(node==null) //如果结点为空则返回
            return;
        visit(node);//访问根节点
        preOrderRecursion(node.left);//访问左孩子
        preOrderRecursion(node.right);//访问右孩子
    }

}
