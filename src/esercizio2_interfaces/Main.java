package esercizio2_interfaces;

public class Main {

	public static void main(String[] args) {
	System.out.println("risposte: ");
	System.out.println("risposta 1: CORRETTO! elimiando m1 non rende il codice non corretto perche la classe C contiene il metodo astratto m1. ");
		
	System.out.println("risposta 2: CORRETTO!");
		testdomanda2();
	System.out.println("risposta 3: CORRETTO!!");
		testdomanda3();
	System.out.println("risposta 4: CORRETTO!!");
		testdomanda4();
	}
	public static void testdomanda2() {		
		I obj =new D();
		((D)obj).m2();
	}
	public static void testdomanda3() {
		J obj =new D();
		C x =(C) obj;
		x.m1(new D());
	}
	public static void testdomanda4() {
/*		C obj=new D();
		obj.m1(obj);*/
	}
}
