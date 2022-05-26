#include <unistd.h>
#include <stdlib.h>
#include <stdio.h>

int main()
{
int n; 
int m;
int s;
char buf[1204];
n=read(0,buf, 1024);
m=read(0,buf, 1024);
s=m+n;
buf[0]=(char) s;
write(1, (char) s, sizeof((char) s));
}
