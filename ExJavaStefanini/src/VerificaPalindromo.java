
public class VerificaPalindromo {

	public static void main(String[] args) {
		String fraseNormal = "roma � amor";
		String fraseInvertida = new StringBuffer(fraseNormal).reverse().toString();
		
		if (fraseNormal.equals(fraseInvertida)) {
			System.out.println("A frase � um Pal�ndromo");
		
		} else {
			System.out.println("A frase n�o � um Pal�ndrmomo");
		}
		
	}

}
