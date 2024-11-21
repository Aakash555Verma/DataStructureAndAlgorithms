package in.arrays;

import java.util.Arrays;

public class Delete {
	static int deleteEle(int input[], int n, int x)
    {
    	int i = 0;

    	for(i = 0; i < n; i++)
    	{
    		if(input[i] == x)
    			break;
    	}

    	if(i == n)
    		return n;

    	for(int j = i; j < n - 1; j++)
    	{
    		input[j] = input[j + 1];
    	}

    	return n-1;
    } 

    public static void main(String args[]) 
    { 
       int input[] = {3, 8, 12, 5, 6}, x = 12, n = 5;

       System.out.println("Before Deletion : "+Arrays.toString(input));

       System.out.println();

       n = deleteEle(input, n, x);

       System.out.println("After Deletion : "+Arrays.toString(input));

    }
}
