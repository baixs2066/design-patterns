package design.principle.inversion;

public class DependencyPass {
	public static void main(String[] args) {
		
		
	}
	
}
	
	
//依赖传递的方式1，通过接口传递实现依赖	
//interface IOpenAndClose{
//	void open(ITv iv);
//	
//}
//interface ITv{
//	void play();
//}
//class OpenAndClose implements IOpenAndClose{
//
//
//	public void open(ITv iv) {
//		iv.play();
//		
//	}
//	
//}
	
	
//传递依赖的方式2，通过构造函数
//interface IOpenAndClose{
//	public void open();
//}
//interface ITv{
//	public void play();
//}  
//class OpenAndClose implements IOpenAndClose{
//	public ITv tv;
//
//	public OpenAndClose(ITv tv) {
//		super();
//		this.tv = tv;
//	}
//	public void open() {
//		this.tv.play();
//		
//	}
//}
	
	
//依赖传递的方式3，通过seter方法传递
interface IOpenAndClose{
	public void open();
	
	public void setTv(ITv tv);
}
interface ITv{
	public void play();
}
class OpenAndClose implements IOpenAndClose{

	private ITv itv;
	public void open() {
		this.itv.play();
	}

	public void setTv(ITv tv) {
		this.itv = tv;
		
	}
	
}


