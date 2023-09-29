.source Test.j
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V

    ldc    1
    istore 1

BEGIN_WHILE_1:
    iload  1
    ldc    10
    if_icmpge END_WHILE_1 ; compara os dois valores da pilha, usando comparacao inversa

    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload  1
    invokevirtual java/io/PrintStream/println(I)V

    iload  1
    ldc    1
    iadd
    istore 1

    goto   BEGIN_WHILE_1 ; desvia para executar novo teste de repeticao
END_WHILE_1:

    return
.limit stack  2 ; numero maximo da altura que a pilha atinge
.limit locals 2 ; numero de parametros e variaveis locais
.end method
