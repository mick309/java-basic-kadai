package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		

		boolean[] primeJudge = new boolean[101];

		// 配列をtrueで初期化
		for (int k = 1; k < primeJudge.length; k++) {
			primeJudge[k] = true;
		}

		// 素数かどうかの判定
		for (int i = 2; i < primeJudge.length; i++) {
			for (int r = 2; r * r <= i; r++) {
				if (i % r == 0) {
					primeJudge[i] = false;
					break;
				}
			}
		}

		// 素数の出力
		for (int j = 2; j < primeJudge.length; j++) {
			if (primeJudge[j]) {
				System.out.println(j);
			}
		}
	}
}