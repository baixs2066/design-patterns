package design.adapter.objectadapter;

public class Phone {
	
	//���
	public void charging(IVoltage5V ivoltage5V) {
		if(ivoltage5V.output5V() ==5) {
			System.out.println("��ѹ5v���Գ��");
		}else if(ivoltage5V.output5V()!=5) {
			System.out.println("��ѹ�����޷����");
		}
	}

}
