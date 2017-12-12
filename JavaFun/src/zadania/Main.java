package zadania;

public class Main {

	public static void main(String[] args) {
		//==========================================
		int[] inputArrayQuickSort= {32,63,3,2,-3,322,3,6,1,231,1,534,-232,321};
		QuickSort qS= new QuickSort();
		qS.showElements(inputArrayQuickSort);
		qS.sortElements(inputArrayQuickSort);
		qS.showElements(inputArrayQuickSort);
		//==========================================
		int[] inputArrayConverter= {1,-33,52,7,-33,-9,32};
		Converter conv=new Converter();
		System.out.println("Liczba 22 binarnie: "+ conv.decimalToBinary(22));
		conv.showElements(inputArrayConverter);
		conv.decimalToBinary(inputArrayConverter);
		conv.showElements(inputArrayConverter);
		
	}

}
