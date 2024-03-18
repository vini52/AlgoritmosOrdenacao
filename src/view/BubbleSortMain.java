package view;
import controller.BubbleSortController;

public class BubbleSortMain{
	public static void main(String[] args){
		BubbleSortController bubble = new BubbleSortController();
		int[] vetor = new int[5];
		for(int i = 0; i < 5; i++){
			vetor[i] = (int) (Math.random() * 100);
		}
		System.out.println("Vetor desorganizado: ");
		for(int i = 0; i < 5; i++)
			System.out.println(vetor[i]);
		System.out.println("---------------------------------");
		System.out.println("Vetor organizado: ");
		bubble.sort(vetor);
		for(int i = 0; i < 5; i++)
			System.out.println(vetor[i]);
	}
}