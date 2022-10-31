Test framework based on Java, Spring Boot and Selenium.

To run on different profiles/environments:

mvn clean test -Dspring.profiles.active=qa

Browsers:
-Dbrowser=chrome
-Dbrowser=firefox

Running remote using Selenium Grid
-Dspring.profiles.active=remote

Running remote on staging environment
-Dspring.profiles.active=remote,stg