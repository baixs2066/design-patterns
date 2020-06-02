package design.factory.factorymethod.pizzastore.pizza;
//��pizza���ɳ�����
public abstract class Pizza {
	//pizza����
	protected String name;
	//׼��ԭ���ϣ���ͬ�������ϲ�ͬ����ˣ��������ɳ��󷽷�
	public abstract  void prepare();
	public void bake() {
		System.out.println(name+"baking");
	}
	public void cut() {
		System.out.println(name+"cutting");
	}
	public void box() {
		System.out.println(name+"boxing");
	}
	public void setName(String name) {
		this.name=name;
	}

}
