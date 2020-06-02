package design.singleton.type6;



public class SingletonTest06 {

	public static void main(String[] args) {
		System.out.println("˫�ؼ�飬�̰߳�ȫ");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 =Singleton.getInstance();
		System.out.println(instance==instance2);
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());

	}

}

class Singleton{
	
	//volatile�������޸ĺ��ֵ�������µ��ڴ棬�������߳̿ɼ����������Ϊ������synchronize
	private static volatile Singleton instance;
	//˽�л�������
	private Singleton() {}
	//�ṩһ����̬�Ĺ�������������˫�ؼ����룬����̰߳�ȫ���⣬ͬʱ�������������
	//ͬʱ��֤��Ч��
	public static  Singleton getInstance() {
		if(instance==null) {
			synchronized(Singleton.class){
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
