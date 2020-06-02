package design.singleton.type3;



public class SingletonTest03 {

	public static void main(String[] args) {
		System.out.println("懒汉式，线程不安全");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 =Singleton.getInstance();
		System.out.println(instance==instance2);
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());

	}

}
/*
 * 懒汉式线程不安全
 */
class Singleton{
	
	
	private static Singleton instance;
	//私有化构造器
	private Singleton() {
		
	}
	//提供一个静态的公共方法，当使用该方法时采取创建instance
	public static Singleton getInstance() {
		if(instance==null) {
			instance = new Singleton();
		}
		return instance;
	}
}
