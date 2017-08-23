package kensyu02;

/*
 * クラス内で定義している中央値を求めるメソッドについて
 * 実行効率が悪い原因を考察し、コメントに残します
 */
public class E1_5_MedianAlgorithmConsideration {

	/*
	 * 3つの引数のうち、中央値を求めます
	 * 考察：
	 * 条件判定に かつ を使っているために値の比較を重複して行なっているため効率が悪くなっています
	 * 具体的には 最初の if の条件では secondValue >= firstValue の比較に注目すると 次の else では  
	 * secondValue >= firstValue かつ thirdValue <= firstValue のパターンが除外された状態になっています。
	 * これは secondValue >= firstValue でも thirdValue <= firstValue でないパターンは除外れていないということです。
	 * else if の条件式の中に firstValue < secondValue (書き換えると secondValue > firstValue)が入っていますが
	 * secondValue >= firstValue と secondValue > firstValue では判定を行う範囲が重複しています
	 * &&(かつ)を条件式で使うことでコードはまとまって見えますが、判定処理が結果的に重複して行われているため効率が悪いコードとなっています
	 */
	static int med3(int firstValue, int secondValue, int thirdValue){
		// aが中央値となる条件に当てはまる場合の処理を行う
		if( (secondValue >= firstValue && thirdValue <= firstValue) || (secondValue <= firstValue && thirdValue >= firstValue) ){
			// aを中央値として返す
			return firstValue;
		// bが中央値となる条件に当てはまる場合の処理を行う
		} else if ( (firstValue > secondValue && thirdValue < secondValue) || (firstValue < secondValue && thirdValue > secondValue) ){
			// bを中央値として返す
			return secondValue;
		// cが中央値となる条件に当てはまる場合の処理を行う
		} else {
			// cを中央値として返す
			return thirdValue;
		}
	}
}
