package design.adapter.objectadapter;

public class VoltageAdapter    implements IVoltage5V {
	//������ϵ �е� �ۺϹ�ϵ    - ���б�������
	private Voltage220V voltage220v;
	//ͨ������������һ��Voltage220V��ʵ��
	VoltageAdapter(Voltage220V voltage220v){
		this.voltage220v = voltage220v;
	}

	@Override
	public int output5V() {
		int dst = 0;
		if(this.voltage220v!=null) {
			//��ȡ��220v
			int src = this.voltage220v.output220V();
			System.out.println("ʹ�ö�������������������");
			//תΪ5v
			dst = src/44;
			System.out.println("�������");
		}
		
		
		
		return dst;
	}
	
	
}
