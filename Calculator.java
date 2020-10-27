package day2;

public class Calculator {
	int add(int...ar)
	{
		int sum=0;
			for(int i:ar)
				sum+=i;
		return sum;
	}
}
