# Test Auto : Search "Ingenico group" on Google

The objective of this automated test is to be able to search for the word "Ingenico group" on the Google search bar.

1/ Download JDK8 and IntelliJ IDE
JDK --> https://www.oracle.com/java/technologies/javase-jdk8-downloads.html
Intellij IDE --> https://www.jetbrains.com/fr-fr/idea/download/#section=windows

2/ Create Project Maven on intelliJ
- Create project choose archetype quickly-start

3/ Download dependency Cucumber
- Cucumber (io Cucumber) on Maven repository --> https://mvnrepository.com/artifact/io.cucumber 
- JVM Junit --> https://mvnrepository.com/artifact/io.cucumber/cucumber-junit
- JVM Java --> https://mvnrepository.com/artifact/io.cucumber/cucumber-java 

3/ Télécharger dependency Selenium
--> https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java

4/ Update dependency on pom.xml from Maven

5/ Before Run Test
Download browser drivers 
- chrome: download chrome.driver --> https://chromedriver.chromium.org/
- firefox: download gecko.driver --> https://github.com/mozilla/geckodriver/releases

After that, you need to push drivers file .exe on ressources/drivers

6/ Run test with TestRunner
On file config.properties (test/java/ressources/environnement), you need to change the key browser by :
- "Chrome" for Google Chrome 
- "Firefox" for firefox 

** thanks **




