package Arvore;
public class SearchTree {
    private TreeNode raiz;

    public boolean isEmpty() {
        return this.raiz == null;
    }

    public void insert (Produto p) { 
        if (this.isEmpty()) {
            raiz = new TreeNode (p);
        }
        else {
            raiz.insertNode (p);
        }
    }
    
    public Produto find (int codigo) {
        if (this.isEmpty()) {
            return null;
        }
        else {
            return raiz.findNode (codigo);
        }
    }

    public void emOrdem () {
        if (this.isEmpty()) {
            System.out.println("Árvore vazia");
        } 
        else {
            this.percorrerEmOrdem (raiz);
        }
    }

    private void percorrerEmOrdem (TreeNode r) {
        if (r != null) {
            percorrerEmOrdem (r.getLeft());
            System.out.println(r.getInfo().toString());
            percorrerEmOrdem (r.getRight());
        }
    }
}
