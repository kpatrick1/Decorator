package us.kpatrick;

/**
 * Main class for the Decorator pattern
 *
 * @author kpatrick
 * @version 1.00
 */

public class Main {
    /***
     * This is the main starting point of the program
     * @param args starting arguments of the program
     */
    public static void main(String[] args) {
        Character basicCharacter = new Starving(new Shield(new Spear(new Sword(new BasicCharacter("Bilbo")))));
        System.out.println("Name: " + basicCharacter.getName());
        System.out.println("Heath: " + basicCharacter.getHealth());
    }
}
