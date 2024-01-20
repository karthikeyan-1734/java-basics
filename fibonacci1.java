
class Fibo1{
	public static void main(String[] args){
		fibo(0,1,10);
	}
	public static int fibo(int x,int y,int end){
		if(end == 0){
			return 1;
		}
		else{
		System.out.println(x+" ");
		end--;
		return fibo(y,x+y,end);
	
		}
		
	}
}