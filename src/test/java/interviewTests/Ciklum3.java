package interviewTests;

import java.util.Scanner;

public class Ciklum3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); for (int i = 0; i < 3; i++) {
			String name = sc.nextLine();
			Parrot p= new Parrot();
			if(name.equals("eat")) {
				p.eat();
			}
			if(name.equals("makeSound")) {
				p.makeSound();
			}
			if(name.equals("fly")) {
				p.fly();
			}

		}
	}
}

interface Animal {

	public void eat();

	public void makeSound();
}

interface Bird {

	static int legs = 2;

	public void fly();
}

class Parrot implements Animal, Bird {

	@Override
	public void fly() {

		System.out.println("Parrots can fly up to 50 miles in a day");
	}

	@Override
	public void eat() {
		System.out.println("Parrots can eat up to 100 gms in a day");

	}

	@Override
	public void makeSound() {
		System.out.println("Parrots make sound of scrrech");

	}
}

