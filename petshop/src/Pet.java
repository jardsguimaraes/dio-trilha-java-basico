public class Pet {
    private final String nome;
    private boolean limpo;

    public Pet(String nome) {
        this.nome = nome;
        this.limpo = false;
    }

    public String getNome() {
        return nome;
    }

    public boolean estarLimpo() {
        return limpo;
    }

    public void setLimpo(boolean limpo) {
        this.limpo = limpo;
    }
}
