FROM openjdk:11
EXPOSE 8400
ADD "target/authorization-service-890701.jar" "auth-service.jar"
ENTRYPOINT [ "java", "-jar", "/auth-service.jar" ]