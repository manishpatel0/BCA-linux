## The Historical Development of Unix

• Kenneth Thompson, Dennis Ritchie, and others at AT&T Bell Labs developed first Unix version in 1969-1970.
• The above system was rewritten in the programming language C in 1972-1973.
• The seventh version (V7) of Unix was released in 1979.

# Output Redirection
 % cat list1 list2 > biglist
# Input Redirection
 % sort < biglist
# Pipes
 % who > names.txt && % sort < names.txt
# File access rights
 
# chmod
 % chmod go-rwx biglist.
# Disk free (df)
  % df .
# Command for Processes and Jobs
 % ps  && % sleep 10 & && % fg %11
#Disk Utilized (du)
 % du