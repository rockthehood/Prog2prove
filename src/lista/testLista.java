package lista;

public class testLista {

	public static void main(String[] args) {
		LinkedList lista=new LinkedList();
		
		for (int i = 0; i < 4; i++) {
			int nraCASO = (int) (Math.random()*100);
			lista.addElem(nraCASO);
		}
	
			lista.stampaLista();
			
		
	
	}

}
