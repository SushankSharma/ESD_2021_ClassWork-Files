class ExampleStatic{
	static int a=10;
	void display_a(){
		System.out.println("a value:"+a);
		
	}
	//static bock, it will be executed before main once
	//static(System.out.println("Inside the static block");a=20)
	
	
	//constructor, here we override the def constructor
	ExampleStatic(){
	a++;
	}

public static void main(String args[]){
		ExampleStatic es1 = new ExampleStatic();
		es1.display_a();
		ExampleStatic es2 = new ExampleStatic();
		es2.display_a();
		//System.out.println("a value " +es.a);
	}
}