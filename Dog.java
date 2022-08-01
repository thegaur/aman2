abstract class Animal{
	public abstract void sound();
}
public  class Dog extends Animal{
	public  void sound(){
	System.out.println("woof is sound of dog");
	
}


public static void main (String[] args) {
	Animal obj1=new Dog();
	obj1.sound();
}
}

