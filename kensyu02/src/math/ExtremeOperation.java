package math;

/*
 * 極値計算に関するユーティリティクラス
 */
public class ExtremeOperation {
	
	
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
}
