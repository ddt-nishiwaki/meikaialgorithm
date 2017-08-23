package kensyu02;

import java.util.Scanner;
/*
 * 1 ~ n までの値の総和を求めるwhile文のカウントと
 * 条件式とのつじつまが合っているか確認するクラス
 */
public class E1_6_CheckWhileCounter {
	// 処理内容の説明を設定します
	private static final String MESSAGE_PROCESS_DETAIL  = "1から n までの和を求めます";
	// 数値入力を求めるメッセージを設定します
	private static final String MESSAGE_INPUT_NUMBER    = "n の値を入力してください";
	// 結果を出力する際のフォーマットを設定します
	private static final String FORMAT_RESULT_OPERATION = "1 から %d までの和は %d です。\n";
	// 確認事項を示す文字列を設定します
	private static final String MESSAGE_CHECK_WHILE_COUNT = "whileで扱ったカウンターの値が n+1 担っていることを確認します";
	// whileカウンターの値を確認するためのフォーマットを設定します
	private static final String FORMAT_CHECK_WHILE_COUNT  = "入力した n の値 : %d  whileの最終的なカウント : %d\n";
	// 数値型変数を 0 で初期化するための定数です
	private static final int INITIALIZE_ZERO = 0;
	// whileカウンターの初期値を設定します
	private static final int START_SUM_NUMBER = 1;
	/*
	 *  while文の実行回数を設定し
	 *  ループを抜けた際のカウントが n+1 となっていることを確認する
	 */
	public static void main(String[] arg){
		int operationTimes;			// 計算回数を設定するための変数です
		int operationCount;			// 計算回数をカウントするための変数です
		int resultSumOperation;		// 1 ~ n の総和を求めるための変数です
		
		// 計算回数を設定する数値入力を取得するためのオブジェクトを作成する
		Scanner InputScanner = new Scanner(System.in);
		
		// 処理内容を出力します
		System.out.println(MESSAGE_PROCESS_DETAIL);
		// 計算回数の入力を求めます
		System.out.println(MESSAGE_INPUT_NUMBER);
		// 入力された値を保持します
		operationTimes = InputScanner.nextInt();
		// 1 ~ n の総和を求めるための変数を初期化します
		resultSumOperation = INITIALIZE_ZERO;
		// while文で扱うカウンターを設定します
		operationCount = START_SUM_NUMBER;
		// 1 ~ n までの総和を求めます
		while ( operationCount <= operationTimes){
			// 総和を求めるために 1 ~ n の値を順次足していきます
			resultSumOperation += operationCount;
			// 足した値に1足した数をカウンターに設定します
			operationCount++;
		}
		// 総和の結果を出力します
		System.out.printf(FORMAT_RESULT_OPERATION, operationTimes,resultSumOperation);
		// whileカウンターの最終的な値を確認する際のメッセージを出力する
		System.out.println(MESSAGE_CHECK_WHILE_COUNT);
		// 設定した計算回数とwhileで使用したカウンターの値を確認のために出力します
		System.out.printf(FORMAT_CHECK_WHILE_COUNT, operationTimes, operationCount);
		
		// 入力用ストリームを閉じる
		InputScanner.close();
	}
}
