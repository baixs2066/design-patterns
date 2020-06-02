package design.singleton.type7;



public class SingletonTest07 {

	public static void main(String[] args) {
		System.out.println("使用静态内部类完成单例模式");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 =Singleton.getInstance();
		System.out.println(instance==instance2);
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());

	}

}
/*
 * 外部类被装载的时候，内部类不会被装载，所以不会实例化Singleton，
 * 调用getInstance方式返回静态内部类的静态属性的时候，装载内部类类的装载是线程安全的，
 * 实例化Singleton
 */
class Singleton{
	//构造器私有化
	private Singleton() {}
	
	//写一个静态内部类，该类中有一个静态属性Singleton
	private static class SingletonInstance{
		private static final Singleton INSTANCE = new Singleton();
	}
	//提供一个公有地静态方法，返回静态内部类的静态属性
	public static Singleton getInstance() {
		return SingletonInstance.INSTANCE;
	}
	
}
