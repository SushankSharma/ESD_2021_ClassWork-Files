//normal class to display the varibles a and b
class A{
	int a = 10;
	int b = 30;
	void display(){
	System.out.println("a "+a);
	System.out.println("b "+b);
	}
	
}

class Amain{
	public static void main(String args[]){
	//A obj
	String a[] = {"Hello", "World"};
	A obj = new A();
	Amain Am = new Amain();
	obj.display();
	Am.main(a);
	System.out.println(args[0]);
	}
}	