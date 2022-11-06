FROM gradle:7-jdk11-alpine AS build

COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon -x test

EXPOSE 8090

RUN ["ls", "/home/gradle/src/build/libs"]

ENTRYPOINT ["java","-jar","/home/gradle/src/build/libs/bea-0.0.1-SNAPSHOT.jar"]