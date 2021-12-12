#FROM openjdk:8-jdk-alpine
FROM azul/zulu-openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} pay.jar
ENTRYPOINT ["java","-jar","/pay.jar"]