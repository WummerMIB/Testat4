package lampdaT;

import java.util.Arrays;

public class MainLam {

	public static void main(String[] args) {
		int[] zs = { 3, 6, 1, 5, 2, 4 };
		
		int[] sort1 = bubblesort(zs);
		int[] sort2 = selectionSort(zs);
		int[] sort3 = InsertionSort(zs);
		
		
		//Arrays.stream(sort1).forEach(System.out::println);
		//Arrays.stream(sort2).forEach(System.out::println);
		Arrays.stream(sort3).forEach(System.out::println);

	}

	private static int[] InsertionSort(int[] zs) {
		
			int j;
		    for (int i = 1; i < zs.length -1; i++)
		    {
		        int key = zs[i];
		        j = i - 1;
		 
		        while (j >= 0 && zs[j] > key)
		        {
		        	zs[j + 1] = zs[j];
		            j = j - 1;
		        }
		        zs[j + 1] = key;
		    }	
		return zs;
	}

	private static int[] selectionSort(int[] zs) {
		
		for(int j= 0; j<zs.length;j++) {
			int helper = Integer.MAX_VALUE;
			int pos = -1;
			for(int i = j; i < zs.length; i++) {
				if (zs[i] < helper) {
					helper = zs[i];
					pos = i;
				}	
				int zws = zs[j];
				zs[j] = zs[pos];
				zs[pos] = zws;
			}
		}	
		return zs;
	}

	private static int[] bubblesort(int[] zs) {
		
		boolean weiter = true;
		for (int j = 0; j<zs.length - 1&& weiter;j++) {
			weiter = false;
			for(int i = 0; i<zs.length - 1;i++) {
				if(zs[i] > zs[i+1]) {
					int helper = zs[i];
					zs[i] = zs[i+1];
					zs[i+1] = helper;
					
					weiter = true;
				}
			}
		}
		
		return zs;
	}
}
