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
 * 饿汉式（静态常量）
步骤如下：
1）构造器私有化
2）类的内部创建对象
3）向外暴露一个静态的公共方法。getInstance
4）代码实现
 */
class Singleton{
	
	//构造器私有化
	private Singleton() {
		
	}
	//类的内部创建对象向外暴露一个静态的公共方法。getInstance
	private final static Singleton instance = new Singleton();
	//
	public static Singleton getInstance() {
		return instance;
	}
	
	
}