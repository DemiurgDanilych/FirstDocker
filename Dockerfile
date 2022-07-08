FROM openjdk:11

EXPOSE 8080

ADD target/REST-0.0.1-SNAPSHOT.jar myapp.jar

ENTRYPOINT ["java","-jar","/myapp.jar"]