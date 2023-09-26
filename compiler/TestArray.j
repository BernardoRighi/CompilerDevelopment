.source Test.j
.class  public Test
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static main([Ljava/lang/String;)V

    new Array                                                        ; a = []
    dup
    invokespecial Array/<init>()V
    astore 1

    aload  1                                                         ; a.push(123)
    ldc 123
    invokevirtual Array/push(I)V

    getstatic java/lang/System/out Ljava/io/PrintStream;             ; console(a.length)
    aload  1
    invokevirtual Array/length()I
    invokevirtual java/io/PrintStream/print(I)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V

    getstatic java/lang/System/out Ljava/io/PrintStream;             ; console(a)
    aload  1
    invokevirtual Array/string()Ljava/lang/String;
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V

    aload  1                                                        ; a[0] = 456
    ldc 0
    ldc 456
    invokevirtual Array/set(II)V

    getstatic java/lang/System/out Ljava/io/PrintStream;            ; console(a[0])
    aload  1
    ldc 0
    invokevirtual Array/get(I)I
    invokevirtual java/io/PrintStream/print(I)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V

    return
    .limit stack 3
    .limit locals 2
.end method
