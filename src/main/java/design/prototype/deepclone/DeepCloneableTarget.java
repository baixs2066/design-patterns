package design.prototype.deepclone;

import java.io.Serializable;

public class DeepCloneableTarget implements Serializable,Cloneable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String cloneName;
	
	private String cloneClass;
	
	public DeepCloneableTarget(String cloneName,String cloneClass) {
		this.cloneClass = cloneClass;
		this.cloneName = cloneName;
	}
	//��Ϊ��������Զ���String�����������ʹ��Ĭ�ϵ�clone��������
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		return "DeepCloneableTarget [cloneName=" + cloneName + ", cloneClass=" + cloneClass + "]";
	}

}
