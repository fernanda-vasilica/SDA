#include <unistd.h>
#include <stdlib.h>
#include <stdio.h>

int main()
{
int n; 
char buf[1204];
while ((n=read(0,buf, 1024))>0)
    {
    if (write(1, buf, n))
    	{
    	perror("write");
    	exit(1);
    	}
    }
    if (n<0)
    {
    perror("read");
    exit(1);
    }	
}
