import java.util.Scanner;

public class sdaopjs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int n;
		n=input.nextInt();
		int arr [] = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter the element of the array: ");  
			arr[i]=input.nextInt();
		
		}
		int max = arr[0];
		int index = 0;
		for(int i=0; i<n; i++) {
			if(max< arr[i]) {
				index=i;
				max=arr[i];
			}
		}
		System.out.println(max);
		int min = arr[0];
		int index32 = 0;
		for(int i=0; i<n; i++) {
			if(min > arr[i]) {
				index32=i;
				min=arr[i];
			}
		}
		System.out.println(min);
	}	
}
