package kensyu02;

import static math.AggregateOperation.sumGauss;

import java.util.Scanner;

/*
 * 任意の整数値2つをふくめた間の数の総和を求める関数を使用するクラス
 */
public class E1_9_OperationSumAnyRange {
	
	// 処理内容の説明を設定します
	private static final String MESSAGE_PROCESS_DETAIL = "任意の整数値２つを含めた間の数の総和を求めます";
	// 一つ目の数値入力を求めるメッセージを設定します
	private static final String MESSAGE_INPUT_FIRST_NUMBER = "一つ目の整数を入力してください";
	// 二つ目の数値入力を求めるメッセージを設定します
	private static final String MESSAGE_INPUT_SECOND_NUMBER = "二つ目の整数を入力してください";
	// 結果を出力する際のメッセージを設定します
	private static final String MESSAGE_RESULT_OPERATION = "総和の結果を以下出力します";

	/*
	 * 任意の整数値２つの入力を保持し、
	 * その数を含めた間の数の総和を求めます
	 */
	public static void main (String[] arg){
		int firstNumber;				// 一つ目の入力値を保持する変数です
		int secondNumber;			// 二つ目の入力値を保持する変数です
		
		// 数値入力を受け取るオブジェクトを作成する
		Scanner InputScanner = new Scanner(System.in);

		// 処理の内容を出力します
		System.out.println(MESSAGE_PROCESS_DETAIL);
		// 一つ目の数値の入力を求めるメッセージを出力します
		System.out.println(MESSAGE_INPUT_FIRST_NUMBER);
		// 入力された値を保持します
		firstNumber = InputScanner.nextInt();
		// 二つ目の数値の入力を求めるメッセージを出力します
		System.out.println(MESSAGE_INPUT_SECOND_NUMBER);
		// 入力された値を保持します
		secondNumber = InputScanner.nextInt();
		// 結果を出力する際のメッセージを出力します
		System.out.println(MESSAGE_RESULT_OPERATION);
		// 1 ~ n の総和を求めて出力します
		System.out.println( sumGauss(firstNumber, secondNumber) );
		
		// 入力用ストリームを閉じる
		InputScanner.close();
	}
}
