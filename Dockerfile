# First Stage: Build the Spring Boot application
FROM maven:3.8.3-openjdk-17 AS builder

WORKDIR /app

COPY pom.xml .

COPY src/ src/
RUN mvn clean package -DskipTests

# Second Stage: Create the runtime image use JRE 
# TODO : use JRE for runtime 
FROM openjdk:17-jdk-slim-buster 

WORKDIR /app

COPY --from=builder /app/target/*.jar ./app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
