package kensyu02;

import java.util.Scanner;
// 4つの数値から最大値を求めるメソッドを作成し実行するクラス
public class OperateMax4 {
	
	// 数値入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_COMPARE_VALUE = "入力した値から最大値を求めます。数値を入力してください : ";
	// 一つ目の値入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_FIRST_VALUE = "一つ目の値を設定してください";
	// 二つ目の値入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_SECOND_VALUE = "二つ目の値を設定してください";
	// 三つ目の値入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_THIRD_VALUE = "三つ目の値を設定してください";
	// 四つ目の値入力を求めるメッセージを設定する
	private static final String MESSAGE_REQUEST_FOURTH_VALUE = "四つ目の値を設定してください";

	// 4つの数値から最大値を求めるメソッドを作成し実行するクラス
	public static void main (String arg[]){
		int firstValue;		// 一つ目の入力値を保持する変数を設定する
		int secondValue;	// 二つ目の入力値を保持する変数を設定する
		int thirdValue;		// 三つ目の入力値を保持する変数を設定する
		int fourthValue;	// 四つ目の入力値を保持する変数を設定する
		
		// 最大値を求める対象となる数値の入力を取得するオブジェクトを作成する
		Scanner InputScanner = new Scanner(System.in);
		// 最大値を求める対象となる数値の入力を求める
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
		// 四つの値から最大値を求めて出力します
		System.out.println( max4(firstValue,secondValue,thirdValue,fourthValue) );
		
		// 入力用ストリームを閉じる
		InputScanner.close();
	}
	
	/*
	 * 4つの引数から最大値を求めます
	 */
	public static int max4(int firstValue, int secondValue, int thirdValue, int fourthValue){
		// 比較のために一つ目の値を最大値扱いする
		int max = firstValue;
		// 現在の最大値と二つ目の値を比較して大きい方を最大値扱いする
		if (max < secondValue){
			// 最大値に二つ目の値を設定する
			max = secondValue;
		}
		// 現在の最大値と三つ目の値を比較して大きい方を最大値扱いする
		if (max < thirdValue){
			// 最大値に二つ目の値を設定する
			max = thirdValue;
		}
		// 現在の最大値と四つ目の値を比較して大きい方を最大値扱いする
		if (max < fourthValue){
			// 最大値に二つ目の値を設定する
			max = fourthValue;
		}
		// 最終的な最大値を返す
		return max;
	}
}
