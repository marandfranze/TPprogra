package trabajopractico;

public abstract class Atencion {
	protected float importe;
	protected Fecha fecha;
	protected boolean pagado;
	protected String tipo;
	
	public Atencion(float importe, Fecha fecha, boolean pagado, String tipo) {
		this.importe=importe;
		this.fecha=fecha;
		this.pagado=pagado;
		this.tipo=tipo;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
