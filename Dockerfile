FROM maven:3.8.5-openjdk-17 AS builder
WORKDIR /menetrendek
COPY pom.xml .
COPY src ./src
RUN mvn clean install -DskipTests