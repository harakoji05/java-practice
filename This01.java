
public class This01 {
	// クラス変数
	String animal = "うさぎ";

	public void printAnimal() {
		// クラス変数より、ローカル変数が優先される。
		String animal = "ねこ";
		System.out.println("ローカル変数:" + animal);
		System.out.println("クラス変数:" + this.animal);
	}

	public static void main(String[] args) {
		This01 s = new This01();
		s.printAnimal();
	}

}
