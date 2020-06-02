package design.adapter.classadapter;

public class VoltageAdapter extends Voltage220V  implements IVoltage5V {

	@Override
	public int output5V() {
		int srcV = output220V();//��ȡ���������ѹ220V
		int dstV = srcV/44;//תΪ5v

		return dstV;
	}

}
