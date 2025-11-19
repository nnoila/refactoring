package theater;

/**
 * Represents a play in the theatre invoicing system.
 *
 * @null This class does not allow null values for name or type.
 */

public class Play {

    private final String name;
    private final String type;

    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
