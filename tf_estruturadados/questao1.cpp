#include <stdio.h>
#include <stdlib.h>

struct aluno{
    const char* nome;
    float n1,n2,n3;
};

typedef struct aluno Aluno;

int main(){
    Aluno a;
    //scanf("%s",a.nome);
    a.nome = "Alanio";
    a.n1 = 9.0;
    a.n2 = 9.1;
    a.n3 = 8.9;
}
