package kensyu02;


import java.util.Scanner;
/*
 * 段に応じた数字を積み上げたピラミッドを描画するメソッドを使うクラスです
 */
public class E1_17_NumberPyramidPrinter {
	// 処理内容の説明を設定します
	private static final String MESSAGE_PROCESS_DETAIL = "任意のサイズのピラミッドを描画します";
	// 数値入力を求めるメッセージを設定します
	private static final String MESSAGE_INPUT_NUMBER = "サイズを正の整数値で入力してください";
	// 描画の際のメッセージを設定します
	private static final String MESSAGE_PRINT_PYRAMID = "ピラミッドを描画します";
	// 描画を調整するオフセットです
	private static final String OFFSET_DRAW = " ";
	// カウンターの初期値です
	private static final int START_COUNT = 0;
	// ピラミッドの中心の長さです
	private static final int PYRAMID_CENTER_LENGTH = 1;
	// ピラミッドの中心以外のパーツの数です
	private static final int NUMBER_PYRAMID_SIDE = 2;
	// カウンターを出力用の値に変換する値です
	private static final int SHIFT_NUMBER_OUTPUT_FORMAT = 1;
	// 段数の一桁目を求めるための値です
	private static final int DIVISOR_GET_FIRST_DIGIT = 10;
	/*
	 * 任意の整数値入力を取得し、その値に応じてピラミッドを描画します
	 */
	public static void main(String[] arg){
		int figureSize;		// 入力された図形サイズを保持する変数です
		
		// 入力された値を取得するオブジェクトを作成します
		Scanner InputScanner = new Scanner(System.in);
		
		// 処理内容を出力します
		System.out.println(MESSAGE_PROCESS_DETAIL);
		// 図形サイズ入力を求めます
		System.out.println(MESSAGE_INPUT_NUMBER);
		// 入力された値を保持します
		figureSize = InputScanner.nextInt();
		// ピラミッドを描画する際のメッセージを出力します
		System.out.println(MESSAGE_PRINT_PYRAMID);
		// ピラミッドを描画します
		printPyramid(figureSize);
		
		// 入力用ストリームを閉じます
		InputScanner.close();
	}
	
	/*
	 * 任意サイズのピラミッドを描画します
	 */
	private static void printPyramid(int figureSize){
		// ピラミッドを一段ずつ描画します
		for(int rowCount = START_COUNT; rowCount < figureSize; rowCount++){
			
			// 描画に使う数値を設定します
			int fillNumber = (rowCount + SHIFT_NUMBER_OUTPUT_FORMAT) % DIVISOR_GET_FIRST_DIGIT;
			// 描画文字の数を調整します
			int fillLength = (rowCount) * NUMBER_PYRAMID_SIDE + PYRAMID_CENTER_LENGTH;
			// オフセット文字の数を調性します
			int offsetLength = figureSize - (rowCount + SHIFT_NUMBER_OUTPUT_FORMAT);
			// 格段のオフセットを出力します
			for(int columnCount = START_COUNT; columnCount < offsetLength; columnCount++){
				// オフセットを描画します
				System.out.print(OFFSET_DRAW);
			}
			// 中心ができるようにFILL文字の数を調整して描画します
			for(int columnCount = START_COUNT; columnCount < fillLength; columnCount++){
				// 描画用文字を出力します
				System.out.print(fillNumber);
			}
			// 形を調整するための改行を出力します
			System.out.println();

		}
		
		
	}
}
