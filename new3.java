import java.util.*;

class main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<n/2;i++){
			if(n%i==0){
				count++;
			}
		}
		if(count>0){
			System.out.print("the avove number is not prime");
		}else{
			System.out.print("the above numver is prime");
		}
	}
}