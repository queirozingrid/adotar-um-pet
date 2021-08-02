import java.util.Scanner;

public class Pessoa {
    Scanner scan = new Scanner(System.in);

    private String nome;
    private int idade;
    private int cpf;

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;

    }

    public String getNome(){
        return nome;
    }
    public void mudarNome(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual o nome que você gostaria de colocar?");
        this.nome = scan.nextLine();
        System.out.println("O nome foi alterado para: " + this.nome);
    }

    public void setPetName(Animal pet){
        pet.setNome(scan.nextLine());
    }
    public void adotarAnimal(Animal pet){
        int opcao = 0;

        if(pet.nome == null){
            System.out.println("Este pet não tem nome, qual nome gostaria de dar?");
            setPetName(pet);

        }
        else{
            System.out.println("O nome deste pet é: " + pet.nome + " gostaria de alterar?\nDigite 1 para sim ou 2 para não");
            opcao = scan.nextInt();
            if(opcao == 1) {
                setPetName(pet);
            }
        }
        System.out.println("Parabéns! " + pet.getNome() + " agora terá um novo lar!");
    }

}
