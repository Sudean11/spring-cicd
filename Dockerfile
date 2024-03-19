# Use the official Maven image as the base image
FROM maven:3.8.4-openjdk-17-slim AS build

WORKDIR /app

COPY . .

RUN mvn clean package

EXPOSE 8080
CMD ["java", "-jar", "target/proj-0.0.1-SNAPSHOT.jar"]
