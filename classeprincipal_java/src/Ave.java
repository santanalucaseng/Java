public class Ave extends Animal{
    
    public Ave(String nome, int patas, double velocidade, int localizacao){
        super(nome, patas, velocidade, localizacao);
        
    }
    
    public void mover(){
        setLocalizacao(getLocalizacao() + 3);
        System.out.println("Ave "+ getNome() + " movendo-se ^^ v ^^ -->");
    }
}
