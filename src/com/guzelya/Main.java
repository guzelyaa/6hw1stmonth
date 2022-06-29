package com.guzelya;

public class Main {

    public static void main(String[] args) {
	Boss boss = new Boss();

	boss.setDamage(50);
	System.out.println(boss.getDamage());

	boss.setHealth(700);
	System.out.println(boss.getHealth());

	boss.setTypeOfWeapon("magical");
	System.out.println(boss.getTypeOfWeapon());

	boss.setNameOfWeapon("Knife");
	System.out.println(boss.getNameOfWeapon());

	System.out.println(boss.printInfo());

	System.out.println();

		Skeleton skelet1 = new Skeleton();

		skelet1.setDamage(23);
		System.out.println(skelet1.getDamage());

		skelet1.setHealth(230);
		System.out.println(skelet1.getHealth());

		skelet1.setTypeOfWeapon("physical");
		System.out.println(skelet1.getTypeOfWeapon());

		skelet1.setNameOfWeapon("arrow");
		System.out.println(skelet1.getNameOfWeapon());

		skelet1.setNumberOfArrows(50);
		System.out.println(skelet1.getNumberOfArrows());

		System.out.println(skelet1.printInfo());

		System.out.println();


		Skeleton skelet2 = new Skeleton();

		skelet2.setDamage(27);
		System.out.println(skelet2.getDamage());

		skelet2.setHealth(270);
		System.out.println(skelet2.getHealth());

		skelet2.setTypeOfWeapon("kinetic");
		System.out.println(skelet2.getTypeOfWeapon());

		skelet2.setNameOfWeapon("arrow");
		System.out.println(skelet2.getNameOfWeapon());

		skelet2.setNumberOfArrows(40);
		System.out.println(skelet2.getNumberOfArrows());

		System.out.println(skelet2.printInfo());

		System.out.println();
    }
}
