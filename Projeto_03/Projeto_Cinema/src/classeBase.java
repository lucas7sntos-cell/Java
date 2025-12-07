
    public abstract class classeBase {
    protected String nome;
    protected String email;
    protected String senha;
    protected boolean administrador;

    public classeBase(String nome, String email, String senha, boolean administrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;
    }

    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public boolean isAdministrador() { return administrador; }

    public void setNome(String nome) { this.nome = nome; }
    public void setEmail(String email) { this.email = email; }

    public void realizarLogin() {
        System.out.println(nome + " realizou login.");
    }

    public void realizarLogoff() {
        System.out.println(nome + " realizou logoff.");
    }

    public void alterarDados(String novoNome, String novoEmail) {
        setNome(novoNome);
        setEmail(novoEmail);
        System.out.println("Dados alterados com sucesso!");
    }

    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("Senha alterada com sucesso!");
    }
}

