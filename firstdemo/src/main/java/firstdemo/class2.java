package firstdemo;

public class class2 {

	public void display() {
			int[] arr= {15,41,7,33,12,13,58};
			int sum=0;
			for(int num:arr) {
				sum+=num;
				System.out.println(num);
			}
			System.out.println("Summation:" + sum);
	}		
			
	public void print() {
			System.out.println("All Array Numbers:");
			display();
			}
	}
		



