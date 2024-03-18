package controller;
 public class MergeSortController{
 	public MergeSortController(){
 		super();
 	}
 	public void sort(int[] vetor){
 		merge(vetor, 0, vetor.length - 1);
 	}
 	private void merge(int[] vetor, int inicio, int fim){
 		int meio;
 		if(inicio < fim){
 			meio = ((inicio + fim) / 2);
 			merge(vetor, inicio, meio);
 			merge(vetor, meio + 1, fim);
 			intercala(vetor, inicio, fim, meio);
 		}
 	}
 	private void intercala(int[] vetor, int inicio, int fim, int meio){
 		int poslivre, inicio_vet1, inicio_vet2;
 		int[] aux = new int[vetor.length];
 		inicio_vet1 = inicio;
 		inicio_vet2 = meio + 1;
 		poslivre = inicio;

 		while(inicio_vet1 <= meio && inicio_vet2 <= fim){
 			if(vetor[inicio_vet1] <= vetor[inicio_vet2]){
 				aux[poslivre++] = vetor[inicio_vet1++];
 			} else{
 				aux[poslivre++] = vetor[inicio_vet2++];
 			}
 		}
 		for(int i = inicio_vet1; i <= meio; i++)
 			aux[poslivre++] = vetor[i];
 		for(int i = inicio_vet2; i <= fim; i++)
 			aux[poslivre++] = vetor[i];
 		for(int i = inicio; i <= fim; i++)
 			vetor[i] = aux[i];
 	}
 }