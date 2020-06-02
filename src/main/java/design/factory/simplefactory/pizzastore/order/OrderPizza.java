package design.factory.simplefactory.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import design.factory.simplefactory.pizzastore.pizza.CheesePizza;
import design.factory.simplefactory.pizzastore.pizza.GreekPizza;
import design.factory.simplefactory.pizzastore.pizza.Pizza;

public class OrderPizza {
	//������
	/*��ͳ��ʽ
	public OrderPizza() {
		Pizza pizza = null;
		
		String orderType; //����������������
		do {
			orderType = getType();
			if(orderType.equals("greek")) {
				pizza = new GreekPizza();
				pizza.setName("ϣ��pizza");
			}else if(orderType.equals("cheese")) {
				pizza = new CheesePizza();
				pizza.setName("����pizza");
			}else {
				break;
			}
			//���pizza����������
			pizza.prepare();
			pizza.bake();
			pizza.cut();
			pizza.box();
		}while(true);
	}
	*/
	//����һ���򵥹�������
	SimpleFactory simplefactory = null;
	Pizza pizza = null;
	
	//������
	public OrderPizza(SimpleFactory simpleFactory) {
		setFactory(simpleFactory);
	}
	
	public void setFactory(SimpleFactory simpleFactory) {
		this.simplefactory=simpleFactory;
		String orderType = "";//�û������
		do {
			orderType = getType();
			pizza = this.simplefactory.creatPizza(orderType);
			//���pizza
			if(pizza!= null) {//�����ɹ�
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			}else {
				System.out.println("��������ʧ��");
				continue;
			}
			
		}while(true);
	}
	
	private String getType() {
		BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input pizza ����");
		String str=null;
		try {
			str = strin.readLine();
		} catch (IOException e) {
			str = "";
			
		}
		return str;
	}

}
