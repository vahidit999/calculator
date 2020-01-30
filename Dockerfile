# DockerFile

FROM openjdk:8-jre-alpine

MAINTAINER Author vahid <vahidit999@gmail.com>

COPY target/simpleSpringBoot-server-0.0.1-SNAPSHOT-spring-boot.jar /app.jar

CMD ["java","-jar","./app.jar"]

# docker build -t image-name:latest
# to run image =>  docker run -d  -p 8081:8081 image-name:latest

