FROM openjdk:17
EXPOSE 8080
COPY --from=build /app/target/ee.jar sample-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/sample-0.0.1-SNAPSHOT.jar"]
