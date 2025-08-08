# Step 1: Use JDK image for building
FROM eclipse-temurin:17-jdk AS build
WORKDIR /app
COPY . .
RUN ./mvnw clean package -DskipTests

# Step 2: Use lightweight JRE image for running
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

# Expose the port Render will use
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
