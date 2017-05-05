#include <stdio.h>
#include <stdlib.h>

/*
* MAIOR DATA = DATA MAIS RECENTE(COM MAIS DIAS)
*/

struct data{
    int dia, mes, ano;
};

typedef struct data Data;

void exibe(Data d1){
    printf("%d %d %d\n",d1.dia, d1.mes, d1.ano);
}

void maiorData(Data d1, Data d2){

    if(d1.ano > d2.ano){
        exibe(d1);
    }else if(d1.ano < d2.ano){
        exibe(d2);
    }else{

        if(d1.mes > d2.mes){
            exibe(d1);
        }else if(d1.mes < d2.mes){
            exibe(d2);
        }else{

            if(d1.dia > d2.dia){
                exibe(d1);
            }else if(d1.dia < d2.dia){
                exibe(d2);
            }else{
                printf("São iguais\n");
            }
        }
    }
}

int main(){
    Data d1, d2;

    printf("Data 1 - dia - mes - ano\n");
    scanf("%d",&d1.dia);
    scanf("%d",&d1.mes);
    scanf("%d",&d1.ano);

    printf("Data 2 - dia - mes - ano\n");
    scanf("%d",&d2.dia);
    scanf("%d",&d2.mes);
    scanf("%d",&d2.ano);

    maiorData(d1,d2);
}

