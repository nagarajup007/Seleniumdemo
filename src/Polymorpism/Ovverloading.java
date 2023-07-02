package Polymorpism;

public class Ovverloading {
	//Ex sys print
	//compile time poly and static polymorpism and early binding
public void add() {
	
System.out.println("number");
}
public void add(int a) {
	
System.out.println(a);
}public void add(int a ,int b) {
	
System.out.println(a);
System.out.println(b);
}public static void main(String[] args) {
	Ovverloading ol=new Ovverloading();
	ol.add();
	ol.add(10);
	ol.add(4, 7);
}
}
