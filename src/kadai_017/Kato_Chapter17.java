package kadai_017;

public abstract class Kato_Chapter17 {

	public String familyName = "加藤"; //姓
	public String givenName = ""; //名
	public String address = "東京都中野区〇×"; //住所

	//共通の紹介を出力するメソッド
	public void commonIntroduce() {
		System.out.println("名前：" + familyName + " " + givenName);
		System.out.println("住所：" + address);

	}

	//各サブクラスで個別に実装する必要がある
	public abstract void eachIntroduce();

	public void execIntroduce() { //紹介の実行
		this.commonIntroduce(); //共通の紹介
		this.eachIntroduce(); //個別の紹介
		System.out.println();
	}
}