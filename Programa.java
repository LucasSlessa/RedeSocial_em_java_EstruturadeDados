
public class Programa {
    public static void main(String[] args) {
        RedeSocial redeSocial = new RedeSocial();

        // Criar perfis
        redeSocial.criarPerfil("João", 25, "São Paulo");
        redeSocial.criarPerfil("Maria", 24, "Rio de Janeiro");
        redeSocial.criarPerfil("Flavia", 23, "São Paulo");

        // Adicionar amigos
        redeSocial.adicionarAmigo("Maria", "Flavia");
        redeSocial.adicionarAmigo("João", "Maria");

        // Imprimir a rede social
        System.out.println("Rede Social:");
        System.out.println(redeSocial);

        // Remover amigo
        redeSocial.removerAmigo("Maria", "Flavia");

        // Imprimir a rede social após remover amigo
        System.out.println("\nRede Social após remover amigo:");
        System.out.println(redeSocial);
    }
}