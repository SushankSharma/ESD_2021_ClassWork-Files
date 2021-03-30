import java.util.Scanner;

class dtob{
	public static void main(String []args){
		int n[]=new int[100];
		int i=0,j;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=obj.nextInt();
		do{
			n[i]=a%2;
			a=a/2;
			i++;
		}while(a!=0);
		for(j=i-1;j>=0;j--)
		{
			System.out.printf("%d",n[j]);
		}
	}
}