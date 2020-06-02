package design.singleton.type2;

public class SingletonTest02 {
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		Singleton instance2 =Singleton.getInstance();
		System.out.println(instance==instance2);
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());
		
	}

}
/*
 * ����ʽ����̬����飩
�������£�
1��������˽�л�
2���ھ�̬�������ʵ����
3�����Ⱪ¶һ����̬�Ĺ���������getInstance
4������ʵ��
 */
class Singleton{
	
	//������˽�л�
	private Singleton() {
		
	}
	
	private  static Singleton instance;
	//�ھ�̬������У�������������
	static { 
		 instance = new Singleton();
		}
	///���Ⱪ¶һ����̬�Ĺ���������getInstance
	public static Singleton getInstance() {
		return instance;
	}
	
	
}