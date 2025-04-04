public record RedesSociais() implements SendMenssage {

    @Override
    public void send(String message) {
        System.out.println("Enviando menssagem via Redes Sociais: " + message);
    }
}
