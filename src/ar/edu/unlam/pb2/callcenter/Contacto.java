package ar.edu.unlam.pb2.callcenter;

public class Contacto {
	
	private String nombre;
	private String apellido;
	private int celular;
	private String email;
	private String direccion;
	private int codigoPostal;
	private String localidad;
	/*private Provincia provincia;*/
	private boolean cliente;
	private boolean deseaSerLlamado;


	public String toString() {
		return "Contacto [nombre=" + nombre + ", apellido=" + apellido + ", celular=" + celular + ", cliente=" + cliente
				+ ", deseaSerLlamado=" + deseaSerLlamado + "]";
	}

	public Contacto(String nombre, String apellido, int celular, String email, String direccion, int codigoPostal,
			String localidad/*, Provincia provincia*/) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.celular = celular;
		this.email = email;
		this.direccion = direccion;
		this.codigoPostal = codigoPostal;
		this.localidad = localidad;
		/*this.provincia = provincia;*/
		this.cliente = true;
		this.deseaSerLlamado = false;
	}

	public boolean isCliente() {
		return cliente;
	}

	public void setCliente(boolean cliente) {
		this.cliente = cliente;
	}

	public boolean isDeseaSerLlamado() {
		return deseaSerLlamado;
	}

	public void setDeseaSerLlamado(boolean deseaSerLlamado) {
		this.deseaSerLlamado = deseaSerLlamado;
	}
	
	
	
	

}
