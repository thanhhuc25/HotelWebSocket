# HotelWebSocket


## Requirement
- java >= 8
- tomcat > 7

## Development
1. Clone this repository
2. open terminal type: `mvn install`
3. run: `mvn tomcat7:run`
Visit http://localhost:8080/HotelWebSocket/ to see result

## Deploy to tomcat
1. install tomcat
For MAC OSX: `brew install tomcat`
2. Build this repo to WAR directory: 
https://www.jetbrains.com/help/idea/deploying-a-web-app-into-an-app-server-container.html
3. copy WAR dir to `tomcat/webapps/` dir


--------------------------------------------------------------------------------
### Step For MAC OSX user:
1. Install java(jdk 11 or 8, whaterver greater than 7): https://java.com/en/download/help/mac_install.xml
2. Install maven (for development): `brew install maven`
3. Install tomcat: `brew install tomcat`
4. Install Jetbrain idea IDE to develop
https://www.jetbrains.com/idea/
5. Clone this repository
6. `mvn install`
7. `mvn tomcat7:run`
8. Build https://www.jetbrains.com/help/idea/deploying-a-web-app-into-an-app-server-container.html
9. brew services start tomcat
10. copy WAR dir(repo/target/<WAR DIR>) in step 8 to `/usr/local/Cellar/tomcat/9.0.14/libexec/webapps` dir (directory name can difference on your own machine)
11. `brew services restart tomcat`
12. Visit http://localhost:8080/HotelWebSocket/ to see result
