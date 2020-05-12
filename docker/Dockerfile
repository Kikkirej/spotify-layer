FROM openjdk:11-jdk-alpine
VOLUME /tmp
COPY build/libs/spotify-layer.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]