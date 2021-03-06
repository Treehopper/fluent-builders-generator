/*
 * Copyright (c) 2009 by Sabre Holdings Corp.
 * 3150 Sabre Drive, Southlake, TX 76092 USA
 * All rights reserved.
 *
 * This software is the confidential and proprietary information
 * of Sabre Holdings Corporation ("Confidential Information").
 * You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement
 * you entered into with Sabre Holdings Corporation.
 */

package com.sabre.buildergenerator.ui;

/**
 * Title: TreeNode.java<br>
 * Description: <br>
 * Created: Mar 19, 2010<br>
 * Copyright: Copyright (c) 2007<br>
 * Company: Sabre Holdings Corporation
 * 
 * @author Jakub Janczak sg0209399
 * @version $Rev$: , $Date$: , $Author$:
 */

public class TreeNode<ElementType> {
	private boolean collapsed = false;
	private ElementType element;

//	private TypeNode parentTypeNode;

	private boolean selected = true;

	/**
	 * @param element
	 *            the element type that we have inside
	 * @param parentTypeNode
	 *            parent
	 */
	public TreeNode(ElementType element, TypeNode parentTypeNode) {
		this.element = element;
//		this.parentTypeNode = parentTypeNode;
	}

	/**
	 * @return the element
	 */
	public ElementType getElement() {
		return element;
	}

	public boolean isSelected() {
		return selected;
	}

	/**
	 * @return the collapsed
	 */
	public boolean isCollapsed() {
		return collapsed;
	}

	public void collapse() {
		collapsed = true;
	}

	public void expand() {
		collapsed = false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof TreeNode<?>) {
			TreeNode<ElementType> other = (TreeNode<ElementType>) obj;
			return other.getElement().equals(getElement());
		}
		return false;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return getElement().hashCode();
	}

    public void setSelected(boolean b) {
        this.selected = b;
    }

}
