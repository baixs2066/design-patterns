package design.jdk;

public class Builder {

	public static void main(String[] args) {
		//Appendable 接口定义了多个append方法（抽象方法），即Appendable为抽象建造者，定义了抽象方法
		
		//AbstarctStringBuilder 实现了 Appendable 接口方法，这里的 AbstractStringBuilder 已经是建造者，只是不能实例化
		
		//StringBuilder 即充当了指挥者，同时充当了具体的建造者，建造方式的实现是由AbstractStringBuilder 完成，而StingBuilder 
		//继承了AbstractStringBuilder
		
		StringBuilder builder = new StringBuilder("hello,world");
		System.out.println(builder);

	}

}
