FROM tomcat:8.0-alpine
LABEL maintainer="minh-quan.nguyen.external@airbus.com"

ADD target/base64-1.0.0.war /usr/local/tomcat/webapps/base64.war

EXPOSE 8080
CMD ["catalina.sh", "run"]
