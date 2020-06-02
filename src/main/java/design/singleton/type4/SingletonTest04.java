package design.singleton.type4;



public class SingletonTest04 {

	public static void main(String[] args) {
		System.out.println("����ʽ���̰߳�ȫ,ͬ������");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 =Singleton.getInstance();
		System.out.println(instance==instance2);
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());

	}

}
/*
 *
 */
class Singleton{
	
	
	private static Singleton instance;
	//˽�л�������
	private Singleton() {
		
	}
	//�ṩһ����̬�Ĺ�������������ͬ������Ĵ��룬������̲߳���ȫ���� ��ʹ�ø÷���ʱ��ȡ����instance
	public static synchronized Singleton getInstance() {
		if(instance==null) {
			instance = new Singleton();
		}
		return instance;
	}
}
