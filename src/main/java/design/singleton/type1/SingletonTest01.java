package design.singleton.type1;

public class SingletonTest01 {
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		Singleton instance2 =Singleton.getInstance();
		System.out.println(instance==instance2);
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());
		
	}

}
/*
 * ����ʽ����̬������
�������£�
1��������˽�л�
2������ڲ���������
3�����Ⱪ¶һ����̬�Ĺ���������getInstance
4������ʵ��
 */
class Singleton{
	
	//������˽�л�
	private Singleton() {
		
	}
	//����ڲ������������Ⱪ¶һ����̬�Ĺ���������getInstance
	private final static Singleton instance = new Singleton();
	//
	public static Singleton getInstance() {
		return instance;
	}
	
	
}