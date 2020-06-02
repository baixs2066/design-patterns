package design.prototype.improve;



public class Client {
	public static void main(String[] args) {
		Sheep sheep = new Sheep("tom",1,"°×É«");
		sheep.friend = new Sheep("jack",2,"ºÚÉ«");
		
		Sheep sheep2 = (Sheep) sheep.clone();
		Sheep sheep3 = (Sheep) sheep.clone();
		Sheep sheep4 = (Sheep) sheep.clone();
		
		System.out.println("sheep2"+sheep2+"sheep2.friend"+sheep2.friend.hashCode());
		System.out.println("sheep3"+sheep3+"sheep3.friend"+sheep3.friend.hashCode());
		System.out.println("sheep4"+sheep4+"sheep4.friend"+sheep4.friend.hashCode());
	}

}
