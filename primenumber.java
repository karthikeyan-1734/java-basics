//Prime number
import java.util.Scanner;
import java.util.ArrayList;
class Prime{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Number = ");
		int x = s.nextInt();
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=1;i<=x;i++){
			if((x%i) == 0){
				a.add(i);
			}
		}
		if(a.size() == 2)
			System.out.println(x + " is Prime Number");
		else
			System.out.println(x + " is Not Prime Number");
	}

}