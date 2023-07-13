# rest
Springboot simple rest

Install:
1. Java jdk and jde 1.8
Add environment variable:
Start: about system , advanced setting, environment variable
Under “System variables” click the “New…” button and enter JAVA_HOME as “Variable name” and the path to your Java JDK directory under “Variable value”: C:\Program Files\Java\jdk1.8.0_311
Update System PATH:
* In “Environment Variables” window under “System variables” select Path
* Click on “Edit…”
* In “Edit environment variable” window click “New”
* Type in  %JAVA_HOME%\bin
Open CMD: echo %JAVA_HOME%
this will print out the directory JAVA_HOME points to or empty line if the environment variable is not set correctly
Open CMD: javac -version
this will print out the version of the java compiler if the Path variable is set correctly or “javac is not recognized as an internal or external command…” otherwise. UPDATE: in the comments below there are several suggesting to run the command prompt as administrator if you see the error message.

2. Maven https://maven.apache.org/download.cgi
Extract archive in any dir, take note on the bin folder path.
Update System PATH:
* In “Environment Variables” window under “System variables” select Path
* Click on “Edit…”
* In “Edit environment variable” window click “New”
* Type in  the bin maven path : C:\Program Files\apache-maven-3.8.4-bin\apache-maven-3.8.4\bin
Open CMD to verify the installation:
mvn -v

3. IntelliJ https://www.jetbrains.com/idea/download/


4a. MySQL Workbench https://dev.mysql.com/downloads/workbench/
4b. PostgreSQL https://www.postgresql.org/download/windows/
To login , in terminal psql -U [username]
example: psql -U postgresql
password: admin
Or use pgAdmin to connect postgreSQL with UI


5. Postman https://www.postman.com/downloads/
