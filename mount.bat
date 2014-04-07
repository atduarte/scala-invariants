call jjtree *.jjt
call javacc *.jj

call XCOPY *.java ".\Parser\src" /Y
del *.java
del *.jj
