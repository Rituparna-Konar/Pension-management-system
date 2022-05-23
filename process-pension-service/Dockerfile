FROM openjdk:11
EXPOSE 8100
ADD "target/process-pension-service-890701.jar" "process-pension-service.jar"
ENTRYPOINT [ "java", "-jar", "/process-pension-service.jar" ]