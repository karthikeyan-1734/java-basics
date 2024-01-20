//factorial using recursion

class Factorial{
	public static void main(String[] args){
		int a = fibo(5);
		System.out.print(a);
		}
		public static int fact(int x){
		if(x==1){
			return 1;
		}
		else{
			return (x*fact(x-1));
		}

	}

}