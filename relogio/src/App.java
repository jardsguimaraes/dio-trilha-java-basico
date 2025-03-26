public class App {
    public static void main(String[] args) throws Exception {
        Clock brlClock = new BRLClock();

        brlClock.setSecond(53);
        brlClock.setMinute(53);
        brlClock.setHour(0);

        System.out.println(brlClock);
        System.out.println(new USClock().convert(brlClock));

    }
}
