package empresa;

public class Pedido{
	private int[] pedido = new int[5];
	private int indexProduto = -1;
	private boolean entregue = false;
	private boolean cancelado = false;
	public boolean adicionarProduto(int codProduto){
		if(indexProduto + 1 < 5 && !entregue && !cancelado){
			pedido[++indexProduto] = codProduto;
			return true;
		}
		else 
			return false;
		
	}

	public int[] entregar(){
		if(!cancelado && indexProduto >= 0){
			int produtosEntregues[] = new int[indexProduto + 1];
			for(int i = 0; i < indexProduto + 1; i++)
				produtosEntregues[i] = pedido[i];
			entregue = true;
			return produtosEntregues;
		}
		else 
			return null;
	}

	public boolean cancelar(){
		if(!entregue){
			cancelado = true;
			return true;
		} else
			return false;

	}
	public boolean somarPedido(Pedido p){
		int qtdePedidos = indexProduto + 1;
		int qtdeNovosPedidos = 0;
		int[] indexNovos = new int[5];
		for(int i = 0; i < 5; i++){
			if(p.pedido[i] != 0){
				int j = 0;
				while(j < qtdePedidos){
					if(this.pedido[j] == p.pedido[i])
						break;
					else
						j++;
				}
				if(j == qtdePedidos){
					indexNovos[qtdeNovosPedidos] = i;
					qtdeNovosPedidos++;
				}
			}
		}
		if (qtdePedidos + qtdeNovosPedidos <= 5){
			for(int i = 0; i < qtdeNovosPedidos; i++){
				this.pedido[++indexProduto] = p.pedido[indexNovos[i]];
			}
			return true;
			
		}
		else{
			return false;
		}
	}
}