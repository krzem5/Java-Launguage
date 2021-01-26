echo off
echo NUL>_.class&&del /s /f /q *.class
cls
javac com/krzem/CJL/CJL.java
java com/krzem/CJL/CJL -c prog.cjl -d -r prog
start /min cmd /c "echo NUL>_.class&&del /s /f /q *.class"