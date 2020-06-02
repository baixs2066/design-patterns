package design.singleton.type6;



public class SingletonTest06 {

	public static void main(String[] args) {
		System.out.println("双重检查，线程安全");
		Singleton instance = Singleton.getInstance();
		Singleton instance2 =Singleton.getInstance();
		System.out.println(instance==instance2);
		System.out.println(instance.hashCode());
		System.out.println(instance2.hashCode());

	}

}

class Singleton{
	
	//volatile可以是修改后的值立即更新到内存，对其他线程可见，可以理解为轻量的synchronize
	private static volatile Singleton instance;
	//私有化构造器
	private Singleton() {}
	//提供一个静态的公共方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题
	//同时保证了效率
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
