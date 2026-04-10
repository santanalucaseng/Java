public class Cd extends Produto{
    
    //ATRIBUTOS
    private int faixas;

    //CONSTRUTORES
    public Cd(){}
    public Cd(String nome, double preco, int faixas){
        super(nome, preco);
        this.faixas = faixas;
    }

    //GETTERS E SETTERS
    public int getfaixas(){return this.faixas;}
    public void setAutor (int faixas){this.faixas = faixas;}

    public String toString(){
        return"Cd: [nome: " + getNome()
                 + "produto: " + getPreco()
                 + "faixas: " + this.faixas; 
    }
}
