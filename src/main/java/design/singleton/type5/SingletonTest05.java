package design.singleton.type5;



public class SingletonTest05 {

	public static void main(String[] args) {
		System.out.println("懒汉式，线程不安全,同步代码块");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 =Singleton.getInstance();
		System.out.println(instance==instance2);
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());

	}

}

class Singleton{
	
	
	private static Singleton instance;
	//私有化构造器
	private Singleton() {
		
	}
	//提供一个静态的公共方法，加入同步代码块，也这里并不能解决线程安全问题
	public static  Singleton getInstance() {
		if(instance==null) {
			synchronized(Singleton.class) {
				instance = new Singleton();
			}
			
		}
		return instance;
	}
}
