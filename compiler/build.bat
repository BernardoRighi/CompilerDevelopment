@echo off
java -jar antlr-4.8-complete.jar CS.g


IF %ERRORLEVEL% EQU 0 ( 
  goto exp
) ELSE ( 
  goto erro
)

:exp
javac -cp .;antlr-4.8-complete.jar CS*.java
REM C:"\Program Files\Java\jdk1.8.0_251\bin\javac.exe" Runtime.java
IF %ERRORLEVEL% EQU 0 ( 
  goto sucesso
) ELSE ( 
  goto erro
)


:sucesso
echo.
@echo 1_build.bat executado com sucesso!

:erro
echo.
echo ERRORLEVEL: %ERRORLEVEL%