package kensyu02;

import java.util.Scanner;
/*
 * 整数値入力を受け取り、その値に応じた大きさの四角形を出力するクラスです
 */
public class E1_14_SquarePrinter {
	
	// 処理内容の説明を設定します
	private static final String MESSAGE_PROCESS_DETAIL = "任意のサイズの四角形を描画します";
	private static final String MESSAGE_INPUT_NUMBER = "サイズを入力してください";
	private static final String MESSAGE_OUTPUT_SQUARE = "四角形を描画します";
	private static final int INITIALIZE_ZERO = 0;

	// 描画に使う文字を設定します
	private static final String SYMBOL_DRAW_FILL = "*";

	/*
	 * 任意のサイズを設定し、四角形を描画します
	 */
	public static void main (String[] arg){
		int inputNumber;	// 入力された数値を保持する変数です
		
		// 整数値入力を取得するオブジェクトを作成する
		Scanner InputScanner = new Scanner(System.in);
		
		// 処理内容の説明を出力します
		System.out.println(MESSAGE_PROCESS_DETAIL);
		// 数値入力を求めるメッセージを出力します
		System.out.println(MESSAGE_INPUT_NUMBER);
		// 整数値入力を保持します
		inputNumber = InputScanner.nextInt();
		
		// 結果を出力する際のメッセージを出力します
		System.out.println(MESSAGE_OUTPUT_SQUARE);
		// 四角形を一行ずつ描画していきます
		for(int rowCount = INITIALIZE_ZERO; rowCount < inputNumber; rowCount++ ){
			// 各行を指定サイズの大きさで描画します
			for(int columnCount = INITIALIZE_ZERO; columnCount < inputNumber; columnCount++ ){
				// 描画用文字列を出力します
				System.out.print(SYMBOL_DRAW_FILL);
			}
			// 描画を整えるための改行を出力する
			System.out.println();
		}
		// 入力用ストリームを閉じる
		InputScanner.close();
	}
}
