#include <stdio.h>

float notas[100];
int tam=0;

void inserir(float num){
	notas[tam] = num;
	tam++;
}

int main(){
	float num,  soma=0.0;
	int cont=1;
	
	while(cont==1){

		scanf("%f",&num);
		if(num != -1){
			inserir(num);
			soma+=num;
		}else{
			cont = 0;
			break;
		}
	}
	
	printf("\n%f\n",soma/tam);
}
