import java.util.Scanner;

class changecase{
	public static void main(String []args){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the word");
		String word =obj.nextLine();
		char c=word.charAt(0);
		int a=(int)c;
		a=a^32;
		char b=(char)a;
		System.out.print(b);
	}
}