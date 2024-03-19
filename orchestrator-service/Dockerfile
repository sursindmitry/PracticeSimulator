FROM gradle:jdk17 AS builder
WORKDIR /app

COPY /orchestrator-service/gradle /app/gradle
COPY /orchestrator-service/build.gradle.kts /app
COPY /orchestrator-service/settings.gradle.kts /app
COPY /orchestrator-service/src /app/src

RUN gradle clean build

FROM openjdk:17-alpine
WORKDIR /
COPY --from=builder /app/build/libs/orchestrator-service.jar app.jar

EXPOSE 8080

ENTRYPOINT java -jar app.jar