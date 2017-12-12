package zadania;

public class Converter {
	
	public void decimalToBinary(int[] array) {
		
		for( int i=0; i<array.length; i++) {
			array[i]=decimalToBinary(array[i]);
		}
	}
	public void showElements(int[] array) {
			for(int i:array) {
				System.out.print(i+" ");
			}
			System.out.println("");
	}
	public int decimalToBinary(int decimal) {
		String binary="";
		String negative="";
		if(decimal<0) {
			decimal*=-1;
			negative+="-";
		}
		while (decimal!=0) {
			if (decimal%2==0) 
			{
				binary+="0";
				decimal/=2;
			}
			else 
			{ 
				binary+="1";
				decimal/=2;
			}
		}
		return Integer.parseInt(reverseToBinary(binary+negative));
	}
	private String reverseToBinary(String notReversed) 
	{
		String reversed="";
		for(int loop=notReversed.length()-1;loop>=0;loop--) {
			reversed+=notReversed.charAt(loop);
		}
		return reversed;
	}
}
