package us.kpatrick;
/**
 * Basic Character implements a Character
 *
 * @author kpatrick
 * @version 1.00
 */
public class BasicCharacter implements Character {
    String name;
    double health;

    /**
     * Class Constructor - Does some stuff
     * @param name
     */
    public BasicCharacter(String name) {
        this.name = name;
        this.health = 0;
    }

    /**
     * gets the name of the character
     * @return name of character as string
     */
    public String getName() {
        return name;
    }

    /**
     * gets the health of the character
     * @return health of the character as double
     */
    public double getHealth() {
        return health;
    }
}
