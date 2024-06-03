package lesson04.quiz01;

public class AnimalTest {

	public static void main(String[] args) {
		Animal[] animals = new Animal[2];
		animals[0] = new Cat(); // up casting
		animals[1] = new Dog(); // up casting
		
		for (int i = 0; i < animals.length; i++) { // 0 1
			for (int j = 0; j < 3; j++) { // 0 1
			animals[i].cry();
			}
		}
		
		for (int i = 0; i < animals.length; i++) { // 0 1
			//animals[i]
			if (animals[i] instanceof Cat) {
				Cat cat = (Cat) animals[i]; // down casting
				cat.grooming();
			} else if (animals[i] instanceof Dog) {
				Dog dog = (Dog) animals[i];
				dog.lash();
			}
		}
	}
}
