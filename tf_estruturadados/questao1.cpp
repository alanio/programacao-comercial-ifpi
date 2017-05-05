#include <stdio.h>

int main(){
	int tam, soma=0;
	
	scanf("%d", &tam);
	
	int numeros[tam];
	
	for(int i=0;i<tam;i++){
		scanf("%d",&numeros[i]);
		soma+=numeros[i];
	}
	
	printf("\n%d\n", soma);
	
}
