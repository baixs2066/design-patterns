package design.jdk;

public class Builder {

	public static void main(String[] args) {
		//Appendable �ӿڶ����˶��append���������󷽷�������AppendableΪ�������ߣ������˳��󷽷�
		
		//AbstarctStringBuilder ʵ���� Appendable �ӿڷ���������� AbstractStringBuilder �Ѿ��ǽ����ߣ�ֻ�ǲ���ʵ����
		
		//StringBuilder ���䵱��ָ���ߣ�ͬʱ�䵱�˾���Ľ����ߣ����췽ʽ��ʵ������AbstractStringBuilder ��ɣ���StingBuilder 
		//�̳���AbstractStringBuilder
		
		StringBuilder builder = new StringBuilder("hello,world");
		System.out.println(builder);

	}

}
