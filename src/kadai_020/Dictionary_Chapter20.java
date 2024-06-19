package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {

	HashMap<String, String> fruitAry = new HashMap<String, String>();

	public void fruitDic() {
		fruitAry.put("apple", "りんご");
		fruitAry.put("peach", "桃");
		fruitAry.put("banana", "バナナ");
		fruitAry.put("lemon", "レモン");
		fruitAry.put("pear", "梨");
		fruitAry.put("kiwi", "キウィ");
		fruitAry.put("strawberry", "いちご");
		fruitAry.put("grape", "ぶどう");
		fruitAry.put("muscat", "マスカット");
		fruitAry.put("cherry", "さくらんぼ");
	}

	public void searchDic(String[] words) {
		for (String word : words) {
			// 検索語が辞書に含まれているかチェック
			if (fruitAry.containsKey(word)) {
				// 含まれている場合、その意味を表示
				String meaning = fruitAry.get(word);
				System.out.println(word + "の意味は " + meaning + " です。");
			} else {
				// 含まれていない場合、その旨を表示
				System.out.println(word + "は辞書に含まれていません。");
			}
		}
	}
}
