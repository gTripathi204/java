package learn;
interface Dog{
	void bark();
	void poop();
	public static void tail() {
		System.out.println("tail is dancing");
	}
	
}
 class function implements Dog{
 public void bark() {
	 System.out.println("Barking");
 }
 public void poop() {
	 System.out.println("pooping");
 }
 public void tail() {
	 System.out.println("FFFG");
 }
}
public class Interface {

	public static void main(String[] args) {
		function a=new function();
		a.bark();
		a.poop();
		a.tail();

	}

}
