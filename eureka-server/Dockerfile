FROM openjdk:17

EXPOSE 8761
COPY target/eureka-server-0.0.1-SNAPSHOT.jar EurekaServer.jar
ENTRYPOINT ["java", "-jar", "EurekaServer.jar"]