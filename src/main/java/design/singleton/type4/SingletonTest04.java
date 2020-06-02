package design.singleton.type4;



public class SingletonTest04 {

	public static void main(String[] args) {
		System.out.println("懒汉式，线程安全,同步方法");
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
	//私有化构造器
	private Singleton() {
		
	}
	//提供一个静态的公共方法，加入同步处理的代码，解决多线程不安全问题 当使用该方法时采取创建instance
	public static synchronized Singleton getInstance() {
		if(instance==null) {
			instance = new Singleton();
		}
		return instance;
	}
}
