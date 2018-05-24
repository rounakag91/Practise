package BinarySearchTree.Example;

public interface Tree<D extends Comparable> {
	
	public boolean isEmpty();
	public int cardinality();
	public boolean member(D element);
	public nonEmptyBST<D> add(D ele);
}
