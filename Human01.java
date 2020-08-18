
public class Human01 {
	// フィールド(メンバ変数)を宣言
	public String name;
	public int age;

	//　引数なしのコントラスト
	public Human01() {
		// 初期化処理：フィールドに初期化を設定
		name = "山田";
		age = 20;
	}

	// 引数ありのコンストラクタ
	public Human01(String name, int age) {
		// 初期化処理：フィールドに初期化を設定
		// 引数の変数をthisのフィールドに代入
		// name = name; ではなく、引数のnameに代入となる
		this.name = name;
		this.age = age;
	}
}
