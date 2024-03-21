
class Pessoa {
    private String nome;
    private int idade;
    private String cidade;
    private ListaLigadaDuplamente amigos;

    public Pessoa(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
        this.amigos = new ListaLigadaDuplamente();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public ListaLigadaDuplamente getAmigos() {
        return amigos;
    }

    @Override
    public String toString() {
        return nome + " (" + idade + " anos, " + cidade + ")";
    }
}