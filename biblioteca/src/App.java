public class App {
    public static void main(String[] args) throws Exception {
        Produto caneta = new Produto("Caneta", 5.9);
        System.out.println(caneta.toString());
        Livro l1 = new Livro("O senhor dos Anéis", 69.9, "J. R. R. Tolkien");
        System.out.println(l1.toString());

        Produto produtos[] = new Produto[5];
        produtos[0] = new Livro("Bíblia", 49.9, "Deus");

    }
}