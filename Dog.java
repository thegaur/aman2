abstract class Animal2{
	public abstract void sound();
}
public  class Dog extends Animal2{
	public  void sound(){
	System.out.println("woof is sound of dog");
	
}


public static void main (String[] args) {
	Animal2 obj1=new Dog();
	obj1.sound();
}
}

