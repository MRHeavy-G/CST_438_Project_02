# Use the follwoing if you are on an m1 mac...
#FROM --platform=linux/amd64 openjdk:11
# Use this if not on m1 mac
FROM openjdk:11
VOLUME /tmp
COPY target/Project02_Team8-0.0.1-SNAPSHOT.jar  Project02_Team8-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","Project02_Team8-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080:8080
