package design.builder.improve;


public class HighBuilding extends HouseBuilder {

	@Override
	public void buildBasic() {
		System.out.println("��¥��ػ�50��");

	}

	@Override
	public void buildWalls() {
		System.out.println("��¥��ǽ20cm");

	}

	@Override
	public void roofed() {
		System.out.println("��¥͸����");

	}

}
