package com.guzelya;

public class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }


    public void setWeapon(String typeOfWeapon,String nameOfWeapon){
        this.setTypeOfWeapon(typeOfWeapon);
        this.setNameOfWeapon(nameOfWeapon);
    }



}
