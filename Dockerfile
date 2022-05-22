FROM openjdk:17
ADD target/products-0.0.1-SNAPSHOT.jar products-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/products-0.0.1-SNAPSHOT.jar"]