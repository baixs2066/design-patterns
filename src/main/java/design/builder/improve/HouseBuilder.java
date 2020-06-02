package design.builder.improve;


//����Ľ�����
public abstract class HouseBuilder {
	
	protected House house = new House();
	
	//�����������д�ã����󷽷�
	public abstract void buildBasic();
	public abstract void buildWalls();
	public abstract void roofed();
	
	//���췿�Ӻã�����Ʒ�����ӣ�����
	public House buildHouse() {
		
		return house;
	}

}
