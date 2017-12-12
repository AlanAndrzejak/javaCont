package zadania;

public class QuickSort {
	private int array[];
	private int length;
	
	public void sortElements(int[] arrayValues) {
		if( arrayValues==null|| arrayValues.length==0) {return;}
		this.array=arrayValues;
		length=arrayValues.length;
		doQuickSort(0,length-1);
	}
	private void doQuickSort(int lowIndex, int highIndex) {
		int i=lowIndex;
		int j=highIndex;
		int pivot= array[lowIndex+(highIndex-lowIndex)/2];
		
		while(i<=j) {
			while (array[i]<pivot) {
				i++;
			}
			while (array[j]>pivot) {
				j--;
			}
			if (i<= j) {
				swapElements(i,j);
				i++;
				j--;
			}
		}
		if (lowIndex<j) {
			doQuickSort(lowIndex,j);
		}
		if(i<highIndex) {
			doQuickSort(i,highIndex);
		}
	}
	private void swapElements(int i, int j) {
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	public void showElements(int[] arrayValues) {
		for(int i:arrayValues) {
			System.out.print(i+" ");
		}
		System.out.println("");
	}
}
