
public class MainApp {

	public static void main(String[] args) {
		Cat cat = new Cat(false, "Mướp");
		Dog dog = new Dog(true, "Cỏ");
		System.out.println(cat.toString());
		cat.sound();
		System.out.println(dog.toString());
		dog.sound();
		
		IAnimal cat1 = new Cat(false, "Mướp");
		IAnimal dog1 = new Dog(true, "Cỏ");
		System.out.print(cat1.toString());
		System.out.print(dog1.toString());
	}

}
