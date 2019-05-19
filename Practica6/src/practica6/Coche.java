package practica6;

public class Coche {
	private static final String COCHE_MATRICULA = "El coche con matricula ";
	String matricula;
	String combustible;
	String modelo;
	String fabricante;

	public Coche() {
		matricula = "";
		combustible = "";
		modelo = "";
		fabricante = "";
	}

	public Coche(String m, String c, String mo, String f) {
		matricula = m;
		combustible = c;
		modelo = mo;
		fabricante = f;
	}

	public String metodo1()
	{
		String resultado = "";
		
		switch (combustible)
		{
		case "Gasolina":
			resultado += cocheMatricula() + metodoA(modelo, fabricante);
			break;
			
		case "Diesel":
			resultado += cocheMatricula() + metodoB(modelo, fabricante);
			break;
			
		case "Híbrido":
			resultado += cocheMatricula() + metodoC(modelo, fabricante);
			break;
			
		default:
			resultado += cocheMatricula() + " no dispone de información";
			break;
		}
		return resultado;
	}
	
	public String metodoA(String modelo, String fabricante)
	{
		modelo = "Corsa";
		fabricante = "Opel";
		return coche(modelo, fabricante) + "y gasta 1,337 euros por litro.";
	}
	
	public String metodoB(String modelo, String fabricante)
	{
		modelo = "Seat";
		fabricante = "Ibiza";
		return coche(modelo, fabricante) + "y gasta 1,052 euros por litro.";
	}
	
	public String metodoC(String modelo, String fabricante)
	{
		modelo = "Hyundai";
		fabricante = "Getz";
		return coche(modelo, fabricante) + "y no necesita combustible.";
	}
	private String cocheMatricula() {
		return COCHE_MATRICULA + matricula + " ";
	}
	
	private String coche(String modelo, String fabricante) {
		return "Es un " + fabricante + " " + modelo;
	}
}
