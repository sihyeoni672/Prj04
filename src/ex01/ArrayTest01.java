package ex01;

public class ArrayTest01 {
	// Array : 여러변수를 하나의 이름으로 통일해서 사용

	public static void main(String[] args) {
		String name1 ="원이";
		String name2 ="리브";
		String name3 ="메이";
		String name4 ="미나미";
		String name5 ="제나";
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		System.out.println(name5);
		System.out.println();
		
		String [] rescene = new String[] {
			"원이", "리브", "메이", "미나미", "제나"
		};
		
		System.out.println(rescene[0]);
		System.out.println(rescene[1]);
		System.out.println(rescene[2]);
		System.out.println(rescene[3]);
		System.out.println(rescene[4]);
		System.out.println();

		
		for(int i=0; i<rescene.length; i++) {
			System.out.println(rescene[i]);
		}

	}

}
