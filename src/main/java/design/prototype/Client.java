package design.prototype;

public class Client {
	
	public static void main(String[] args) {
		//��ͳ�ķ���
		Sheep sheep = new Sheep("tom",1,"��ɫ");
		Sheep sheep2 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
		Sheep sheep3 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
		Sheep sheep4 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
		//...
		Sheep sheep10 = new Sheep(sheep.getName(),sheep.getAge(),sheep.getColor());
		
	}

}
