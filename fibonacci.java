
class Fibo{
	public static void main(String[] args){
		int i=0,j=1;
		for(int k=1;k<=10;k++){
			System.out.println(i);
			int sum= i+j;
			i=j;
			j=sum;


		}
	}
}