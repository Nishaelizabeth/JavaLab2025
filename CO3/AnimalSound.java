class Animal{
	void makeSound(){
		System.out.println("Animal Sounds");
		System.out.println("-------------");
	}	
}


class Dog extends Animal{
	void makeSound(){
		System.out.println("Dog sound: Woof");
	}	
}

class Cat extends Animal{
	void makeSound(){
		System.out.println("Cat sound: Meow");
	}

}

class Cow extends Animal{
	void makeSound(){
		System.out.println("Cow sound: Moo");
	}

}

public class AnimalSound{
	public static void main(String[] args){
	Animal animal = new Animal();
	Dog dog = new Dog();
	Cat cat = new Cat();
	Cow cow = new Cow();
	
	animal.makeSound();
	dog.makeSound();
	cat.makeSound();
	cow.makeSound();

	}
}