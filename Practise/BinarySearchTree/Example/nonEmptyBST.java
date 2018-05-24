package BinarySearchTree.Example;

public class nonEmptyBST<D extends Comparable> implements Tree<D> {

	D data;
	Tree<D> left;
	Tree<D> right;
	
	public nonEmptyBST(D ele) {
		data = ele;
		left = new EmptyBST<D>();
		right = new EmptyBST<D>();
	}
	
	
	public nonEmptyBST(D elt, Tree<D> leftTree, Tree<D> rightTree) {
		data = elt;
		left = leftTree;
		right = rightTree;
	
	
	}


	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int cardinality() {
		
		return 1 + left.cardinality() + right.cardinality();
	}

	@Override
	public boolean member(D elt) {
		
		if(data == elt)
			return true;
		else {
			if(elt.compareTo(data)<0)
				return left.member(elt);
			else
				return right.member(elt);
		}
	}

	@Override
	public nonEmptyBST<D> add(D ele) {
		if(data==ele)
			return this;
		else {
			if(ele.compareTo(data)<0)
				return new nonEmptyBST(data, left.add(ele), right);
			else
				return new nonEmptyBST(data,left, right.add(ele) );
		}
		
	}


}
