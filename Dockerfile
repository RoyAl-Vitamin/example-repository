FROM openjdk:17-slim
MAINTAINER RoyAl-Vitamin
COPY target/example-repository-1.0.0.jar example-repository.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/example-repository.jar"]