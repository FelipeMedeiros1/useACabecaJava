package br.com.alura.debug.debugStore.modelo;

import java.math.BigDecimal;
import java.util.List;

public class CarrinhoCompra {

	private FormaPagamento formaPagamento;
	private String valorFinalDaCompra;

	public CarrinhoCompra(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public BigDecimal calcularPrecoFinal(List<Produto> produtos) {
		BigDecimal total = new BigDecimal(0);

		for (Produto produto : produtos) {
			BigDecimal preco = produto.getPreco();
			double porcentagemDesconto = this.getFormaPagamento().getPorcentagemDesconto();
			BigDecimal valorComDesconto = preco.multiply(new BigDecimal(porcentagemDesconto))
					.divide(new BigDecimal("100"));
			BigDecimal valorProdutoComDesconto = preco.subtract(valorComDesconto);

			if (valorProdutoComDesconto.compareTo(new BigDecimal("700.00")) == 1) {
				System.out.println(" O produto " + produto.getDescricao() + " ganhou mais 20 reais de desconto!");
				valorProdutoComDesconto = valorProdutoComDesconto.subtract(new BigDecimal("20.00"));

			}
			BigDecimal multiplicador = new BigDecimal(produto.getQuantidade());

			total = total.add(valorProdutoComDesconto.multiply(multiplicador));
		}
		total = calcularPromocao(produtos, total);
		return total;
	}

	private BigDecimal calcularPromocao(List<Produto> produtos, BigDecimal total) {
		for (Produto produto : produtos) {
			int quantidadeDescontar = produto.getQuantidade() / 3;

			for (int contador = 0; quantidadeDescontar > contador; contador++) {
				total = total.subtract(produto.getPreco());
			}
		}
		return total;
	}

}
