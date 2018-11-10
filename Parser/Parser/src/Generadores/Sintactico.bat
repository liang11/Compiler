SET JAVA_HOME="C:\Program Files\Java\jdk1.8.0_181\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
cd "D:\Documents\TEC\2018\II Semestre 2018\Compiladores e interpretes\Proyectos\Proyecto 2\Parser\Parser\src\Analizadores"
java -jar "D:\Documents\TEC\2018\II Semestre 2018\Compiladores e interpretes\jcup\java-cup-11b.jar" -parser Analizador_Sintactico -symbols Simbolos A_Sintactico.cup
pause