package Arvore;
public class Produto implements Comparable <Produto> {
    private int codigo;
    private String descricao;
    private String fornecedor;
    private int qtd;
    private double preco;

    public Produto(int codigo, String descricao, String fornecedor, int qtd, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.qtd = qtd;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int compareTo(Produto p) {
        return Integer.compare(this.codigo, p.getCodigo());
    }

    public String toString() {
        return "Codigo: " + this.codigo + " / Descrição: " + this.descricao + " / Fornecedor: " + this.fornecedor + " / Preço: " + this.preco + " / Quantidade: " + this.qtd;
    }
}
