
public class VerificaPalindromo {

	public static void main(String[] args) {
		String fraseNormal = "roma é amor";
		String fraseInvertida = new StringBuffer(fraseNormal).reverse().toString();
		
		if (fraseNormal.equals(fraseInvertida)) {
			System.out.println("A frase é um Palíndromo");
		
		} else {
			System.out.println("A frase não é um Palíndrmomo");
		}
		
	}

}
