FROM adoptopenjdk:11-openj9
VOLUME /tmp
COPY build/libs/spotify-layer.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]