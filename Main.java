package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(400, 50, "Kinetic");







        System.out.println(" Boss health " +  boss.getHealth());
        System.out.println(" Boss damage " +  boss.getDamage());
        System.out.println(" Boss defenceType " + boss.getDefenceType());


    }
}
