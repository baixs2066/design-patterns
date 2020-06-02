package design.adapter.interfaceadapter;

public class Client {
	public static void main(String[] args) {
		//创建AbstractAdapter的匿名内部类
		AbstractAdapter absAdapter = new AbstractAdapter() {
			//只需要去覆盖我们 需要使用的 接口方法
			@Override
			public void m1() {
				System.out.println("使用了m1方法");
			}
		};
		absAdapter.m1();
	}
}
