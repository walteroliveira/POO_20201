import empresas.Pedido;

public class TestePedido{
	public static void main(String[] args){
		Pedido p0 = new Pedido();
		Pedido p1 = new Pedido();
		Pedido p2 = new Pedido();
		Pedido p3 = new Pedido();


		System.out.println(p0.adicionarProduto(10));
		System.out.println(p0.adicionarProduto(20));
		System.out.println(p0.adicionarProduto(30));

		System.out.println(p2.adicionarProduto(11));
		System.out.println(p2.adicionarProduto(22));
		System.out.println(p2.adicionarProduto(33));

		System.out.println(p1.adicionarProduto(20));
		System.out.println(p1.adicionarProduto(15));
		System.out.println(p1.adicionarProduto(40));
		System.out.println(p1.adicionarProduto(30));
		p0.getPedido();
		System.out.println(p0.somarPedido(p1));
		p0.getPedido();
	}
}