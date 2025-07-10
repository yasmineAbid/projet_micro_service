FROM openjdk:17
EXPOSE 8081
ADD target/gateway-0.0.1-SNAPSHOT.jar Gateway.jar
ENTRYPOINT ["java", "-jar", "Gateway.jar"]