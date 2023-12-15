package Day12;

public class goodcacl extends Calculater{

	@Override
	int add(int x, int y) {
		
		return x+y;
	}

	@Override
	int sub(int x, int y) {
		
		return x-y;
	}

	@Override
	double average(int[] arr) {
	int sum = 0;
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
	}
//	for(int v : arr) {
//		sum += v;
//	}
		return (double)sum/arr.length; 
	}


}
