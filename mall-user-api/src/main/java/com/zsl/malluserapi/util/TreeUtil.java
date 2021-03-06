package com.zsl.malluserapi.util;


import com.zsl.malluserdb.po.GoodsCategory;
import lombok.experimental.UtilityClass;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lengleng
 * @date 2017年11月9日23:34:11
 */
@UtilityClass
public class TreeUtil {
	/**
	 * 两层循环实现建树
	 *
	 * @param treeNodes 传入的树节点列表
	 * @return
	 */
	public <T extends TreeNode> List<T> bulid(List<T> treeNodes, Object root) {

		List<T> trees = new ArrayList<>();

		for (T treeNode : treeNodes) {

			if (root.equals(treeNode.getParentId())) {
				trees.add(treeNode);
			}

			for (T it : treeNodes) {
				if (it.getParentId() == treeNode.getId()) {
					if (treeNode.getChildren() == null) {
						treeNode.setChildren(new ArrayList<>());
					}
					treeNode.add(it);
				}
			}
		}
		return trees;
	}

	/**
	 * 使用递归方法建树
	 *
	 * @param treeNodes
	 * @return
	 */
	public <T extends TreeNode> List<T> buildByRecursive(List<T> treeNodes, Object root) {
		List<T> trees = new ArrayList<T>();
		for (T treeNode : treeNodes) {
			if (root.equals(treeNode.getParentId())) {
				trees.add(findChildren(treeNode, treeNodes));
			}
		}
		return trees;
	}

	/**
	 * 递归查找子节点
	 *
	 * @param treeNodes
	 * @return
	 */
	public <T extends TreeNode> T findChildren(T treeNode, List<T> treeNodes) {
		for (T it : treeNodes) {
			if (treeNode.getId() == it.getParentId()) {
				if (treeNode.getChildren() == null) {
					treeNode.setChildren(new ArrayList<>());
				}
				treeNode.add(findChildren(it, treeNodes));
			}
		}
		return treeNode;
	}

	/**
	 * 通过sysMenu创建树形节点
	 *
	 * @param categories
	 * @param root
	 * @return
	 */
	public List<MenuTree> bulidTree(List<GoodsCategory> categories, int root) {
		List<MenuTree> trees = new ArrayList<>();
		MenuTree node;
		for (GoodsCategory category : categories) {
			node = new MenuTree();
			node.setId(Integer.parseInt(category.getId()+""));
			node.setParentId(Integer.parseInt(category.getParentId()+""));
			node.setName(category.getCategoryName());
			node.setLabel(category.getCategoryName());
			node.setIcon(category.getCategoryLogo());
			node.setValue(Integer.parseInt(category.getId()+""));
			trees.add(node);
		}
		return TreeUtil.bulid(trees, root);
	}
}
