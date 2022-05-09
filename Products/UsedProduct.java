package expoli;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

    private static final SimpleDateFormat x = new SimpleDateFormat();
	
	private Date manufactureDate;

	public UsedProduct(String nome, Double preco, Date manufactureDate) {
            super(nome, preco);
            this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
            return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
            this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
            return getNome() + " (used) $ " + String.format("%.2f", getPreco()) + " (Manufacture date: " + x.format(manufactureDate) + ")";
        }    
}
