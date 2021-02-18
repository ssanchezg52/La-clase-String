package ejerciciosuno;

public class SplitCSV {
	public static void main(String[] args) {
		String registro="1999,Chevyr,Venture,Extended Edition,4900.00";
		String[] split = registro.split(",");
		Coche coche=new Coche(split[0], split[1], split[2], split[3], split[4]);
		System.out.println(coche.toString());
	}
}
class Coche{
	String anno,marca,modelo,version,precio;

	public Coche(String anno, String marca, String modelo, String version, String precio) {
		super();
		this.anno = anno;
		this.marca = marca;
		this.modelo = modelo;
		this.version = version;
		this.precio = precio;
	}
	@Override
	public String toString() {
		return this.anno+this.marca+this.modelo;
	}
	
}
