package design.factory.simplefactory.pizzastore.order;

import design.factory.simplefactory.pizzastore.pizza.CheesePizza;
import design.factory.simplefactory.pizzastore.pizza.GreekPizza;
import design.factory.simplefactory.pizzastore.pizza.Pizza;

//简单工厂类
public class SimpleFactory {
	
	//根据orderType 返回对应的pizza 对象
	public Pizza creatPizza(String orderType) {
		Pizza pizza = null;
		if(orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName("希腊pizza");
		}else if(orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName("奶酪pizza");
		}
		return pizza;
	}
	
	//根据orderType 返回对应的pizza 对象
	public static Pizza creatPizza2(String orderType) {
		Pizza pizza = null;
		if(orderType.equals("greek")) {
			pizza = new GreekPizza();
			pizza.setName("希腊pizza");
		}else if(orderType.equals("cheese")) {
			pizza = new CheesePizza();
			pizza.setName("奶酪pizza");
		}
		return pizza;
	}

}
