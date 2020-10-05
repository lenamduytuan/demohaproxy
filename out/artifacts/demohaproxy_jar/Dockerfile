FROM openjdk:8-jdk-alpine
MAINTAINER Le Nam Tuan<tuanlenam@gmail.com>

COPY demohaproxy.jar /

ENTRYPOINT ["java", "-Dserver.port=8080", "-jar","demohaproxy.jar"]