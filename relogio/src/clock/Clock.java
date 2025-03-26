public sealed abstract class Clock permits BRLClock, USClock {
    protected int hour;
    protected int minute;
    protected int second;

    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("A Hora deve estar entre 0-23");
        }
        this.hour = hour;
    }
    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("O(s) Minutos deve estar entre 0-59");
        }
        this.minute = minute;
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        if (second < 0 || second >= 60) {
            throw new IllegalArgumentException("O(s) Segundos deve estar entre 0-59");
        }
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    abstract Clock convert(Clock clock);
}
