import java.util.ArrayList;
import java.util.Scanner;

public class ManipularCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        ArrayList<ManipularCarro> list = new ArrayList<>();
        
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
                System.out.print("Digite a marca que deseja: ");
                String marca =sc.next();
                System.out.print("Digite o modelo: ");
                String modelo = sc.next();
                System.out.print("Digite o ano de fabricação: ");
                String fabricação = sc.next();
                list.add(new ManipularCarro(marca, modelo, fabricação));
                    break;
                case 2:
                 if(list.isEmpty()){
                   
                    System.out.println("Lista vazia");
                    break;
                } else{
                    for (Orientacao c:list){
                        contador = 0; 
                        System.out.println((contado+1)"Modelo: "+c.getModelo()+" Marca: "+c.getMarca()+
                        " Ano de Fabricação: "+c.getaAno());
                        contador++;
                    }
                }
                 break;
                case 3:
                if(list.isEmpty()){
                    System.out.println("Lista vazia");
                    break;
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
