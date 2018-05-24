package BinarySearchTree.Example;

public class EmptyBST<D extends Comparable> implements Tree<D>{

	public EmptyBST() {
		
	}
	
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int cardinality() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean member(D element) {
		return false;
	}

	@Override
	public nonEmptyBST<D> add(D ele) {
		
		return new nonEmptyBST<D>(ele);
	}

}
