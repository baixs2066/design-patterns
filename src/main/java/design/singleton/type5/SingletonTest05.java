package design.singleton.type5;



public class SingletonTest05 {

	public static void main(String[] args) {
		System.out.println("����ʽ���̲߳���ȫ,ͬ�������");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 =Singleton.getInstance();
		System.out.println(instance==instance2);
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());

	}

}

class Singleton{
	
	
	private static Singleton instance;
	//˽�л�������
	private Singleton() {
		
	}
	//�ṩһ����̬�Ĺ�������������ͬ������飬Ҳ���ﲢ���ܽ���̰߳�ȫ����
	public static  Singleton getInstance() {
		if(instance==null) {
			synchronized(Singleton.class) {
				instance = new Singleton();
			}
			
		}
		return instance;
	}
}
