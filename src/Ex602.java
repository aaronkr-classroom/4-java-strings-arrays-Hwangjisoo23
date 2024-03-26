
public class Ex602 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]myNums = new int [10];
		
		//배열 채우기
		for (int i=0; i<myNums.length; i++) {
			myNums[i] = i * i;
		}
		
		//배열 채우기
				for (int i=0; i<myNums.length; i++) {
				System.out.println(i + " : " + myNums[i]);
		}

	}
}