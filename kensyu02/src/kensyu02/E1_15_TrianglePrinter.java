package kensyu02;


import java.util.Scanner;

/*
 * 4種類の三角形を表示するメソッドを使うクラス
 */
public class E1_15_TrianglePrinter {
	
	// 処理内容の説明を設定します
	private static final String MESSAGE_PROCESS_DETAIL = "指定されたサイズから4種類の三角形を描画します";
	// 右上が直角の三角形を示す文字列です
	private static final String TRIANGLE_RIGHT_UPPER = "(直角が右上の三角形)";
	// 右下が直角の三角形を示す文字列です
	private static final String TRIANGLE_RIGHT_BOTTOM = "(直角が右下の三角形)";
	// 左上が直角の三角形を示す文字列です
	private static final String TRIANGLE_LEFT_UPPER = "(直角が左上の三角形)";
	// 左下が直角の三角形を示す文字列です
	private static final String TRIANGLE_LEFT_BOTTOM = "(直角が左下の三角形)";
	// 描画に使う文字です
	private static final String SYMBOL_DRAW_FILL = "*";
	// 描画を調整するオフセットです
	private static final String OFFSET_DRAW = " ";
	// 数値型変数を 0 で初期化するための値です
	private static final int INITIALIZE_ZERO = 0;
	// カウンターの値を出力用に変換する値です
	private static final int SHIFT_OUTPUT_FORMAT = 1;
	
	/*
	 * 任意のサイズを設定し、4種類の直角三角形を描画します
	 */
	public static void main(String[] arg){
		int figureSize;		// 入力されたサイズを保持する変数です
		
		// 数値入力を行うためのオブジェクトを作成します
		Scanner InputScanner = new Scanner(System.in);

		// 処理内容を出力します
		System.out.println(MESSAGE_PROCESS_DETAIL);
		// 図形の大きさ入力を求めます
		
		// 整数値を確実に入力させます
		do {
			// 入力された値を保持します
			figureSize = InputScanner.nextInt();
		// 1以上の整数値が入力されるまで繰り返します
		} while (figureSize <= 0);

		// 直角が左上の三角形を描画します
		triangleLeftUpper(figureSize);
		// 直角が右上の三角形を描画します
		triangleRightUpper(figureSize);
		// 直角が左下の三角形を描画します
		triangleLeftBottom(figureSize);
		// 直角が右下の三角形を描画します
		triangleRightBottom(figureSize);
		
		// 入力用ストリームを閉じる
		InputScanner.close();
	}
	
	// 直角が左上の三角形を描画します
	private static void triangleLeftUpper(int figureSize){
		// 描画する図形情報を出力します
		System.out.println(TRIANGLE_LEFT_UPPER);
		
		// 三角形を描画します
		for(int rowCount = INITIALIZE_ZERO; rowCount < figureSize; rowCount++ ){
			// 行のカウントに応じた描画文字を出力します
			for(int columnCount = figureSize; columnCount > rowCount; columnCount-- ){
				// 描画文字を出力します
				System.out.print(SYMBOL_DRAW_FILL);
			}
			// 描画を調整する開業を出力します
			System.out.println();
		}
		
	}
	// 直角が右上の三角形を描画します
	private static void triangleRightUpper(int figureSize){
		// 描画する図形情報を出力します
		System.out.println(TRIANGLE_RIGHT_UPPER);
		
		// 三角形を描画します
		for(int rowCount = INITIALIZE_ZERO; rowCount < figureSize; rowCount++ ){
			// 行に応じたオフセットを出力します
			for(int columnCount = INITIALIZE_ZERO; columnCount < rowCount; columnCount++ ){
				// オフセット文字を描画します
				System.out.print(OFFSET_DRAW); 
			}
			// 行のカウントに応じた描画文字を出力します
			for(int columnCount = figureSize; columnCount > rowCount; columnCount-- ){
				// 描画文字を出力します
				System.out.print(SYMBOL_DRAW_FILL);
			}
			// 描画を調整する開業を出力します
			System.out.println();
		}
	}
	// 直角が左下の三角形を描画します
	private static void triangleLeftBottom(int figureSize){
		// 描画する図形情報を出力します
		System.out.println(TRIANGLE_LEFT_BOTTOM);
		
		// 三角形を描画します
		for(int rowCount = INITIALIZE_ZERO; rowCount < figureSize; rowCount++ ){
			// 行のカウントに応じた描画文字を出力します
			for(int columnCount = INITIALIZE_ZERO; columnCount <= rowCount; columnCount++ ){
				// 描画文字を出力します
				System.out.print(SYMBOL_DRAW_FILL);
			}
			// 描画を調整する開業を出力します
			System.out.println();
		}
		
	}
	// 直角が右下の三角形を描画します
	private static void triangleRightBottom(int figureSize){
		// 描画する図形情報を出力します
		System.out.println(TRIANGLE_RIGHT_BOTTOM);
		
		// 三角形を描画します
		for(int rowCount = INITIALIZE_ZERO; rowCount < figureSize; rowCount++ ){
			// 行に応じたオフセットを出力します
			for(int columnCount = figureSize - (rowCount + SHIFT_OUTPUT_FORMAT); columnCount > INITIALIZE_ZERO; columnCount-- ){
				// オフセットを描画します
				System.out.print(OFFSET_DRAW); 
			}
			// 行のカウントに応じた描画文字を出力します
			for(int columnCount = INITIALIZE_ZERO; columnCount <= rowCount; columnCount++ ){
				// 描画文字を出力します
				System.out.print(SYMBOL_DRAW_FILL);
			}
			// 描画を調整する開業を出力します
			System.out.println();
		}
	}
	
}
