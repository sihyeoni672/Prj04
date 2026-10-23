package ex01;

public class ArrayTest02 {
	public static void main(String[] args) {
		int [] sales = new int[] {
				100,80,90,110
		};
		
		 int tot =0;
		 tot = tot +sales[0];
		 tot = tot +sales[1];
		 tot = tot +sales[2];
		 tot = tot +sales[3];
		 
		 System.out.println(tot);
		 System.out.println();
		 
		 for(int i=0; i<sales.length; i++) {
			 tot += sales[i];
		 }
		 System.out.println(tot);
		 // -----------------------
		 // 2차원 배열연습
		 
	}

}
