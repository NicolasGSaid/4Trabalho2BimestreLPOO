
package Controller;

import Model.ProdutoModel;
import java.util.ArrayList;


public class ProdutoController implements InterfaceController{
    
   private ArrayList<ProdutoModel> produtos = new ArrayList<>();
        
   public void IncluirProduto(){
       
        System.out.print("Digite o código do produto: ");
        String codigo = scanner.nextLine();
        ProdutoModel produto = new ProdutoModel();
        produto.setCodigo(codigo);
       
        System.out.println("Digite a descrição do produto: ");
        String descricao = scanner.nextLine();
        produto.setDescricao(descricao);
       
        System.out.println("Digite a NCSH: ");
        String ncsg = scanner.nextLine();
        produto.setNcsh(ncsg);
       
        System.out.println("Digite o CST: ");
        String cst = scanner.nextLine();
        produto.setCst(cst);
        System.out.println("Digite o CFOP: ");
        String cfop = scanner.nextLine();
        produto.setCfop(cfop);

        System.out.println("Digite a unidade: ");
        String unidade = scanner.nextLine();
        produto.setUnidade(unidade);

        System.out.println("Digite a quantidade: ");
        double quantidade = Double.parseDouble(scanner.nextLine());
        produto.setQuantidade(quantidade);

        System.out.println("Digite o valor unitário: ");
        double valorUnitario = Double.parseDouble(scanner.nextLine());
        produto.setValorUnitario(valorUnitario);

        System.out.println("Digite o valor total: ");
        double valorTotal = Double.parseDouble(scanner.nextLine());
        produto.setValorTotal(valorTotal);

        System.out.println("Digite a base de cálculo do ICMS: ");
        double baseCalIcms = Double.parseDouble(scanner.nextLine());
        produto.setBaseCalIcms(baseCalIcms);

        System.out.println("Digite o valor do IPI: ");
        double valorIpi = Double.parseDouble(scanner.nextLine());
        produto.setValorIpi(valorIpi);

        System.out.println("Digite a alíquota do ICMS: ");
        double alicotaIcms = Double.parseDouble(scanner.nextLine());
        produto.setAlicotaIcms(alicotaIcms);

        System.out.println("Digite a alíquota do IPI: ");
        double alicotaIpi = Double.parseDouble(scanner.nextLine());
        produto.setAlicotaIpi(alicotaIpi);
        
        produtos.add(produto);
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

