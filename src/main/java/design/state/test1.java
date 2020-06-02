package design.state;

public class test1 {

	public static int getCount(int count) {

		int curCount = count;
		count--;
		System.out.println(count);
		return curCount;

	}

	public static void main(String[] args) {

		int a = getCount(0);
		System.exit(0);
		System.out.println(a);
	}

}
