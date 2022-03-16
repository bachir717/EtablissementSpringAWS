FROM maven:3.8.4-openjdk-11-slim as build
RUN mkdir etablissementScolaireSpring
WORKDIR /etablissementScolaireSpring
COPY ./ ./
RUN mvn clean package spring-boot:repackage
RUN ls
RUN ls ./target

FROM gcr.io/distroless/java:11
COPY --from=build /etablissementScolaireSpring/target/etablissementScolaireSpring-0.0.1-SNAPSHOT.jar /jar-files/etablissementScolaireSpring.jar
WORKDIR /jar-files

EXPOSE 8080
CMD [ "etablissementScolaireSpring.jar" ]