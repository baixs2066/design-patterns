package design.adapter.interfaceadapter;

public class Client {
	public static void main(String[] args) {
		//����AbstractAdapter�������ڲ���
		AbstractAdapter absAdapter = new AbstractAdapter() {
			//ֻ��Ҫȥ�������� ��Ҫʹ�õ� �ӿڷ���
			@Override
			public void m1() {
				System.out.println("ʹ����m1����");
			}
		};
		absAdapter.m1();
	}
}
