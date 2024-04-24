package jumper;

import coordinates.Coordinates;

public class Jumper {
    Coordinates start, end;
    String name;

    public Jumper(Coordinates start, Coordinates end) {
        this.start = start;
        this.end = end;

        if (start.getRow() > end.getRow())
            this.name = "ladder";
        else
            this.name = "snake";
    }

    public String getJumperName() {
        return this.name;
    }
}
