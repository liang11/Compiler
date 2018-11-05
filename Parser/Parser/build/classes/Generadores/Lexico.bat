SET JAVA_HOME="C:\Program Files\Java\jdk1.8.0_151\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
cd  C:\GitHub\Parser\Parser\src\Analizadores
java -jar C:\jflex-1.6.1\lib\jflex-1.6.1.jar A_Lexico.jflex
pause

