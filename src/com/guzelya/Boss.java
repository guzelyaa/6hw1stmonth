package com.guzelya;

public class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setWeapon(String typeOfWeapon, String nameOfWeapon){
        this.setTypeOfWeapon(typeOfWeapon);
        this.setNameOfWeapon(nameOfWeapon);
    }

    public String printInfo(){
        return "Damage: " + this.getDamage() + ", Health: " + this.getHealth() + ", Type of Weapon: " + this.getTypeOfWeapon() + ", Name of Weapon: " + this.getNameOfWeapon();
    }


}
