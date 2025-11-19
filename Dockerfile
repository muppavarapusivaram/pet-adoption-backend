# Use Maven with JDK 21 to build the application
FROM maven:3.9.6-eclipse-temurin-21 AS build

# Set working directory inside container
WORKDIR /app

# Copy the entire project
COPY . .

# Build the Spring Boot app (skips tests)
RUN mvn clean package -DskipTests

# -------------------------------------------------

# Use lightweight JDK to run the application
FROM eclipse-temurin:21-jdk

# Set app directory
WORKDIR /app

# Copy JAR from the previous build stage
COPY --from=build /app/target/*.jar app.jar

# Expose port (Render controls PORT)
EXPOSE 8080

# Run the application
CMD ["sh", "-c", "java -jar app.jar --server.port=${PORT}"]
