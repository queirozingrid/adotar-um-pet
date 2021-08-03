import java.util.Scanner;

public class CadastroUser {
    public void novoCadastro(){
        Scanner scan = new Scanner(System.in);
        int opcao;
        System.out.println("Você é:");
        System.out.println("[1] Aluno");
        System.out.println("[2] Professor");
        System.out.println("[3] Sair");

        opcao = scan.nextInt();

        if(opcao==1){
            Aluno aluno = new Aluno();

        }
    }
}
