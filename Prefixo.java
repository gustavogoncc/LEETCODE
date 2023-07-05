public class Prefixos {
	public static void main(String []args) {
		String[] strings = {"Carro","Carreta","Camarão"};
		String prefixoComum = prefixoComumMaisLongo(strings);
		System.out.printf(prefixoComum);
	}
	public static String prefixoComumMaisLongo(String[]strs) {
		if( strs == null || strs.length == 0) {
			return "";
		}
		String prefixo = strs[0];
		for(int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(prefixo)!= 0) {
				prefixo = prefixo.substring(0, prefixo.length() -1 );
				
				if(prefixo.isEmpty()) {
					System.out.println("Não há um prefixo comum.");
					return "";
				}
			}
		}
		System.out.println("O prefixo mais longo é: "+ prefixo);
		return prefixo;
	}
}
