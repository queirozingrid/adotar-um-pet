import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public void escolher() {
        int opcao;
        Scanner scan = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        List<Animal> animais = new ArrayList<Animal>();

        Animal doguinho = new Cachorro();
        doguinho.setNome("Bob");
        doguinho.setRaca("Salsichinha");
        doguinho.setIdade(1);
        doguinho.setId(0);

        Animal gatinho = new Gato();
        gatinho.setNome("Max");
        gatinho.setRaca("Persa");
        gatinho.setIdade(2);
        gatinho.setId(1);

        Animal caopanheiro = new Cachorro();
        caopanheiro.setNome("Bob");
        caopanheiro.setRaca("Pastor Alemão");
        caopanheiro.setIdade(7);
        caopanheiro.setId(2);

        animais.add(doguinho);
        animais.add(gatinho);
        animais.add(caopanheiro);

        System.out.println("*************** MENU ***************");
        System.out.println("Escolha a opção que gostaria de realizar");
        System.out.println("[1] Cadastro de pessoa física (é novo por aqui?)");
        System.out.println("[2] Adotar um pet");
        System.out.println("[3] Sair");

        opcao = scan.nextInt();

        if (opcao == 1) {
            Scanner scan2 = new Scanner(System.in);
            Pessoa pessoa1 = new Pessoa();

            System.out.println("Digite seu nome: ");
            String nome = scan2.nextLine();
            pessoa1.setNome(nome);

            System.out.println("Agora, seu cpf: ");
            int cpf = scan2.nextInt();
            pessoa1.setCpf(cpf);

            System.out.println("Para finalizar, quantos anos você tem?");
            int idade = scan2.nextInt();
            pessoa1.setIdade(idade);

            pessoas.add(pessoa1);

            Menu menu = new Menu();
            menu.escolher();


        } else if (opcao == 2) {
            System.out.println("Digite seu CPF");
            int cpf = scan.nextInt();
            int i = 0;
            for (i = 0; i < 10; i++) {
                if (pessoas.get(i).getCpf() == cpf) {
                    if (pessoas.get(i).getIdade() < 18) {
                        System.out.println("Você é menor de idade, pode ser adotado, adotar não");
                    } else {
                        Pessoa minhaPessoa = pessoas.get(i);
                        i = 0;
                        for (i = 0; i < 3; i++) {
                            System.out.println("ID: " + animais.get(i).getId() + " " + animais.get(i).getNome() + " " + animais.get(i).getRaca() + " " + animais.get(i).getIdade() + " anos");
                        }
                        System.out.println("Qual você gostaria de adotar? (digite o ID que aparece na frente do animal");
                        int id = scan.nextInt();
                        minhaPessoa.adotarAnimal(animais.get(id));

                    }
                }
            }
        }
    }

}
