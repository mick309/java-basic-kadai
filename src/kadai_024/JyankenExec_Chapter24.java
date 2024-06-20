package kadai_024;

public class JyankenExec_Chapter24 {

	public static void main(String[] args) {
		// じゃんけんクラスのインスタンスを作成
		Jyanken_Chapter24 jyanken = new Jyanken_Chapter24();
		// 自分のじゃんけんの手を入力する
		String me = jyanken.getMyChoice();
		// 対戦相手のじゃんけんの手が選ばれる
		String you = jyanken.getRandom();
		// じゃんけんの結果を出力する
		jyanken.playGame(me, you);
	}

}
