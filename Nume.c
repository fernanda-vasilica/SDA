#include <unistd.h>
#include <stdlib.h>
#include <stdio.h>


int main()
{
char buf[]="Dida Ioan Marian\n";
write (1,buf,sizeof(buf));
char buf2[]="IESC,TST\n";
write (1,buf2,sizeof(buf2));
}
