class Animal{}
class Dog extends Animal{
	static void method(Animal a){
		if(a instanceof Dog){
			Dog d = (Dog) a;    //downcasting 
			System.out.println("Ok downcating performed");
		}
	}
	public static void main(String[] args){
		Animal a = new Dog();
		Dog.method(a);
	}
}

	