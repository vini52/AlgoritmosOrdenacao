package controller;
public class BubbleSortController{
	public BubbleSortController(){
		super();
	}
	public void sort(int[] vetor){
		int aux = 0;
		int tamanho = (vetor.length) - 1;
		for(int i = 0; i < tamanho; i++){
			for(int j = 0; j < tamanho; j++){
				if(vetor[j] > vetor[j+1]){
					aux = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
				}
			}
		}
	}
}