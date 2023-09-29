.source Test.j
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V

    ldc    2 ; carrega valor 2 na pilha
    istore 1 ; armazena o topo da pilha na variavel #1

    ; efetua calculo da comparacao
    iload  1 ; coloca na pilha o valor da variavel #1
    ldc    3 ; carrega valor 3 na pilha
    if_icmpge NOT_IF_0 ; compara os dois valores da pilha, e desvia se NAO for verdade
    ; aqui comeca o corpo do IF
    ldc    4 ; carrega valor 4 na pilha
    istore 1 ; armazena o topo da pilha na variavel #1
NOT_IF_0:
    ; aqui termina o corpo do IF

    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload  1 ; coloca na pilha o valor da variavel #1
    invokevirtual java/io/PrintStream/println(I)V

    return
    .limit stack  2 ; numero maximo da altura que a pilha atinge
    .limit locals 2 ; numero de parametros e variaveis locais
.end method
