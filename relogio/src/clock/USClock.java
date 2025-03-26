
public non-sealed class USClock extends Clock {

    private String periodIndicator;

    public String getPeriodIndicator() {
        return periodIndicator;
    }

    public void setAfterMidday() {
        this.periodIndicator = "PM";
    }

    public void setBeforeMidday() {
        this.periodIndicator = "AM";
    }

    public void setHour(int hour) {
        setBeforeMidday();
        if (hour > 12 && hour <= 23) {
            this.hour = hour - 12;
            setAfterMidday();
        } else if (hour == 12) {
            this.hour = hour;
            setAfterMidday();
        } else if (hour > 24) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    @Override
    public Clock convert(Clock clock) {
        this.minute = clock.minute;
        this.second = clock.second;

        switch (clock) {
            case USClock usClock -> {
                this.hour = usClock.getHour();
                this.periodIndicator = usClock.getPeriodIndicator();
            }
            case BRLClock brlClock -> this.setHour(brlClock.getHour());
        }
        return this;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d %s", hour, minute, second, periodIndicator);
    }
}
