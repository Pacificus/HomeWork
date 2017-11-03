package com.hillel;

public class Task{
	public static void main(String...args){
		Task task = new Task();
		if (args.length == 0){
			System.out.println("Incorect data input");
			return ;
		}
		int decimal = Integer.parseInt(args[0]);
		task.fromDecimalToDigitalVerII(decimal);
	}
	
	private void fromDecimalToDigitalVerI(int decimal){
		int litmus = 1<<30;//max
		//System.out.println(litmus);
		do{
			byte answer = (litmus & decimal) == 0 ? (byte)0 : (byte)1;
			System.out.print(answer);
			litmus >>= 1;
		}
		while(litmus > 0);
		System.out.println();
	} 
	
	private void fromDecimalToDigitalVerII(int decimal){
		String buffer = "";
		int length = 0;
		while(decimal > 0){
			char div = (decimal%2 == 0) ? '0' : '1';
			buffer += div;
			decimal /=2;
			length++;
		}
		/*StringBuilder buf = new StringBuilder();
		buf.append(buffer);
		buf = buf.reverse();
		System.out.println(buf);*/
		for (int i=length-1; i >= 0; i--) System.out.print(buffer.charAt(i));
		System.out.println();
	} 
}
