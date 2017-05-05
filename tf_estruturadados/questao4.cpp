#include <stdio.h>
#include <stdlib.h>

struct data{
    int dia, mes, ano;
};

typedef struct data Data;

struct pessoa{
    char nome[50];
    Data nas;
};

typedef struct pessoa Pessoa;

void exibe(Pessoa p){
    printf("%s\n",p.nome);
}

void maisVelho(Pessoa a, Pessoa b){

    if(a.nas.ano < b.nas.ano){
        exibe(a);
    }else if(a.nas.ano > b.nas.ano){
        exibe(b);
    }else{

        if(a.nas.mes < b.nas.mes){
            exibe(a);
        }else if(a.nas.mes > b.nas.mes){
            exibe(b);
        }else{

            if(a.nas.dia < b.nas.dia){
                exibe(a);
            }else if(a.nas.dia > b.nas.dia){
                exibe(b);
            }else{
                printf("Nasceram no mesmo dia\n");
            }
        }
    }
}

int main(){
    Pessoa p1,p2;

    printf("Pessoa 1 - nome - dia - mes - ano\n");
    scanf("%[^\n]",p1.nome);
    scanf("%d",&p1.nas.dia);
    scanf("%d",&p1.nas.mes);
    scanf("%d",&p1.nas.ano);

    printf("Pessoa 2 - nome - dia - mes - ano\n");
    scanf(" %[^\n]",p2.nome);
    scanf("%d",&p2.nas.dia);
    scanf("%d",&p2.nas.mes);
    scanf("%d",&p2.nas.ano);

    printf("\nPessoa mais velha: ");
    maisVelho(p1,p2);
}
