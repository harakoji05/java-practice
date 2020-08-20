
import java.util.Scanner;

public class Extext {

  public static void main(String[] args) {
      Extext exTest = new Extext();
      //コンソールでのキー入力を要求する
      String input = exTest.read();
      try {
        int no = exTest.getNo(input);
        System.out.println("入力結果:"+no+"　正しいキー入力を受け付けました");

      //getNoメソッドで発生した例外はここから下のcatch節で処理する
      } catch (NumberFormatException e) {
        System.out.println("数字を入力してください");
      }
      catch (IllegalArgumentException e) {
        System.out.println("1か2を入力してください");
      }
  }

  private String read(){
    String input;
    Scanner scan = new Scanner(System.in);
    input = scan.nextLine();//コンソールで入力した文字を取得する
    scan.close();
    try {
          if(input == null || input.equals("")){
            //何も入力せずにEnterが押された場合は例外を発生させる
            throw new IllegalArgumentException();
        }
    } catch (IllegalArgumentException e) {
        //上でスローされた例外をキャッチする
        System.out.println("キー入力してください");
        System.exit(1);//プログラムを終了する。
    }
    return input;
  }

  //このメソッドで発生した例外は呼び出し元で処理する
  private int getNo(String s) throws NumberFormatException,IllegalArgumentException{

    //数字に変換できない文字を入力した場合はNumberFormatExceptionが発生する
    int i = Integer.parseInt(s);

    if(i != 1 && i != 2){
      //1か2以外の数字を入力した場合は例外を発生させる
      throw new IllegalArgumentException("1か2を入力してください");
    }
    return i;
  }
}