package design.prototype.deepclone;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
		DeepProtoType p = new DeepProtoType();
		p.name="�ν�";
		p.deepCloneableTarget = new DeepCloneableTarget("��ţ", "��ţ����");
		
		//��ʽ1
		DeepProtoType p2 = (DeepProtoType) p.clone();
		System.out.println(p.name+","+p.deepCloneableTarget+","+p.deepCloneableTarget.hashCode());
		System.out.println(p2.name+","+p2.deepCloneableTarget+","+p2.deepCloneableTarget.hashCode());
		
		DeepProtoType p3 = new DeepProtoType();
		p3.name="����";
		p3.deepCloneableTarget = new DeepCloneableTarget("����", "�������");
		DeepProtoType p4 = (DeepProtoType) p3.deepClone();
		System.out.println(p3.name+","+p3.deepCloneableTarget+","+p3.deepCloneableTarget.hashCode());
		System.out.println(p4.name+","+p4.deepCloneableTarget+","+p4.deepCloneableTarget.hashCode());

	}

}
