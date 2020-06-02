package design.decorator;

public class Chocolate extends Decorator{
	//具体的Decorator，这里就是调味品
	public Chocolate(Drink obj) {
		super(obj);
		setDes("巧克力");
		setPrice(3.0f);//调味品价格
		
	}

}
