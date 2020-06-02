package design.adapter.classadapter;

public class VoltageAdapter extends Voltage220V  implements IVoltage5V {

	@Override
	public int output5V() {
		int srcV = output220V();//获取到被适配电压220V
		int dstV = srcV/44;//转为5v

		return dstV;
	}

}
