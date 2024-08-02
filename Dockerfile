# Use the official Java image from the Docker Hub
FROM openjdk:17-jdk-slim

# Set the working directory
#WORKDIR /dockerImages

# Copy the JAR file into the container
COPY "target/myapp.jar" myapp.jar

# Expose the port the app runs on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "/myapp.jar"]
