public record Sms() implements SendMenssage {

    @Override
    public void send(String message) {
        System.out.println("Enviando SMS: " + message);
    }
}
