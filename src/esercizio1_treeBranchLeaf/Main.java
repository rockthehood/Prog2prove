package esercizio1_treeBranchLeaf;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ciao");
		Tree t = (Tree) new Branch(2, new Branch( -3, new Leaf(), new Branch(1, new Leaf(), new Leaf())), new Leaf());
		
		t.print();
		t.detach(-3);
		System.out.println("----------");
		t.print();
	}

}
