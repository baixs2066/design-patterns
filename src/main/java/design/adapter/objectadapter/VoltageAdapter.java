package design.adapter.objectadapter;

public class VoltageAdapter    implements IVoltage5V {
	//关联关系 中的 聚合关系    - 持有被适配者
	private Voltage220V voltage220v;
	//通过构造器传入一个Voltage220V的实例
	VoltageAdapter(Voltage220V voltage220v){
		this.voltage220v = voltage220v;
	}

	@Override
	public int output5V() {
		int dst = 0;
		if(this.voltage220v!=null) {
			//获取到220v
			int src = this.voltage220v.output220V();
			System.out.println("使用对象适配器，进行适配");
			//转为5v
			dst = src/44;
			System.out.println("适配完成");
		}
		
		
		
		return dst;
	}
	
	
}
