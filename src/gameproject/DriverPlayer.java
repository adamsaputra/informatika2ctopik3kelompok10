package gameproject;

import java.util.ArrayList;

public class DriverPlayer {
     public static void main(String[] args) {
        ArrayList<Player> programming = new ArrayList<>();
        programming.add(new Player("Adam",3,4));
        programming.add(new Player("Sirril",4,9));
//Metode 1
        for(Player b:programming){
        System.out.println(b.getNama());
        System.out.println(b.getGold());
        System.out.println(b.getGem());
        }
}
}