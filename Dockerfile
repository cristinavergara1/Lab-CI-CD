FROM openjdk:11
EXPOSE 8080
ADD target/labcicd-0.01-SNAPSHOT.jar labcicd-0.01-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/labcicd-0.01-SNAPSHOT.jar"]