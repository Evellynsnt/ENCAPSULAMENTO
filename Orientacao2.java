import java.util.ArrayList;
import java.util.Scanner;




public class Orientacao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        ArrayList<Orientacao> list = new ArrayList<>();
        
        int op =0;
        while (op !=4){
            System.out.println("\n=========== MENU =============");
            System.out.println("1- CADASTRAR");
            System.out.println("2- LISTAR");
            System.out.println("3- REMOVER");
            System.out.println("4- SAIR");
            System.out.println("ESCOLHA A OPÇÃO:");
            op = sc.nextInt();

            switch(op) {
                case 1:
                System.out.println("Digite sua cor: ");
                String cor =sc.next();
                System.out.println("Digite seu tamanho:");
                String tamanho = sc.next();
                System.out.println("Digite o tipo:");
                String tipo = sc.next();
                list.add(new Orientacao(cor, tamanho, tipo));

                    break;
                case 2:
                if(list.isEmpty()){
                    System.out.println("Lista vazia");
                } else{
                    for (Orientacao c:list){
                        System.out.println("Cor: "+c.getCor()+" Tipo: "+c.getTipo()+" Tamanho: "+c.getTamanho());
                    }
                }
                 break;
                case 3:
                if(list.isEmpty()){
                    System.out.println("Lista vazia");
                } else{
                    System.out.println("Digite o índice a ser removido:");
                    int indice = sc.nextInt();

                if(indice>=0 && indice<list.size()) {
                    list.remove(indice);
                    System.out.println("Contato removido com sucesso!");
                }
            }
                case 4: 
                System.out.println("Finalizando o programa...");
                default:

                    break;
            }

        }
        sc.close();
    }
}
