
/**
 * Clase para hacer facturas y aplicar iva
 * @author Programador Bajeril
 *
 */
public class Invoice {
	private static final double SPECIAL_DISCOUNT = 0.10d;
	private static final double IVA = 0.04d;
	private static final double REDUCED_IVA = 0.21d;
	double total;
	double subtotal;
	
	public Invoice (double subtotal) {
		this.subtotal = subtotal;
	}
	
	/**
	 *  le aplica al total el iva reducido
	 *  y se guarda en el total
	 */
	public void reducedIva () {
		total = subtotal + (subtotal * REDUCED_IVA);
	}

	/**
	 *  le aplica al total el iva normal
	 *  y se guarda en el total
	 */
	public void iva () {
		total = subtotal + (subtotal * IVA);		
	}
	
	/**
	 * le aplica un descuento especial fijo
	 * que se aplica a clientes VIP
	 */
	public void specialDiscount () {
		total = subtotal - (subtotal * SPECIAL_DISCOUNT);
	}

}
