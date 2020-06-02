package design.factory.simplefactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import design.factory.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizza2 {
	
	
	Pizza pizza = null;
	String orderType ="";
	public OrderPizza2() {
		do {
			orderType = getType();
			pizza = SimpleFactory.creatPizza2(orderType);
			// ‰≥ˆpizza
			if(pizza!= null) {//∂©π∫≥…π¶
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			}else {
				System.out.println("∂©π∫≈˚»¯ ß∞‹");
				continue;
			}
			
		}while(true);
		
	}
	
	
	
	
	
	
	private String getType() {
		BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input pizza ÷÷¿‡");
		String str=null;
		try {
			str = strin.readLine();
		} catch (IOException e) {
			str = "";
			
		}
		return str;
	}

}
