package esercizio2_interfaces;

public class D extends C implements J{
	public void m1(J obj) {
		if (this!= obj) {
			obj.m2();
			System.out.println("D.m1");
		}
	}
	public void m2() {
			System.out.println("D.m2");
			m1(this);
	}
}