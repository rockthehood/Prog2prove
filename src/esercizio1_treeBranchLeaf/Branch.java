package esercizio1_treeBranchLeaf;

public class Branch extends Tree{
	private int elem;
	private Tree left;
	private Tree right;
	
	public Branch (int data, Tree l, Tree r) {
		this.elem = data;
		this.left = l;
		this.right = r;
		
	}

	@Override
	public Tree detach(int x) {
		if(this.elem==x){
			return new Leaf();
		}
		else {
			left=left.detach(x);
			right=right.detach(x);
			return this;
		}
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(""+elem+", ");
		
		left.print();
		right.print();
	}
	
	

}
