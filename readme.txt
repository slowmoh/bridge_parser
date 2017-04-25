--------------------------------
Reconstructing Bridge Parser.pdf
- short review of the paper
- short introduction of implementation idea
--------------------------------

--------------------------------
BParser

Files:
	- Tokenizer (Build Tokenlist)
		Files: 
			- src/org/list/BridgeToken.java
			- src/org/list/DoubleLinkedList.java
			- src/org/tokenizer/Tokenizer.java
	- BridgeBuilder (Build bridges between Token)
		Files:
			- src/org/bridgebuilder/BridgeBuilder.java
	- BridgeRepairer (inserts missing token)
		Files:
			-src/org/bridgebuilder/BridgeRepairer.java
	- "Test files" 
		Files:
			- src/test/BridgeTest.java (test of building bridges - just detect how many bridges are build up)
			- src/test/RepairTest.java ("visual" test of repaired files with missing Braces)
			- src/test/RepairParenthesis.java ("visual" test of repaired files with missing Parenthesis)

Functions:
	- code can build successfully bridges between island token ( braces and parenthesis)
	- code can insert successfully missing braces 
	- code can insert successfully missing right parenthesis 
	
Uncompleted Functions:
	- code cannot insert missing left parenthesis


ToDo´s:
	- pretty print function
	- output text function
	
###Deleted the introduction.pdf. 
			
	
