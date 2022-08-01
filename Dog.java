abstract class Animal2{
	public abstract void sound();
}
public  class Dog1 extends Animal2{
	public  void sound1(){
	System.out.println("woof is sound of dog");
	
}


public static void main (String[] args) {
	Animal2 obj1=new Dog1();
	obj1.sound1();
}
}

