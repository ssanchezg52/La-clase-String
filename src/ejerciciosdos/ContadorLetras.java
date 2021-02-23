package ejerciciosdos;

public class ContadorLetras {
	public int mayusculas,minusculas;

	public ContadorLetras(int mayusculas, int minusculas) {
		super();
		this.mayusculas = mayusculas;
		this.minusculas = minusculas;
	}

	public ContadorLetras() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null) {
			return false;
		}
		if(obj instanceof ContadorLetras) {
			ContadorLetras instancia=(ContadorLetras)obj;
			return this.mayusculas==instancia.mayusculas&&this.minusculas==instancia.minusculas;
		}
		return false;
	}
	
}
