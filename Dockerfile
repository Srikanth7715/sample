# Build stage
FROM maven:3.8.6-openjdk-17-slim AS build
WORKDIR /app
COPY . .
RUN mvn clean package

# Run stage
FROM openjdk:17
EXPOSE 8080
COPY --from=build /app/target/sample-0.0.1-SNAPSHOT.jar sample-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/sample-0.0.1-SNAPSHOT.jar"]
