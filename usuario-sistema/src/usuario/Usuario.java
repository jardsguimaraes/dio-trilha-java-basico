package src.usuario;

public abstract class Usuario {
    protected String nome;
    protected String email;
    protected String senha;
    protected boolean administrador;

    public Usuario(String nome, String email, String senha, boolean administrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public abstract void realizarLogin();
    public abstract void realizarLogoff();
    public abstract void alterarSenha();
    public abstract void alterarDados();
}
