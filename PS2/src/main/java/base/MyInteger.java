package base;

public class MyInteger {
	private int iValue;
	
	public MyInteger(int iValue) {
		this.iValue = iValue;
	}
	public int getiValue() {
		return iValue;
	}
	public boolean isEven() {
		return (iValue % 2 == 0) ? true:false;
	}
	public boolean isOdd(){
		return (iValue % 2 == 1) ? true:false;
	}
	public boolean isPrime() {
		for (int i = 2; i*i <= iValue; i++) {
			if (iValue % i == 0)
				return false;
		}
		return true;
	}
	public static boolean isEven(int num) {
		return MyInteger.isEven(new MyInteger (num));
	}
	public static boolean isOdd(int num) {
		return MyInteger.isOdd(new MyInteger (num));
	}
	public static boolean isPrime(int num) {
		return MyInteger.isPrime(new MyInteger (num));
	}
	public static boolean isEven(MyInteger num){
		return num.isEven();
	}
	public static boolean isOdd(MyInteger num) {
		return num.isOdd();
	}
	public static boolean isPrime(MyInteger num) {
		return num.isPrime();
	}
	
	public boolean equals(int num){
		return (num == iValue) ? true:false;
	}
	public boolean equals(MyInteger num){
		return (num.getiValue() == iValue) ? true:false;
	}
}
