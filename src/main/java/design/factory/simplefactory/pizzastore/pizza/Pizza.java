package design.factory.simplefactory.pizzastore.pizza;
//将pizza做成抽象类
public abstract class Pizza {
	//pizza名称
	protected String name;
	//准备原材料，不同披萨材料不同，因此，我们做成抽象方法
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
