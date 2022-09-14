package gugudan;

public class sch_gugudan {

	public static void main(String[] args) {
		// 단 생성
		for (int dan = 2; dan <=9; dan++) {
			// 곱할 숫자 생성
			for (int num = 1; num <=9; num++ ) {
				// 결과 값 출력
				System.out.println(dan+"x"+num+"="+(dan*num));
			}
		}
	}

}
