package design.decorator;

public class Chocolate extends Decorator{
	//�����Decorator��������ǵ�ζƷ
	public Chocolate(Drink obj) {
		super(obj);
		setDes("�ɿ���");
		setPrice(3.0f);//��ζƷ�۸�
		
	}

}
