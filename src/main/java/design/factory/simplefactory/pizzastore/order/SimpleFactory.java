package design.factory.simplefactory.pizzastore.order;

import design.factory.simplefactory.pizzastore.pizza.CheesePizza;
import design.factory.simplefactory.pizzastore.pizza.GreekPizza;
import design.factory.simplefactory.pizzastore.pizza.Pizza;

//�򵥹�����
public class SimpleFactory {
	
	//����orderType ���ض�Ӧ��pizza ����
	public Pizza creatPizza(String orderType) {
		Pizza pizza = null;
		if(orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName("ϣ��pizza");
		}else if(orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName("����pizza");
		}
		return pizza;
	}
	
	//����orderType ���ض�Ӧ��pizza ����
	public static Pizza creatPizza2(String orderType) {
		Pizza pizza = null;
		if(orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName("ϣ��pizza");
		}else if(orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName("����pizza");
		}
		return pizza;
	}

}
