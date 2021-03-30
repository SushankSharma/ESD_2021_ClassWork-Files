class calc{
	public static void main(String []args)
	{
		int fin=0;
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[2]);
		if(args[1]=="+")
		{
			System.out.println("hello");
			fin=a+b;
		}
		else if(args[1]=="-")
			fin=a-b;
		else if(args[1]=="*")
			fin=a*b;
		else if(args[1]=="/")
			fin=a/b;
		System.out.println(args[0]+" "+a);
	}
}