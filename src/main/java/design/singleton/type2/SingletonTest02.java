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
 * 饿汉式（静态代码块）
步骤如下：
1）构造器私有化
2）在静态代码块中实例化
3）向外暴露一个静态的公共方法。getInstance
4）代码实现
 */
class Singleton{
	
	//构造器私有化
	private Singleton() {
		
	}
	
	private  static Singleton instance;
	//在静态代码块中，创建单例对象
	static { 
		 instance = new Singleton();
		}
	///向外暴露一个静态的公共方法。getInstance
	public static Singleton getInstance() {
		return instance;
	}
	
	
}