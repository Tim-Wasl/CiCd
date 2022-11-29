FROM openjdk:11

VOLUME /tmp

ARG JAR_FILE

ADD ${JAR_FILE} app.jar

ARG server

ENV server=$server

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

EXPOSE $server