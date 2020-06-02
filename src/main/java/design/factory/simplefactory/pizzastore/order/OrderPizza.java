package design.factory.simplefactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import design.factory.simplefactory.pizzastore.pizza.CheesePizza;
import design.factory.simplefactory.pizzastore.pizza.GreekPizza;
import design.factory.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizza {
	//构造器
	/*传统方式
	public OrderPizza() {
		Pizza pizza = null;
		
		String orderType; //订购的披萨的类型
		do {
			orderType = getType();
			if(orderType.equals("greek")) {
				pizza = new GreekPizza();
				pizza.setName("希腊pizza");
			}else if(orderType.equals("cheese")) {
				pizza = new CheesePizza();
				pizza.setName("奶酪pizza");
			}else {
				break;
			}
			//输出pizza的制作过程
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		}while(true);
	}
	*/
	//定义一个简单工厂对象
	SimpleFactory simplefactory = null;
	Pizza pizza = null;
	
	//构造器
	public OrderPizza(SimpleFactory simpleFactory) {
		setFactory(simpleFactory);
	}
	
	public void setFactory(SimpleFactory simpleFactory) {
		this.simplefactory=simpleFactory;
		String orderType = "";//用户输入的
		do {
			orderType = getType();
			pizza = this.simplefactory.creatPizza(orderType);
			//输出pizza
			if(pizza!= null) {//订购成功
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			}else {
				System.out.println("订购披萨失败");
				continue;
			}
			
		}while(true);
	}
	
	private String getType() {
		BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input pizza 种类");
		String str=null;
		try {
			str = strin.readLine();
		} catch (IOException e) {
			str = "";
			
		}
		return str;
	}

}
