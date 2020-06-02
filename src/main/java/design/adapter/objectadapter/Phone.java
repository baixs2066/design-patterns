package design.adapter.objectadapter;

public class Phone {
	
	//充电
	public void charging(IVoltage5V ivoltage5V) {
		if(ivoltage5V.output5V() ==5) {
			System.out.println("电压5v可以充电");
		}else if(ivoltage5V.output5V()!=5) {
			System.out.println("电压过高无法充电");
		}
	}

}
