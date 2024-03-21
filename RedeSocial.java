


public class RedeSocial {
    private ListaLigadaDuplamente pessoas;

    public RedeSocial() {
        this.pessoas = new ListaLigadaDuplamente();
    }

    public void criarPerfil(String nome, int idade, String cidade) {
        Pessoa pessoa = new Pessoa(nome, idade, cidade);
        pessoas.adiciona(pessoa);
    }

    public void adicionarAmigo(String nomeA, String nomeB) {
        Pessoa pessoaA = encontrarPessoa(nomeA);
        Pessoa pessoaB = encontrarPessoa(nomeB);

        if (pessoaA != null && pessoaB != null) {
            pessoaA.getAmigos().adiciona(pessoaB);
            pessoaB.getAmigos().adiciona(pessoaA);
        }
    }

    public void removerAmigo(String nomeA, String nomeB) {
        Pessoa pessoaA = encontrarPessoa(nomeA);
        Pessoa pessoaB = encontrarPessoa(nomeB);

        if (pessoaA != null && pessoaB != null) {
            pessoaA.getAmigos().remove(pessoaB);
            pessoaB.getAmigos().remove(pessoaA);
        }
    }

    private Pessoa encontrarPessoa(String nome) {
        for (int i = 0; i < pessoas.tamanho(); i++) {
            Pessoa pessoa = (Pessoa) pessoas.pega(i);
            if (pessoa.getNome().equals(nome)) {
                return pessoa;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < pessoas.tamanho(); i++) {
            Pessoa pessoa = (Pessoa) pessoas.pega(i);
            builder.append(pessoa.getNome()).append(" (").append(pessoa.getCidade()).append(")\n");

            ListaLigadaDuplamente amigos = pessoa.getAmigos();
            for (int j = 0; j < amigos.tamanho(); j++) {
                Pessoa amigo = (Pessoa) amigos.pega(j);
                builder.append(" - ").append(amigo.getNome()).append("\n");
            }
        }
        return builder.toString();
    }
}
