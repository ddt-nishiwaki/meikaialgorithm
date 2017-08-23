package kensyu02;


public class E1_13_SumTablePrinter {
	
	// 足し算のベースとなる値を設定します
	private static final int BASE_NUMBER = 9;
	// 数値型変数を 0 で初期化するための変数です
	private static final int INITIALIZE_ZERO = 0;
	// カウンター数値を出力用に変換する値です
	private static final int SHIFT_OUTPUT_FORMAT = 1;
	// 一桁上の桁数を求めるための値です
	private static final int SHIFT_NEXT_DIGIT = 1;

	// 数字を出力する際のフォーマットです
	private static final String FORMAT_OUTPUT_NUMBER = " %2d";
	// 表の水平線を描画する文字列です
	private static final String SYMBOL_DRAW_HORIZONAL_LINE = "-";
	// 表の縦線を描画する文字列です
	private static final String SYMBOL_DRAW_VERTICAL_LINE = "|";
	// 線の交差を示す文字列です
	private static final String SYMBOL_DRAW_CROSS_POINT = "+";
	// 余白調性用の文字列です
	private static final String OFFSET_DRAW = " ";
	// 行番号を出力するためのフォーマットです
	private static final String FORMAT_ROW_NUMBER = " %2d %s";

	
	/*
	 *  足し算の表を出力します
	 */
	public static void main (String[] arg){
		// 足し算の表を出力します
		printMultipleTable(BASE_NUMBER);
	}

	/*
	 *  足し算の表を出力します
	 */
	public static void printMultipleTable(int baseNumber){
		// ベースとなる整数値の桁数を取得します
		int baseDigit = String.valueOf(baseNumber).length() + SHIFT_NEXT_DIGIT;
		// ヘッダーのオフセットを出力します
		printMultipleTableHeaderOffset(baseDigit);
		// カラムのヘッダーを出力します
		printMultipleTableHeader(baseNumber);
		// ヘッダーとの区切り線を出力します
		printMultipleTableHeaderSeparator(baseNumber);
		// 乗算の結果を出力します
		printMultipleTableRow(baseNumber);
	}
	/*
	 * 足し算の表のカラムヘッダーのオフセットを描画します
	 */
	public static void printMultipleTableHeaderOffset(int baseDigit){
		// 左にスペース一つ分の余白を設定します
		System.out.print(OFFSET_DRAW);
		// ヘッダーのオフセットを出力します
		for(int columnCount = INITIALIZE_ZERO; columnCount < baseDigit; columnCount++){
			// ヘッダーのオフセットを出力します
			System.out.print(OFFSET_DRAW);
		}
		// 右にスペース一つ分の余白を設定します
		System.out.print(OFFSET_DRAW);
		// カラム表示領域を示す線を描画します
		System.out.print(SYMBOL_DRAW_VERTICAL_LINE);
	}
	/*
	 * 足し算の表のヘッダーを出力します
	 */
	public static void printMultipleTableHeader(int baseNumber){
		// カラムのヘッダーを出力します
		for(int columnCount = INITIALIZE_ZERO; columnCount < baseNumber; columnCount++){
			// 各カラムの値を出力します
			System.out.printf(FORMAT_OUTPUT_NUMBER, (columnCount + SHIFT_OUTPUT_FORMAT));
		}
		// カラムの出力を終えるために開業を出力します
		System.out.println();
	}
	/*
	 * 足し算の表のヘッダーとの区切り線(左側)を出力します
	 */
	public static void printMultipleTableHeaderLeftSeparator(int baseNumber){
		// ベースとなる整数値の桁数を取得します
		int baseDigit = String.valueOf(baseNumber).length() + SHIFT_NEXT_DIGIT;
		
		// 左に半角一つ文の線を設定します
		System.out.print(SYMBOL_DRAW_HORIZONAL_LINE);
		// ヘッダーのオフセットを出力します
		for(int columnCount = INITIALIZE_ZERO; columnCount < baseDigit; columnCount++){
			// ヘッダーのオフセットを出力します
			System.out.print(SYMBOL_DRAW_HORIZONAL_LINE);
		}
		// 左に半角一つ文の線を設定します
		System.out.print(SYMBOL_DRAW_HORIZONAL_LINE);
		// 線の交差を表現します
		System.out.print(SYMBOL_DRAW_CROSS_POINT);
		
	}
	/*
	 * 足し算の表のヘッダーとの区切り線(右側)を出力します
	 */
	public static void printMultipleTableHeaderRightSeparator(int baseNumber){
		String horizonalLine = SYMBOL_DRAW_HORIZONAL_LINE;
		// ベースとなる整数値の桁数を取得します
		int baseDigit = String.valueOf(baseNumber).length() + SHIFT_NEXT_DIGIT;
		// カラム一つ分の線の長さを設定します
		for(int digitCount = 0; digitCount < baseDigit; digitCount++){
			horizonalLine += SYMBOL_DRAW_HORIZONAL_LINE;
		}
		// 区切り線を出力します
		for(int columnCount = INITIALIZE_ZERO; columnCount < baseNumber; columnCount++){
			System.out.print(horizonalLine);
		}
	}
	/*
	 * 足し算の表のヘッダーとの区切り線を出力します
	 */
	public static void printMultipleTableHeaderSeparator(int baseNumber){
		// 区切り線の左側を描画します
		printMultipleTableHeaderLeftSeparator(baseNumber);
		// 区切り線の右側を描画します
		printMultipleTableHeaderRightSeparator(baseNumber);
		// 区切り線の出力を終えるために改行を設定する
		System.out.println();
	}
	/*
	 *  足し算の表の各行を出力します
	 */
	public static void printMultipleTableRow(int baseNumber){
		// テーブルの各行を出力します
		for(int rowCount = INITIALIZE_ZERO; rowCount < baseNumber; rowCount++){
			int outputRow = rowCount + SHIFT_OUTPUT_FORMAT;
			// 行番号を出力します
			System.out.printf(FORMAT_ROW_NUMBER, outputRow, SYMBOL_DRAW_VERTICAL_LINE);
			// 乗算の値を出力します
			for(int columnCount = INITIALIZE_ZERO; columnCount < baseNumber; columnCount++){
				int outputColumn = columnCount + SHIFT_OUTPUT_FORMAT;
				System.out.printf(FORMAT_OUTPUT_NUMBER, (outputColumn + outputRow));
			}
			// 行の出力を終えるための改行を出力します
			System.out.println();
		}
	}
}
