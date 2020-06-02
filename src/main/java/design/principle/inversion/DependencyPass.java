package design.principle.inversion;

public class DependencyPass {
	public static void main(String[] args) {
		
		
	}
	
}
	
	
//�������ݵķ�ʽ1��ͨ���ӿڴ���ʵ������	
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
	
	
//���������ķ�ʽ2��ͨ�����캯��
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
	
	
//�������ݵķ�ʽ3��ͨ��seter��������
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


