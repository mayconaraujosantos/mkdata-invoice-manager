FROM adoptopenjdk:17-jdk-hotspot AS builder

# Definir variáveis de ambiente para construir o projeto
ENV GRADLE_OPTS="-Dorg.gradle.daemon=false"

COPY . /app
WORKDIR /app

RUN ./gradlew clean build -x test

FROM adoptopenjdk:17-jre-hotspot

COPY --from=builder /app/invoicesmanager/build/libs/*.jar /app/invoicesmanager.jar

EXPOSE 8080

CMD ["java", "-jar", "/app/invoicesmanager-1.0.0.jar"]
