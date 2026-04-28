import java.util.Scanner;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n------ POLIMORFISMO com Animais ----- \n");
        ArrayList<Animal> animaisList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
            String menu =   "1- Cadastrar animais \n"+
                            "2- Listar animais \n"+
                            "3- Mover animal \n"+
                            "4- Editar animal \n"+
                            "0- Sair";
        
        int tipoAnimal = sc.nextInt();
        int option = 0;
        do{
            System.out.println(menu);
            option = sc.nextInt();
            switch (option){
                case 1:
                    System.out.println("Cadastro de animais: ");
                    System.out.println("Escolha qual animal deseja cadastrar \n" +
                    "1- Animal genérico \n"+
                    "2- Peixe \n"+
                    "3- Ave \n");

            int tipoAnimal = sc.nextInt();
            System.out.println("Digite o nome do animal: ");
            String nome = sc.nextLine();
            System.out.println("Digite a quantidade de patas: ");
            int patas = sc.nextInt();
            System.out.println("Digite a velocidade do animal: ");
            double velocidade = sc.nextdouble();
            System.out.println("Digite um valor inteiro de localização: ");
            int localizacao = sc.nextInt();
            //Especificadores
            switch (tipoAnimal) {
                
                case 1:
                    Animal a = new Animal(nome, patas, velocidade, localizacao);
                    animaisList.add(a);
                    break;   
                case 2:
                System.out.println("Digite em qual tipo de água este peixe vive\n"+
                                     "0 - água doce \n1 - água salgada");
                int agua = sc.nextInt();
                Peixe p= new Peixe(nome, patas, velocidade, localizacao, agua);
                animaisList.add(p);
                break; 
            case 3:
                Ave ave = new Ave(nome, patas, velocidade, localizacao);
                animaisList.add(ave);
                break;
                } 
                System.out.println("Temos: "+ animaisList.size() + "animais cadastrados");   

            }

        }
        
    }
 Scanner = scanner(System.out);
}
