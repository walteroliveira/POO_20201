package empresas;

public class Pedido {
    public boolean entregue = false;
    public boolean cancelado = false;
    int[] produtos = new int[5];
    int qtd=0;

    public boolean adicionarProduto(int codProduto){
        if(!produtoDuplicado(codProduto) && !this.entregue && !this.cancelado && this.qtd<5){
            produtos[this.qtd] = codProduto;
            this.qtd++;
            return true;
        }
        else   return false;
    }

    public int[] entregar(){
        if(qtd>0 && !this.cancelado){
            int[] pedidoFinal = new int[qtd];
            for(int i=0;i<qtd;i++){
                pedidoFinal[i] = this.produtos[i];
            }
            entregue = true;
            return pedidoFinal;
        }
        return null;
    }

    public boolean cancelar(){
        if(!this.cancelado && !this.entregue){
            cancelado = true;
            return true;
        }
        else    return false;
    }   

    public boolean somarPedido(Pedido p){
        int qtdDiferentes = 0;
        for(int i=0;i<this.qtd;i++){
            for(int j=0;j<p.qtd;j++){
                if(this.produtos[i] != p.produtos[j]){
                    System.out.println("Total Pedidos:" + qtdDiferentes + "i = " + i + " j=" + j);
                    qtdDiferentes++;
                    break;
                }
            }
        }
        if(qtdDiferentes>5)
            return false;  

        for(int i=this.qtd, j=0;i<(this.qtd+p.qtd);i++, j++){
            if(produtoDuplicado(p.produtos[j])){
                i--;
                break;
            }
            this.produtos[i] = p.produtos[j];
            qtd++;
        }
        return true;
    }

    public boolean produtoDuplicado(int codProduto){
        for(int i=0;i<qtd;i++){
            if(codProduto == this.produtos[i])
                return true;
        }
        return false;
    } 
        public void getPedido(){
        for(int elementos : this.produtos){
            System.out.println(elementos);
        }
    }
}