FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/ProdutoServiceDocker-0.0.1-SNAPSHOT.jar produto-service.jar
ENTRYPOINT ["java","-jar","/produto-service.jar"]

