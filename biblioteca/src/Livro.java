public class Livro extends Produto{
    //ATRIBUTOS
    private String autor;

    //CONSTRUTORES
    public Livro(){}

    public Livro(String nome, double preco, String autor){
        super(nome, preco);
        this.autor = autor;
    }
    //GETTERS E SETTERS
    public String getAutor(){return this.autor;}
    public void setAutor(String autor) {this.autor = autor;}

    public String toString(){
        return "Livro [Nome: " + getNome()
                    + "\t Preco: " + getPreco()
                    + "\t Autor: " + this.autor + "]";
    }
    
}
