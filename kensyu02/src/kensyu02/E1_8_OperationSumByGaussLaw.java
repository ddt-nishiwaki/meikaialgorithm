package kensyu02;

import java.util.Scanner;
import static math.AggregateOperation.*;
/*
 * ガウスの法則を用いたsum関数を実行するクラス
 */
public class E1_8_OperationSumByGaussLaw {

	// 処理内容の説明をせっていします
	private static final String MESSAGE_PROCESS_DETAIL = "1 ~ n の総和をガウスの法則から求めます";
	// 数値の入力を求めるメッセージを設定します
	private static final String MESSAGE_INPUT_NUMBER = "n の値を入力して下さい";
	// 結果を出力する際のメッセージを設定します
	private static final String MESSAGE_RESULT_OPERATION = "総和の結果を出力します";
	
	/*
	 * 1 ~ n の総和を求めて出力します
	 */
	public static void main (String[] arg){
		int maxValueOfSumRange;		// 入力されたnの値を保持する変数です
		
		// 数値入力を受け取るオブジェクトを作成する
		Scanner InputScanner = new Scanner(System.in);

		// 処理の内容を出力します
		System.out.println(MESSAGE_PROCESS_DETAIL);
		// 数値の入力を求めるメッセージを出力します
		System.out.println(MESSAGE_INPUT_NUMBER);
		// 入力された値を保持します
		maxValueOfSumRange = InputScanner.nextInt();
		// 結果を出力する際のメッセージを出力します
		System.out.println(MESSAGE_RESULT_OPERATION);
		// 1 ~ n の総和を求めて出力します
		System.out.println( sumGauss(maxValueOfSumRange) );
		
		// 入力用ストリームを閉じる
		InputScanner.close();
		
	}
	
}
