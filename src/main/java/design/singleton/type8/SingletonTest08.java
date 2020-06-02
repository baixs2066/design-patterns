package design.singleton.type8;



public class SingletonTest08 {

	public static void main(String[] args) {
		System.out.println("使用枚举类完成单例模式");
		Singleton instance1 = Singleton.INSTANCE;
		Singleton instance2 = Singleton.INSTANCE;
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		instance1.sayOk();
	}

}
/*

 */
enum Singleton{
	INSTANCE;//属性
	public void sayOk() {
		System.out.println("ok");
	}
	
}
