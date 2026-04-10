public class Dvd extends Produto{

    //ATRIBUTOS
    private int duracao;

    //CONSTRUTORES
    public Dvd(){}

    public Dvd(String nome, double preco, int duracao){
        super(nome, preco);
        this.duracao = duracao;
    }

    //GETTERS E SETTERS
    public int getduracao(){return this.duracao;}
    public void setduracao(int duracao){this.duracao = duracao;}

    public String toString(){
        return "Dvd:[nome: " + getNome()
                    +"\t preco: " + getPreco()
                    +"\t duração: " + this.duracao + "]";
    }
}
