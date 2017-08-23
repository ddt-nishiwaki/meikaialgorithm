package kensyu02;

import java.util.Scanner;
/*
 * 入力された整数値の桁数を求めるメソッドを使うクラス
 */
public class E1_11_OperateNumberOfDigits {
	
	// 処理内容の説明を設定します
	private static final String MESSAGE_PROCESS_DETAIL = "入力された整数値の桁数を求めます";
	// 整数値入力を求めるメッセージを設定します
	private static final String MESSAGE_INPUT_NUMBER = "正の整数値を入力してください";
	// 結果を出力する際のメッセージを設定します
	private static final String FORMAT_RESULT_OPERATION = "その数は%d桁です";
	// 割り切れないことを示す値を設定します
	private static final int DECIDE_NOT_DIVIDE = 0;
	// 数値型変数を 0 で初期化するための変数です
	private static final int INITIALIZE_ZERO = 0;

	/*
	 *  整数値入力を受け取り、その桁数を求めます
	 */
	public static void main (String[] arg){
		// 入力された値を保持する変数です
		int inputOperandNumber;
		// 桁数をカウントする変数です
		int digitCount = INITIALIZE_ZERO;
		
		// 整数値入力を取得するオブジェクトを作成する
		Scanner InputScanner = new Scanner(System.in);
		
		// 処理内容を出力します
		System.out.println(MESSAGE_PROCESS_DETAIL);
		// 整数値の入力を求めます
		System.out.println(MESSAGE_INPUT_NUMBER);
		// 入力された値を保持します
		inputOperandNumber = InputScanner.nextInt();

		// 入力された整数値の桁数をカウントします
		do {
			// 入力された値を10で割れなくなるまで除算する
			inputOperandNumber /= 10;
			// 桁数をカウントします
			digitCount++;
		// 10で割れなくなったら処理を抜けます
		} while ( inputOperandNumber != DECIDE_NOT_DIVIDE );
		
		// カウントした桁数を出力します
		System.out.printf(FORMAT_RESULT_OPERATION, digitCount);
		
		// 入力用ストリームを閉じる
		InputScanner.close();
	}
}
