package design.prototype.deepclone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class DeepProtoType  implements Serializable,Cloneable{
	
	public String name;//String ����
	public DeepCloneableTarget deepCloneableTarget;//��������
	
	public DeepProtoType() {
		super();
	}
	
	
	//��� - ��ʽ1 ʹ��clone����
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Object deep = null;
		//������ɶԻ����������͵����ԵĿ�¡
		deep = super.clone();
		//���������͵����Ե�������
		DeepProtoType deepProtoType = (DeepProtoType) deep;
		deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
		
		return deepProtoType;
	}
	//��� - ��ʽ2 ͨ����������л�ʵ�֣��Ƽ�ʹ�ã�
	
	public Object deepClone() {
		//����������
		ByteArrayOutputStream bos = null;
		ObjectOutputStream oos = null;
		ByteArrayInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			//���л�
			bos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(bos);
			oos.writeObject(this);//��ǰ��������Զ������ķ�ʽ���
			
			//�����л�
			bis = new ByteArrayInputStream(bos.toByteArray());
			ois = new ObjectInputStream(bis);
			DeepProtoType copyObj =  (DeepProtoType) ois.readObject();
			return copyObj;
			
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			try {
				bos.close();
				oos.close();
				bis.close();
				ois.close();
			}catch(Exception e2) {
				System.out.println(e2.getMessage());
			}
		}
		
	}
	
	

}
