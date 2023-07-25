public class ComprimentoDaUltimaPalavra {
	  public static void main(String[]args) {
		  System.out.println(ComprimentoUltimaParede("Hello World"));
	  }
	  
	  public static int ComprimentoUltimaParede(String s) {
		  String[]words = s.split("");
		  for(int i = words.length -1; i>=0; i--) {
			  if(!words[i].isEmpty()) {
				  return words[i].length();
			  }
		  }
		  return 0;
	  }
	}
