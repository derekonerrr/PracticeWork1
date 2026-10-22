
package ru.mirea.itu.project4;

public enum Level {
    HIGH(1,"sisadmin"),
    MEDIUM(2, "razrab"),
    LOW(3,"helpdesc");
    private final int inc_level;
    private final String name;

    Level(int inc_level, String name) {
        this.inc_level = inc_level;
        this.name = name;
    }

    public int getInc_level() {
        return inc_level;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Level{" +
                "inc_level=" + inc_level +
                ", name='" + name + '\'' +
                '}';
    }
}
