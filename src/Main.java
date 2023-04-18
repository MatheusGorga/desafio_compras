import br.com.alura.lojaDeCompras.modelos.Carrinho;
import br.com.alura.lojaDeCompras.modelos.Produtos;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int opcaoCliente = 1;
        String menuCliente;

        Scanner leitor = new Scanner(System.in);

        Carrinho novoCarrinho = new Carrinho();
        Produtos produto1 = new Produtos();

        List<Produtos> lista = new LinkedList<>();

        menuCliente = """
                ##############################################################
                        Operações: 
                        0 - Sair
                        1 - Continuar comprando
                """;


        System.out.println("Digite o limite do cartão");
        novoCarrinho.depositar(leitor.nextDouble());
        while (opcaoCliente != 0 ){
            if (opcaoCliente == 1) {
                System.out.println("O que voce deseja comprar");
                produto1.setDescription(leitor.next());
                System.out.println("Qual valor do produto que deseja comprar");
                produto1.setValor(leitor.nextDouble());
                if (produto1.getValor() > 0) {
                    if (novoCarrinho.comprar(produto1.getValor())) {
                        System.out.println("Compra realizada, novo saldo: = " + novoCarrinho.getSaldo());
                        lista.add(produto1);
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                }
            } else {
                System.out.println("Opção invalida");
            }

            System.out.println(menuCliente);
            opcaoCliente = leitor.nextInt();
        }
        lista.sort(Comparator.comparing(Produtos::getValor));
        System.out.println("Compra finalizada");
        System.out.println(lista);

    }
}