package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception04 {
	public static void main(String[] args) {
		try {
			
			// readFileメソッドを呼び出し
			Exception04.readFile("exception.txt");
			
			//呼び出し元も例外処理を記述しないとコンパイルエラーとなる
		} catch(FileNotFoundException e) {
			
			//例外処理が実行される
			System.out.println("FileNotFoundEXception例外が発生");
		}
		
		//catch分で例外処理されるので、例外が実行される
		System.out.println("プログラム終了");
	}
	
	
	//検査例外のfilenotfountexceptin例外をスロー
	public static void readFile(String fileName) throws FileNotFoundException{
		System.out.println( "ファイルの読み込み開始");
		
		//ファイルが存在しなため例外が発生
		FileReader rf = new FileReader(fileName);
		System.out.println(fileName + "の読み込み完了");
	}

}
