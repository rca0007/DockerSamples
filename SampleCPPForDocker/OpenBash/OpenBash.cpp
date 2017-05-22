#include<unistd.h>
#include<stdlib.h>

using namespace std;

int main(int len, char** args)
{
	static char* bash[2];
	bash[0] = (char *) "/bin/bash";
	bash[1] = NULL; 
	execv(*bash, bash);	
}
