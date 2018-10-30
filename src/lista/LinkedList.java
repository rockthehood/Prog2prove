package lista;

public class LinkedList {
	private Nodo lista;
		private class Nodo{
			int elem;
			Nodo next;
			public Nodo () {				
			}
			public Nodo(int p, Nodo n) {
				elem=p;
				next= n;
			}
			public int getElem() {
				return elem;
			} 
			public Nodo getNext() {
				return next;
			} 
		}
		public LinkedList() {
			lista=null;			
		}
	public void addElem (int numero) {
		//lista appena creata
		if(lista == null) {
			lista=new Nodo(numero, null);			
		}
		//lista gia' esistente (popolata)
		else {
			Nodo n=lista;
			while(n.next != null) {
				n=n.next;
			}
			n.next=new Nodo(numero, null);
			
		}
	}
//TODO
 /*	public void removeLast() {
		Nodo n=lista;
		if(lista == null) {
			return;			
		}
		else {
			while(n.next != null && n.next.next==null) {
				n=n.next;
			}
			
		}
	} */
	public void deleteList() {
		lista =null;
	}
	
	public LinkedList join(LinkedList da_aggiungere) {
		return null;
	}
	
	public void aggiungiElemInCodaLista() {
		
	}	
	
	public void stampaLista() {
		if(lista==null) {
			System.out.println("Lista vuota!!!");
		}
		else {
			Nodo n=lista;
			int count=0;
			while(n!= null) {
				System.out.println("elemneto [" +count + "]: " + n.elem );
				n=n.next;
				count++;
			}
		}
	}
}