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

    }
}
