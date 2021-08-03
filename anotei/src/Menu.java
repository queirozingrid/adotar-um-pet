import java.util.Scanner;

public class Menu {
    public void escolher(){
        Scanner scan = new Scanner(System.in);
        int opcao;
        System.out.println("ESCOLHA A MODALIDADE");
        System.out.println("[1] Para acessar como professor");
        System.out.println("[2] Para acessar como aluno");
        System.out.println("[3] Para cancelar operação");

        opcao = scan.nextInt();

        if(opcao==1){
            Professor prof = new Professor();
            prof.escolher();

        }
    }
}
