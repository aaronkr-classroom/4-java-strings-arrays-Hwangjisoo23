
public class Ex603 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] myGrades = new double[]{
				89.1, 95.0, 87.7,88.3,100.0 
		};
		double sum = 0.0;
		double avg = 0.0;
		
		//2차원 배열
		double[][] myClassGrades = new double[][]{
				{89.1, 88.2, 83.2, 85.5, 75.2},
				{95.0, 93.2, 91.1, 89.9, 75.5},
				{87.7, 65.2, 54.2, 32.1, 10.0},
				{88.3, 66.6, 77.7, 88.8, 99.9},
				{100.0, 99.9, 89.0, 87.6, 100.0} 
		};
		String[] myClasses = new String[] {
				"국어", "수학", "공학", "사회","PE"
		};
		
		for (int i =0; i< myClasses.length; i++ ) {
			System.out.println(myClasses[i] + " : ");
			for(int j = 0; j<5; j++) {
				System.out.print(myClassGrades[i][j] + ",");
			}
			System.out.println();
		}
		
		
		/*
		for (double g: myGrades) {
			sum += g;
		}
		
		
		avg = sum / myGrades.length;
		
		System.out.println("합계: "  + sum);
		System.out.format("평균: %.2f" , avg);
		}
		 */
	}
}
