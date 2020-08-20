
public class Return01 {
	static String sampleMethod() {

		//文字列を返却する
		return "サンプルメソッドが呼び出されました";
	}

	public static void main(String[] args) {

		//sampleMethodを呼び出し、その結果をstrという名前のString方変数に代入する
		String str = sampleMethod();

		//str変数の内容を出力する
		System.out.println(str);
	}
}
