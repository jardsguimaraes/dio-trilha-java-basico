public record WhatsApp() implements SendMenssage {

    @Override
    public void send(String message) {
        System.out.println("Enviando menssagem via WhatsApp: " + message);
    }
    
}
