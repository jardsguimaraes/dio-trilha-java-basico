public non-sealed class BRLClock extends Clock {

    @Override
    public Clock convert(final Clock clock) {
        this.minute = clock.minute;
        this.second = clock.second;

        switch (clock) {
            case USClock usClock -> this.hour = (usClock.getPeriodIndicator().equals("PM")) ?
                        usClock.getHour() + 12 :
                        usClock.getHour();
            case BRLClock brlClock -> this.hour = brlClock.getHour();
        }
        return this;
    }
}