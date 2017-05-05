#include <stdio.h>
#include <stdlib.h>

struct aluno{
    char nome[50], matricula[50];

    float n1,n2,n3;
};

typedef struct aluno Aluno;

float media(Aluno a){
    return (a.n1 + a.n2 + a.n3)/3.0;
}

void exibeAluno(Aluno a){
    printf("\nNome: %s\nMatricula: %s\nNota 1: %.1f\nNota 2: %.1f\nNota 3: %.1f\n",
           a.nome,
           a.matricula,
           a.n1,
           a.n2,
           a.n3
        );
}

void comparaMedia(Aluno a, Aluno b){
    if(media(a) > media(b)){
        exibeAluno(a);
    }else if(media(a) < media(b)){
        exibeAluno(b);
    }else{
        printf("\nMedias iguais para %s e %s\n",a.nome,b.nome);
    }
}

int main(){
    Aluno a, b;

    printf("Aluno 1: nome - mat- n1 -n2 -n3\n");
    scanf("%[^\n]",a.nome);
    scanf(" %[^\n]",a.matricula);
    scanf("%f",&a.n1);
    scanf("%f",&a.n2);
    scanf("%f",&a.n3);

    printf("Aluno 2: nome - mat- n1 -n2 -n3\n");
    scanf(" %[^\n]",b.nome);
    scanf(" %[^\n]",b.matricula);
    scanf("%f",&b.n1);
    scanf("%f",&b.n2);
    scanf("%f",&b.n3);

    printf("Aluno com maior media:\n");
    comparaMedia(a,b);

}

