Java Native Interface ��ʵ�ַ���������

javac Hello.java
javac -h ./ Hello.java
gcc -m64  -Wl,--add-stdcall-alias -I"C:\Program Files\Java\jdk-11.0.2\include" -I"C:\Program Files\Java\jdk-11.0.2\include\win32" -shared -o sayHello.dll sayHello.c
java Hello