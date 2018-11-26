SET JAVA_HOME="C:\Program Files\Java\jdk1.8.0_181\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
cd "C:\GitHub\Compiler\Parser\src\Analizadores"
java -jar "C:\jflex-1.6.1\lib\java-cup-11b.jar" -parser Analizador_Sintactico -symbols Simbolos A_Sintactico.cup
pause