FROM openjdk:11-jre-stretch
VOLUME /tmp
EXPOSE 8090 8090
ADD ./build/libs/bea-0.0.1-SNAPSHOT.jar bea-0.0.1-SNAPSHOT.jar
ENTRYPOINT exec java $JAVA_OPTS -jar -Dspring.profiles.active=pdn /bea-0.0.1-SNAPSHOT.jar