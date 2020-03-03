FROM tomcat:8.0-alpine
LABEL maintainer="minh-quan.nguyen.external@airbus.com"

ADD target/hello-after-1.0.0.war /usr/local/tomcat/webapps/hello-after.war

EXPOSE 8080
CMD ["catalina.sh", "run"]
