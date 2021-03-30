class LogicGates{
	
	int or_gate(int in1, int in2){
		int a,b;
		a=in1;
		b=in2;
		int ans;
		
		int i, or_ans;
		
		or_ans = a | b;
		return or_ans;
	}
	
	int nor_gate(int in1, int in2){
		int nor_ans;
		int a=in1;
		int b=in2;
		if (a == 0 && b == 0)
			nor_ans = 1;
		else
			nor_ans = 0;
		return nor_ans;
	}
	
	public static void main(String args[]){
		int inp1=0;
		int inp2=0;
		LogicGates lg = new LogicGates();
		int result_or = lg.or_gate(inp1, inp2);
		int result_nor = lg.nor_gate(inp1, inp2);
		System.out.println("Or_gate :"+result_or);
		System.out.println("Nor_gate :"+result_nor);
	
	}
}
		