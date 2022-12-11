package Task1;

public enum Months {
    JANUARY(Seasons.WINTER, 31), FEBRUARY(Seasons.WINTER, 28),
    MARCH(Seasons.SPRING, 31), APRIL(Seasons.SPRING, 30),
    MAY(Seasons.SPRING, 31), JUNE(Seasons.SUMMER, 30),
    JULY(Seasons.SUMMER, 31), AUGUST(Seasons.SUMMER, 30),
    SEPTEMBER(Seasons.AUTUMN, 31), OCTOBER(Seasons.AUTUMN, 30),
    NOVEMBER(Seasons.AUTUMN, 31), DECEMBER(Seasons.WINTER, 30);

    int days;
    Seasons seasons;
    Months months;

    Months(Seasons Seasons, int days) {
        this.seasons = Seasons;
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public Seasons getSeasons() {
        return seasons;
    }

    public Months getMonths() {
        return months;
    }
}
