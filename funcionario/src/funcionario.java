public class funcionario{
    
    //ATRIBUTOS
    String nome;
    String departamento;
    String dataEntrada;
    String rg;
    double salario;
    boolean ativo;

    //CONSTRUTOR
    public funcionario(String nome, String departamento, String dataEntrada, String rg, double salario){
        this.nome = nome;
        this.departamento = departamento;
        this.dataEntrada = dataEntrada;
        this.rg = rg;
        this.salario = salario;
        this.ativo = true; //COMEÇA COMO ATIVO
    }

    //MÉTODO PARA BONIFICAR O SALÁRIO
   public void bonifica (double salario){
    this.salario += valor;
   }

    //MÉTODO QUE DEMITE FUNCIONÁRIO
    public void demite(){
        this.ativo = false;
    }

    //MÉTODO PARA EXIBIR DADOS
    public void mostraDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Departamento:" + departamento);
        System.out.println("Data de Entrada: " + dataEntrada);
        System.out.println("RG: " + rg);
        System.out.println("Salario: " + salario);
        System.out.println("Ativo: " + ativo);
    }

}
