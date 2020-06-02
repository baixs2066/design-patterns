package design.singleton.type7;



public class SingletonTest07 {

	public static void main(String[] args) {
		System.out.println("ʹ�þ�̬�ڲ�����ɵ���ģʽ");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 =Singleton.getInstance();
		System.out.println(instance==instance2);
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());

	}

}
/*
 * �ⲿ�౻װ�ص�ʱ���ڲ��಻�ᱻװ�أ����Բ���ʵ����Singleton��
 * ����getInstance��ʽ���ؾ�̬�ڲ���ľ�̬���Ե�ʱ��װ���ڲ������װ�����̰߳�ȫ�ģ�
 * ʵ����Singleton
 */
class Singleton{
	//������˽�л�
	private Singleton() {}
	
	//дһ����̬�ڲ��࣬��������һ����̬����Singleton
	private static class SingletonInstance{
		private static final Singleton INSTANCE = new Singleton();
	}
	//�ṩһ�����еؾ�̬���������ؾ�̬�ڲ���ľ�̬����
	public static Singleton getInstance() {
		return SingletonInstance.INSTANCE;
	}
	
}
