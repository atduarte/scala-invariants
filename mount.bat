call jjtree *.jjt
call javacc *.jj

call XCOPY *.java "C:\Users\Papa Formigas\IdeaProjects\MIEIC\COMP\COMP_proj\src" /Y
del *.java
del *.jj