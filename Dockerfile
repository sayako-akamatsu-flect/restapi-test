FROM openjdk:17

COPY build/libs/restapi-test-0.0.1-SNAPSHOT.jar /restapi/restapi-test.jar

ENTRYPOINT ["java","-jar","/restapi/restapi-test.jar"]