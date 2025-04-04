public record Email() implements SendMenssage {

    @Override
    public void send(String message) {
        System.out.println("Enviando Email: " + message);
    }
}
