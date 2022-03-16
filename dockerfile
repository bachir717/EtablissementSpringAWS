FROM maven:3.8.4-openjdk-11-slim as build
RUN mkdir demo-springboot
WORKDIR /demo-springboot
COPY ./ ./
RUN mvn clean package spring-boot:repackage
RUN ls
RUN ls ./target

FROM gcr.io/distroless/java:11
COPY --from=build /demo-springboot/target/demo-springboot-0.0.1-SNAPSHOT.jar /jar-files/demo-springboot.jar
WORKDIR /jar-files

EXPOSE 8080
CMD [ "demo-springboot.jar" ]