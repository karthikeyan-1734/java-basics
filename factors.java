//factors of a number
import java.util.Scanner;
class Factors{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number = ");
		int x = s.nextInt();
		System.out.print("The Factors are = ");
		for(int i=1;i<=x;i++){
			if((x%i) == 0){
				System.out.print(i+" ");
			}
		}
	}

}