package Day12;

import java.util.Arrays;

public class TestArray {

	// 배열을 매개변수로 받아서
	// 0번째 인덱스 값과 마지막 인덱스 값 위치 변경

	public static void changArr(int[] arr) {
		int temp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;

		System.out.println(Arrays.toString(arr));

	}

	public static String changeString(String str) {
		str += "!!";
		return str;
	}
}
