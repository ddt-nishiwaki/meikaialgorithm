package kensyu02;

import java.util.Scanner;

/*
 * 1 ~ n までの総和を for文 を用いて求めます
 */
public class E1_7_SumForCustom {
	// 処理内容の説明を設定します
	private static final String MESSAGE_PROCESS_DETAIL = "1 ~ n までの総和を求めます";
	// 数値入力を求めるメッセージを設定します
	private static final String MESSAGE_INPUT_NUMBER = "nの値を入力してください";
	// 計算結果を出力する際のメッセージを設定する
	private static final String MESSAGE_RESULT_OPERATION = "以下計算結果を出力します";
	// 仕様通りに加算している過程を出力するためのフォーマットを設定します
	private static final String FORMAT_OUTPUT_ADD_VALUE  = " + %d";
	// 仕様通りに総和を出力するためのフォーマットを設定します
	private static final String FORMAT_OUTPUT_RESULT_OPERATION = " = %d\n";
	// 不正な値入力の際に出力するメッセージを設定します
	private static final String MESSAGE_CAUTION_INPUT = "ERROR: 1以上の値を入力してください";
	// カウンターの初期値を設定します
	private static final int FIRST_COUNT_VALUE = 0;
	// カウンターを一つ先にずらすための定数です
	private static final int SHIFT_NEXT_VALUE = 1;

	/*
	 * 値の入力を取得して、その値までの総和を求めます
	 */
	public static void main(String[] arg){
		int operationTimes;	// 処理回数を設定する変数です
		// 総和を求めるための変数です
		int resultSum = FIRST_COUNT_VALUE;
		
		// 入力された値を取得するためのオブジェクトを設定する
		Scanner InputScanner = new Scanner(System.in);
		// 処理内容を出力します
		System.out.println(MESSAGE_PROCESS_DETAIL);
		// 計算回数の入力を求めます
		System.out.println(MESSAGE_INPUT_NUMBER);
		// 入力された値を保持します
		operationTimes = InputScanner.nextInt();
		// 計算結果を出力する際のメッセージを出力する
		System.out.println(MESSAGE_RESULT_OPERATION);
		// 1 ~ 入力された値までの総和を計算します
		for (int sumCount = FIRST_COUNT_VALUE; sumCount < operationTimes; sumCount++){
			// 1からの計算にシフトします
			int addValue = sumCount + SHIFT_NEXT_VALUE;
			// 1 ~ 入力された値までを順次足していく
			resultSum += addValue;
			
			// 足した値を確認するために出力する(1回目)
			if ( sumCount == FIRST_COUNT_VALUE){
				// 足し算する値を表示する
				System.out.print(addValue);
			// 足した値を確認するために出力する(2回目以降は + を表示していく)
			} else {
				// 式として表示するために + を表現して出力する
				System.out.printf(FORMAT_OUTPUT_ADD_VALUE, addValue);
			}
		}
		// 総和の結果を出力します
		if(resultSum > FIRST_COUNT_VALUE){
			// 仕様通りに結果を出力します
			System.out.printf(FORMAT_OUTPUT_RESULT_OPERATION, resultSum);
		} else {
			// 入力が不正だった際のメッセージを出力します
			System.out.println(MESSAGE_CAUTION_INPUT);
		}
		
		// 入力用ストリームを閉じる
		InputScanner.close();
	}
}
