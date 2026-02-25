FROM eclipse-temurin:17-jre-alpine

COPY target/ms-persona-1.0.0-SNAPSHOT.jar java-app.jar
COPY src/main/resources/reportes/complementos/*.ttf /usr/share/fonts/truetype/

RUN sed -i '/^jdk.tls.disabledAlgorithms/s/TLSv1,//' $JAVA_HOME/conf/security/java.security
RUN apk add --no-cache fontconfig ttf-dejavu freetype && fc-cache -f -v

ENTRYPOINT ["java","-jar","java-app.jar"]
