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

	/** METODO 1. 
	* Según el valor de la variable combustible se le dará un valor diferente a la
	* la variable resultado, usando para ello las funciones cocheMatricula() y metodoA/B/C().
	* @return Devuelve la variable resultado.
	*/
	
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
	
	/** METODO A. 
	* Llama a la función coche() para completar una cadena de texto.
	* @return Una cadena de texto completada con lo que devuelve la función coche().
	*/
	
	public String metodoA(String modelo, String fabricante)
	{
		modelo = "Corsa";
		fabricante = "Opel";
		return coche(modelo, fabricante) + "y gasta 1,337 euros por litro.";
	}
	
	/** METODO B. 
	* Llama a la función coche() para completar una cadena de texto.
	* @return Una cadena de texto completada con lo que devuelve la función coche().
	*/

	public String metodoB(String modelo, String fabricante)
	{
		modelo = "Seat";
		fabricante = "Ibiza";
		return coche(modelo, fabricante) + "y gasta 1,052 euros por litro.";
	}
	
	/** METODO C. 
	* Llama a la función coche() para completar una cadena de texto.
	* @return Una cadena de texto completada con lo que devuelve la función coche().
	*/
	
	public String metodoC(String modelo, String fabricante)
	{
		modelo = "Hyundai";
		fabricante = "Getz";
		return coche(modelo, fabricante) + "y no necesita combustible.";
	}
	
	/** COCHE MATRICULA. 
	* @return Una cadena formada por la constante COCHE_MATRICULA + matricula.
	*/
	
	private String cocheMatricula() {
		return COCHE_MATRICULA + matricula + " ";
	}
	
	/** COCHE. 
	* @return Una cadena formada por alguna cadena de texto + las variables fabricante y modelo.
	*/
	
	private String coche(String modelo, String fabricante) {
		return "Es un " + fabricante + " " + modelo;
	}
}
