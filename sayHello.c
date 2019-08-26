#include "Hello.h"
#include <stdio.h>
 
JNIEXPORT void JNICALL Java_Hello_sayHello(JNIEnv *env, jclass jc)
{
    printf("Hello，JNI");    
}
