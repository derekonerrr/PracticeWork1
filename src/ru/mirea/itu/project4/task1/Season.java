package ru.mirea.itu.project4.task1;

public enum Season {
    WINTER(-10),
    SPRING(10),
    SUMMER(25) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(8);

    private final int avgTemperature;

    Season(int avgTemperature) {
        this.avgTemperature = avgTemperature;
    }

    public int getAvgTemperature() {
        return avgTemperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
