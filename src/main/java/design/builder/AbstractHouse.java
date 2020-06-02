package design.builder;

public abstract class AbstractHouse {
	//´òµØ»ù
	public abstract void buildBasic();
	//ÆöÇ½
	public abstract void buildWalls();
	//·â¶¥
	public abstract void roofed();
	
	public void buid() {
		buildBasic();
		buildWalls();
		roofed();
	}
}
