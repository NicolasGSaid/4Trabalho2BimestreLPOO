
package Controller;

import Model.ProdutoModel;
import java.util.ArrayList;


public class ProdutoController implements InterfaceController{
    
   private ArrayList<ProdutoModel> produtos = new ArrayList<>();
        
    public ArrayList<ProdutoModel> incluirProdutos() {
        ArrayList<ProdutoModel> produtos = new ArrayList<>();

        System.out.println("Incluindo produtos para a NF-e:");
        boolean adicionarMais = true;

        while (adicionarMais) {
            ProdutoModel produto = new ProdutoModel();

            System.out.print("Código do Produto: ");
            produto.setCodigo(scanner.nextLine());

            System.out.print("Descrição do Produto: ");
            produto.setDescricao(scanner.nextLine());

            System.out.print("Quantidade: ");
            produto.setQuantidade(Double.parseDouble(scanner.nextLine()));
            
            System.out.print("Nova unidade: ");
            produto.setUnidade(scanner.nextLine());

            System.out.print("Valor Unitário: ");
            produto.setValorUnitario(Double.parseDouble(scanner.nextLine()));

            System.out.print("Valor Total: ");
            produto.setValorTotal(Double.parseDouble(scanner.nextLine()));
            
            System.out.print("Nova base de cálculo do ICMS: ");
            produto.setBaseCalIcms(Double.valueOf(scanner.nextLine()));

            System.out.print("Novo valor do IPI: ");
            produto.setValorIpi(Double.valueOf(scanner.nextLine()));

            System.out.print("Nova alíquota do ICMS: ");
            produto.setAlicotaIcms(Double.valueOf(scanner.nextLine()));

            System.out.print("Nova alíquota do IPI: ");
            produto.setAlicotaIpi(Double.valueOf(scanner.nextLine()));

            produtos.add(produto);

            System.out.print("Deseja adicionar outro produto? (s/n): ");
            String resposta = scanner.nextLine();
            adicionarMais = resposta.equalsIgnoreCase("s");
        }

        System.out.println("Produtos adicionados com sucesso!");
        return produtos;
    }
   
    public void incluir(ProdutoModel produto) {
        
        produtos.add(produto);
        System.out.println("Cliente cadastrado com sucesso!");
    }
    
    
    public void alterar() {
        System.out.print("Informe o código do produto para alterar: ");
        String codigo = scanner.nextLine();

    for (ProdutoModel produto : produtos) {
        if (produto.getCodigo().equalsIgnoreCase(codigo)) {

            System.out.print("Nova descrição do produto: ");
            produto.setDescricao(scanner.nextLine());

            System.out.print("Nova NCSH: ");
            produto.setNcsh(scanner.nextLine());

            System.out.print("Novo CST: ");
            produto.setCst(scanner.nextLine());

            System.out.print("Novo CFOP: ");
            produto.setCfop(scanner.nextLine());

            System.out.print("Nova unidade: ");
            produto.setUnidade(scanner.nextLine());

            System.out.print("Nova quantidade: ");
            produto.setQuantidade(Double.valueOf(scanner.nextLine()));

            System.out.print("Novo valor unitário: ");
            produto.setValorUnitario(Double.valueOf(scanner.nextLine()));

            System.out.print("Novo valor total: ");
            produto.setValorTotal(Double.valueOf(scanner.nextLine()));

            System.out.print("Nova base de cálculo do ICMS: ");
            produto.setBaseCalIcms(Double.valueOf(scanner.nextLine()));

            System.out.print("Novo valor do IPI: ");
            produto.setValorIpi(Double.valueOf(scanner.nextLine()));

            System.out.print("Nova alíquota do ICMS: ");
            produto.setAlicotaIcms(Double.valueOf(scanner.nextLine()));

            System.out.print("Nova alíquota do IPI: ");
            produto.setAlicotaIpi(Double.valueOf(scanner.nextLine()));

            System.out.println("Produto alterado com sucesso!");
            return;
        }
    }

        System.out.println("Produto com código não encontrado.");
    }
    
    public void exibirProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (ProdutoModel p : produtos) {
                System.out.println("\n********************************************");
                System.out.println("PRODUTO: ");
                System.out.println(p);  // Usa o toString agora formatado
                System.out.println("********************************************\n");
            }
        }
    }
}

