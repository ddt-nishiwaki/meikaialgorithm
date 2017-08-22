package kensyu02;

import java.util.Scanner;
import static math.ExtremeOperation.*;

//4つの数値から最小値を求めるメソッドを作成し実行するクラス
public class OperateMin4 {
	
	// 数値入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_COMPARE_VALUE = "入力した値から最小値を求めます。数値を入力してください : ";
	// 一つ目の値入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_FIRST_VALUE = "一つ目の値を設定してください";
	// 二つ目の値入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_SECOND_VALUE = "二つ目の値を設定してください";
	// 三つ目の値入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_THIRD_VALUE = "三つ目の値を設定してください";
	// 四つ目の値入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_FOURTH_VALUE = "四つ目の値を設定してください";
	// 最大値を出力する際のメッセージを設定する
	private static final String MESSAGE_OUTPUT_MIN_VALUE = "入力した値の中から最小値を出力します";
	
	// 4つの数値から最小値を求めるメソッドを作成し実行するクラス
	public static void main (String arg[]){
		int firstValue;		// 一つ目の入力値を保持する変数を設定する
		int secondValue;	// 二つ目の入力値を保持する変数を設定する
		int thirdValue;		// 三つ目の入力値を保持する変数を設定する
		int fourthValue;	// 四つ目の入力値を保持する変数を設定する
		
		// 最小値を求める対象となる数値の入力を取得するオブジェクトを作成する
		Scanner InputScanner = new Scanner(System.in);
		// 最小値を求める対象となる数値の入力を求める
		System.out.println(MESSAGE_REQUEST_COMPARE_VALUE);
		// 一つ目の値の入力を求める
		System.out.println(MESSAGE_REQUEST_FIRST_VALUE);
		// 一つ目の値を保持する
		firstValue = InputScanner.nextInt();
		// 二つ目の値の入力を求める
		System.out.println(MESSAGE_REQUEST_SECOND_VALUE);
		// 二つ目の値を保持する
		secondValue = InputScanner.nextInt();
		// 三つ目の値の入力を求める
		System.out.println(MESSAGE_REQUEST_THIRD_VALUE);
		// 三つ目の値を保持する
		thirdValue = InputScanner.nextInt();
		// 四つ目の値の入力を求める
		System.out.println(MESSAGE_REQUEST_FOURTH_VALUE);
		// 四つ目の値を保持する
		fourthValue = InputScanner.nextInt();
		// 最大値を出力する際のメッセージを出力する
		System.out.println(MESSAGE_OUTPUT_MIN_VALUE);
		// 四つの値から最小値を求めて出力します
		System.out.println( min4(firstValue,secondValue,thirdValue,fourthValue) );
		
		// 入力用ストリームを閉じる
		InputScanner.close();
	}
}
