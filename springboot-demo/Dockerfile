#This is a Dockerfile for a microservice application

# Use an official Java 8 runtime as a parent image- alpine is the lightweight OS
FROM maven:3.5-jdk-8-alpine

VOLUME /tmp

#Set maintainer email id
MAINTAINER muhammad.khalid2@telus.com 

# Set the working directory to /app
WORKDIR /app

# Copy the current directory contents into the container at /app
ADD . /app

# Copy the current directory contents into the container at /app
ADD target/springboot-demo-0.0.1-SNAPSHOT.jar springboot-demo.jar

# Make port 8010 available to the world outside this container
EXPOSE 8181

# Define environment variable
ENV JAVA_OPTS=""

# Run workerbatch.jar when the container launches
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar springboot-demo.jar" ]

RUN chgrp -R 0 /app && \
   chmod -R g=u /app