package kensyu02;

import static math.AggregateOperation.*;

/*
 *  3値の大小関係13種類全ての組み合わせに対して
 *  中央値を求めて表示するクラス
 */
public class E1_4_MedianAllPattern {

	// 処理内容の説明を設定します
	private static final String MESSAGE_PROCESS_DETAIL = "3つの数値の全ての大小パターンから中央値を求めます";
	// 比較用の値 1 を設定します
	private static final int COMPARISON_ONE = 1;
	// 比較用の値 2 を設定します
	private static final int COMPARISON_TWO = 2;
	// 比較用の値 3 を設定します
	private static final int COMPARISON_THREE = 3;
	
	/*
	 * 中央値を求めるメソッドに対して
	 * 3つの引数の値に想定される大小関係の全ての組み合わせを入力し
	 * 結果を確認する
	 */
	public static void main(String[] arg){
		
		// 処理の内容を出力します
		System.out.println(MESSAGE_PROCESS_DETAIL);
		// firstValue = secondValue > thirdValue のパターンを検証する
		System.out.println( checkSearchMedian(COMPARISON_THREE, COMPARISON_THREE, COMPARISON_TWO) );
		// firstValue = thirdValue > secondValue のパターンを検証する
		System.out.println( checkSearchMedian(COMPARISON_THREE, COMPARISON_TWO, COMPARISON_THREE) );
		// firstValue > secondValue = thirdValue のパターンを検証する
		System.out.println( checkSearchMedian(COMPARISON_THREE, COMPARISON_TWO, COMPARISON_TWO) );
		// firstValue > secondValue > thirdValue のパターンを検証する
		System.out.println( checkSearchMedian(COMPARISON_THREE, COMPARISON_TWO, COMPARISON_ONE) );
		// firstValue > thirdValue > secondValue のパターンを検証する
		System.out.println( checkSearchMedian(COMPARISON_THREE, COMPARISON_ONE, COMPARISON_TWO) );
		// secondValue > firstValue > thirdValue のパターンを検証する
		System.out.println( checkSearchMedian(COMPARISON_TWO, COMPARISON_THREE, COMPARISON_ONE) );
		// secondValue > firstValue = thirdValue のパターンを検証する
		System.out.println( checkSearchMedian(COMPARISON_TWO, COMPARISON_THREE, COMPARISON_TWO) );
		// secondValue = thirdValue > firstValue のパターンを検証する
		System.out.println( checkSearchMedian(COMPARISON_TWO, COMPARISON_THREE, COMPARISON_THREE) );
		// firstValue = secondValue = thirdValue のパターンを検証する
		System.out.println( checkSearchMedian(COMPARISON_TWO, COMPARISON_TWO, COMPARISON_TWO) );
		// thirdValue > firstValue > secondValue のパターンを検証する
		System.out.println( checkSearchMedian(COMPARISON_TWO, COMPARISON_ONE, COMPARISON_THREE) );
		// secondValue > thirdValue > firstValue のパターンを検証する
		System.out.println( checkSearchMedian(COMPARISON_ONE, COMPARISON_THREE, COMPARISON_TWO) );
		// thirdValue > secondValue > firstValue のパターンを検証する
		System.out.println( checkSearchMedian(COMPARISON_ONE, COMPARISON_TWO, COMPARISON_THREE) );
	}
	
	/*
	 *  中央値取得関数をチェックします
	 */
	private static String checkSearchMedian(int firstValue, int secondValue, int thirdValue ) {
		// 引数のうちの中央値を取得します
		int medianValue = searchMedian(firstValue, secondValue, thirdValue);
		// 結果を文字列で返します
		return String.format("%d , %d , %d の中央値は : %d です", firstValue, secondValue , thirdValue, medianValue);
	}

}
