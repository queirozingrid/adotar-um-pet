import java.util.Scanner;

public class Professor extends User {
    public void inserirNota(){

    }

    public void mostrarDados(){

    }
    public void escolher(){
        Scanner scan = new Scanner(System.in);
        int opcao;

        System.out.println("O que gostaria de fazer?");
        System.out.println("[1] Inserir nota de algum aluno");
        System.out.println("[2] Visualizar todos os dados");
        System.out.println("[3] Sair");

        opcao = scan.nextInt();

        if(opcao==1){
            inserirNota();
        }
        else if(opcao==2){
            mostrarDados();
        }

    }
}
