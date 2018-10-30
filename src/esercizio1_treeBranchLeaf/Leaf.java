package esercizio1_treeBranchLeaf;

public class Leaf extends Tree {
	public Tree detach(int x) {
		return this;	
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("-");
	}
	
}