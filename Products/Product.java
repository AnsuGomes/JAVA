package expoli;
public class Product {

    private String nome;
    private Double preco;

	public Product(String name, Double preco) {
            this.nome = name;
            this.preco = preco;
	}

	public String getNome() {
            return nome;
	}

	public void setNome(String nome) {
            this.nome = nome;
	}

	public Double getPreco() {
            return preco;
	}

	public void setPreco(Double preco) {
            this.preco = preco;
	}

	public String priceTag() {
            return nome + " $ " + String.format("%.2f", preco);
	}   
}
