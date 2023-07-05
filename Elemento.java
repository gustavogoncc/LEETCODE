import java.util.Arrays;

public class Elemento {
	public int removeElemento(int[]nums, int val) {
		int k = 0; // contador de elementos diferentes de val
		
	// Percorre o array nums
		for(int i = 0; i < nums.length; i++) {
			// Se o elemento atual não for igual a val, move-o para 
			// posição K e implementa K
			if(nums[i] != val) {
				nums[k] = nums[i];
				k++;
			}
		}
		return k;
	}
	public static void main(String[]args) {
		int[]nums = {3,2,2,3};
		// Ex array de entrada
		int val = 3; // valor a remover
		int[] esperadoNums = {2,3};
		// Resposta esperada com comprimento correto (elementos diferentes de val)
		
	    Elemento elemento = new Elemento();
		int k = elemento.removeElemento(nums, val);
		
		assert k == esperadoNums.length;
		// Ordena os primeiros k elementos
		Arrays.sort(nums, 0, k);
		// verifica se os elementos correspondem à resposta
		// esperada
		for(int i = 0; i < k; i++) {
			assert nums[i] == esperadoNums[i];
		}
		System.out.println("Teste passou!");
		// Mensagem de sucesso se todas as asserções forem aprovadas
	}

}
