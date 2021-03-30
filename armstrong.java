import java.util.Scanner;

class armstrong{
	public static void main(String []args){
		int num,num1,j,k,c,i=0;
		int n[]=new int[100];
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Number");
		num=obj.nextInt();
		num1=num;
		do{					//calculate length of the number and store digits in an array
			n[i]=num%10;
			num=num/10;
			i++;
		}while(num!=0);
		int sum=0;
		for(j=0;j<i;j++)		//taking sum of digits after taking their powers
		{
			c=n[j];
			for(k=0;k<i-1;k++){
				n[j]=c*n[j];
			}
			sum=sum+n[j];
		}
		if(sum==num1)		//checking if equal to original number
		{
			System.out.println(num1+" is an Armstrong number");
		}
		else
		{
			System.out.println(num1+" is not an Armstrong number");
		}
	}
}