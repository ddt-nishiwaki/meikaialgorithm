package kensyu02;

import java.util.Scanner;
/*
 * 二つの整数値を読み込んで差を求めるメソッドを実行するクラス
 */
public class E1_10_CompareTwoValue {
	
	// 処理内容の説明を設定します
	private static final String MESSAGE_PROCESS_DETAIL = "二つの整数値の差を求めます";
	// 小さい方の値入力を求めるメッセージを設定します
	private static final String MESSAGE_INPUT_SMALL_VALUE = "小さい方の値を入力してください : ";
	// 大きい方の値入力を求めるメッセージを設定します
	private static final String MESSAGE_INPUT_BIG_VALUE = "大きい方の値を入力してください : ";
	// 仕様に沿ってエラーメッセージを設定します
	private static final String FORMAT_CAUTION_INPUT = "%dより大きな値を入力してください";
	// 結果を出力する際のメッセージを設定します
	private static final String FORMAT_RESULT_OPERATION = "大きい方の値 - 小さい方の値 は %d です";


	/*
	 * 二つの整数値を読み込んで大小を比較するメソッドを実行するクラス
	 */
	public static void main(String[] arg){
		// 小さい値を保持する変数です
		int smallValue;
		// 大きい値を保持する変数です
		int bigValue;
		
		// 数値入力を取得するオブジェクトを作成する
		Scanner InputScanner = new Scanner(System.in);
		
		// 処理の内容を出力します
		System.out.println(MESSAGE_PROCESS_DETAIL);
		// 小さい方の値入力を求めます
		System.out.println(MESSAGE_INPUT_SMALL_VALUE);
		// 入力された値を保持します
		smallValue = InputScanner.nextInt();
		// 大きい方の値入力を求めます
		System.out.println(MESSAGE_INPUT_BIG_VALUE);
		// 前の入力より大きい値を確実に入力させます
		do {
			// 入力された値を保持します
			bigValue = InputScanner.nextInt();
			// 前回の入力以下の場合は注意メッセージを出力する
			if(bigValue <= smallValue){
				System.out.printf(FORMAT_CAUTION_INPUT,smallValue);
			}
		// 前回の入力以下の場合は入力を繰り返させる
		} while (bigValue <= smallValue);
		
		// 結果を示すメッセージを出力する
		System.out.printf(FORMAT_RESULT_OPERATION, (bigValue - smallValue) );
		
		// 入力用ストリームを閉じる
		InputScanner.close();
	}
}
