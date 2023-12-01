package Arvore;
import java.util.Scanner;
public class App {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int op = 0;
        SearchTree arvore = new SearchTree();

        do{
            menu();
            op = sc.nextInt();

            switch (op) {
                case 1:
                    inserirProduto(arvore);
                    break;
                case 2:
                    exibirInformacoes(arvore);
                    break;
                case 3:
                    System.out.println("Informe o código: ");
                    int codigo = sc.nextInt();
                    System.out.println("Informe o novo preço: ");
                    double novoPreco = sc.nextDouble();
                    alterarPreco(codigo, novoPreco, arvore);
                    break;
                case 4:
                    System.out.println("Informe o código: ");
                    codigo = sc.nextInt();
                    System.out.println("Informe a nova quantidade: ");
                    int novaQtd = sc.nextInt();
                    alterarQtd(codigo, novaQtd, arvore);
                    break;
                case 5:
                    System.out.println("Informe o código: ");
                    codigo = sc.nextInt();
                    exibirInformacoesEspecificas(codigo, arvore);
                    break;
                case 0: 
                    System.out.println("Fim");
                    sc.close();
                    break;
                default:
                    System.out.println("Digite novamente");
            }
        } while (op != 0);
    }

    public static void menu() {
        System.out.println("1 - Cadastrar um produto");
        System.out.println("2 - Exibir todas as informações dos produtos");
        System.out.println("3 - Alterar preço de um produto");
        System.out.println("4 - Alterar quantidade de um produto");
        System.out.println("5 - Exibir informações de um produto");
        System.out.println("0 - Finalizar programa");
    }

    public static void inserirProduto(SearchTree arvore) {
        System.out.println("Informe o código: ");
        int codigo = sc.nextInt();
        Produto novoProduto = new Produto(codigo, "Produto", "Fornecedor", 10, 10);
        arvore.insert(novoProduto);
        System.out.println("Produto inserido com sucesso");
    }

    public static void exibirInformacoes(SearchTree arvore) {
        arvore.emOrdem();
    }

    public static Produto procurar (int codigo, SearchTree arvore) {
        return arvore.find(codigo);
    }

    public static void alterarPreco (int codigo, double novoPreco, SearchTree arvore) {
        Produto produto;
        produto = procurar(codigo, arvore);

        if (produto != null) {
            produto.setPreco(novoPreco);
            System.out.println("Novo preço colocado");
        }
        else {
            System.out.println("Produto não encontrado");
        }
        
    }

    public static void alterarQtd (int codigo, int novaQtd, SearchTree arvore) {
        Produto produto;
        produto = procurar(codigo, arvore);

        if (produto != null) {
            produto.setQtd(novaQtd);
            System.out.println("Novo quantidade colocada");
        }
        else {
            System.out.println("Produto não encontrado");
        }
    }

    public static void exibirInformacoesEspecificas(int codigo, SearchTree arvore) {
        Produto produto;
        produto = procurar(codigo, arvore);

        if (produto != null) {
            System.out.println(produto.toString());
        }
        else {
            System.out.println("Produto não encontrado");
        }
    }
}
