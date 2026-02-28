/*WAP to store 10 floating-point values in a Vector and calculate the average, maximum, and minimum.*/

import java.util.*;
public class find_Avg_Max_Min_inVector{
	public static void main(String x[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many element you want insert: ");
		int size = sc.nextInt();
		
		Vector<Double> v = new Vector<>();

		System.out.println("Enter the Element: ");
		for(int i = 0; i < size; i++){
			double val = sc.nextDouble();
			v.add(val);
		}

		double avg = 0;
		double sum = 0;
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		Vector<Double> result = new Vector<>();
		for(int i = 0; i < size; i++){
			sum = sum + v.get(i);
			avg = sum / size;

			if(max < v.get(i)){
				max = v.get(i);
			}

			if(min > v.get(i)){
				min = v.get(i);
			}
		}

		System.out.println("Sum is: "+ sum);
		System.out.println("Average is: "+ avg);
		System.out.println("Max is: "+ max);
		System.out.println("Min is: "+ min);
	}
}