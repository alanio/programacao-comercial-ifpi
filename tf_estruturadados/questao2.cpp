#include <stdio.h>

int main(){
	int num;
	
	scanf("%d", &num);
	
	int fib[num];
	
	for(int i=0;i<num;i++){
		if(i==0){
			fib[0] = 0;
		}else if(i==1){
			fib[1] = 1;
		}else{
			fib[i] = fib[i-1] + fib[i-2];
		}
	}
	
	for(int x=0;x<num;x++){
		printf("%d  ",fib[x]);
	}
	
}
