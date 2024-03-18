package view;
import controller.MergeSortController;

public class MergeSortMain{
	public static void main(String[] args){
		int[] vetor = new int[10];
		int tamanho = vetor.length;
		MergeSortController merge = new MergeSortController();
		for(int i = 0; i < tamanho; i++)
			vetor[i] = (int) (Math.random() * 100);
		System.out.println("Vetor desorganizado: ");
		for(int valor:vetor)
			System.out.println(valor);
		System.out.println("----------------");
		System.out.println("Vetor organizado: ");
		merge.sort(vetor);
		for(int valor: vetor)
			System.out.println(valor);
	}
}