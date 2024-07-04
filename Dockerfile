FROM openjdk:17-alpine
LABEL maintainer="hngbackendtask1"
COPY target/HNGBackendTask1-0.0.1-SNAPSHOT.jar HNGBackendTask1.jar
ENTRYPOINT ["java", "-jar", "HNGBackendTask1.jar"]
