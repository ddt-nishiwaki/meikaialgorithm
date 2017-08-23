package math;

/*
 * 極値計算に関するユーティリティクラス
 */
public class AggregateOperation {
	
	
	/*
	 * 最大値を計算します
	 */
	public static int max4(int firstValue, int secondValue, int thirdValue, int fourthValue){
		// 比較のために一つ目の値を最大値扱いする
		int max = firstValue;
		// 現在の最大値と二つ目の値を比較して大きい方を最大値扱いする
		if (max < secondValue){
			// 最大値に二つ目の値を設定する
			max = secondValue;
		}
		// 現在の最大値と三つ目の値を比較して大きい方を最大値扱いする
		if (max < thirdValue){
			// 最大値に二つ目の値を設定する
			max = thirdValue;
		}
		// 現在の最大値と四つ目の値を比較して大きい方を最大値扱いする
		if (max < fourthValue){
			// 最大値に二つ目の値を設定する
			max = fourthValue;
		}
		// 最終的な最大値を返す
		return max;
	}
	/*
	 * 最小値を計算します
	 */
	public static int min3(int firstValue, int secondValue, int thirdValue){
		// 比較のために一つ目の値を最大値扱いする
		int min = firstValue;
		// 現在の最大値と二つ目の値を比較して大きい方を最大値扱いする
		if (min > secondValue){
			// 最大値に二つ目の値を設定する
			min = secondValue;
		}
		// 現在の最大値と三つ目の値を比較して大きい方を最大値扱いする
		if (min > thirdValue){
			// 最大値に二つ目の値を設定する
			min = thirdValue;
		}
		// 最終的な最大値を返す
		return min;
	}
	public static int min4(int firstValue, int secondValue, int thirdValue, int fourthValue){
		// 比較のために一つ目の値を最大値扱いする
		int min = firstValue;
		// 現在の最大値と二つ目の値を比較して大きい方を最大値扱いする
		if (min > secondValue){
			// 最大値に二つ目の値を設定する
			min = secondValue;
		}
		// 現在の最大値と三つ目の値を比較して大きい方を最大値扱いする
		if (min > thirdValue){
			// 最大値に二つ目の値を設定する
			min = thirdValue;
		}
		// 現在の最大値と四つ目の値を比較して大きい方を最大値扱いする
		if (min > fourthValue){
			// 最大値に二つ目の値を設定する
			min = fourthValue;
		}
		// 最終的な最大値を返す
		return min;
	}
	/*
	 * 3値の中央値を求めます
	 */
	public static int searchMedian(int firstValue, int secondValue, int thirdValue){
		// 一つ目の値が二つ目の値以上の場合の処理を行う
		if( firstValue >= secondValue ){
			// 二つ目の値が三つ目の値以上の場合の処理を行う
			if( secondValue >= thirdValue ){
				// 二つ目の値を中央値として返す
				return secondValue;
			// 二つ目の値が最小値の場合に、三つ目の値が最大値だった場合の処理を行う
			} else if ( firstValue <= thirdValue ){
				// 一つ目の値を最大値として返す
				return firstValue;
			// 二つ目の値が最小値の場合に、一つ目の値が最大値だった場合の処理を行う
			} else {
				// 三つ目の値を最大値として返す
				return thirdValue;
			}
		// 一つ目の値が少なくとも最大値ではない場合に最小値でもなかった場合の処理を行う
		} else if ( firstValue > thirdValue ) {
			// 値が3つしかないため一つ目の値を中央値と確定して返す
			return firstValue;
		// 一つ目の値が最小値と確定した場合に、二つ目の値が最大値と確定した場合の処理を行う
		} else if ( secondValue > thirdValue ) {
			// 値が3つしかないため三つ目の値を中央値と確定して返す
			return thirdValue;
		// 二つ目の値が最大値でもなく最小値でもない場合の処理を行う
		} else {
			// 値が3つしかないため二つ目の値を中央値と確定して返す
			return secondValue;
		}
	}
	private static final int START_SUM_VALUE = 1;
	private static final int EVEN_DIVISOR = 2;

	/*
	 * 1 ~ n の総和を求めます(ガウスの法則を用いて実装します)
	 */
	public static int sumGauss(int operationTimes){
		// 和が同じになる値の組み合わせパターンの数を求めて設定します
		int equalSumPair = operationTimes/EVEN_DIVISOR;
		// ペアが作れない(奇数)値があれば 1 を なければ(偶数) 0　設定する
		int notEqualSumPare = operationTimes%EVEN_DIVISOR;
		// ガウスの法則により 1 ~ n の総和を求めて返します
		return (START_SUM_VALUE + operationTimes) * equalSumPair + (equalSumPair + notEqualSumPare) * notEqualSumPare;
	}
	/*
	 * 任意の整数２つを含む間の数の総和を求めます
	 */
	public static int sumGauss(int firstValue, int secondValue){
		// 入力された整数値のうち大きい値を保持する変数です
		int maxValueOfSumRange = (firstValue > secondValue) ? firstValue : secondValue;
		// 入力された整数値のうち小さい値を保持する変数です
		int minValueOfSumRange = (maxValueOfSumRange > secondValue) ? secondValue : firstValue;		
		// 和が同じになる値の組み合わせパターンの数を求めて設定します
		int equalSumPair = (maxValueOfSumRange - minValueOfSumRange + 1) / EVEN_DIVISOR;
		// ペアが作れない(奇数)値があれば 1 を なければ(偶数) 0　設定する
		int notEqualSumPare = (maxValueOfSumRange - minValueOfSumRange +1) % EVEN_DIVISOR;
		// ガウスの法則により 1 ~ n の総和を求めて返します
		return (minValueOfSumRange + maxValueOfSumRange) * equalSumPair + (equalSumPair + minValueOfSumRange) * notEqualSumPare;
	}

}
