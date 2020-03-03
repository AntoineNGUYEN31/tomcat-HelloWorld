mvn clean install
docker build -t tomcatapp .
docker run -p 80:8080 tomcatapp
curl http://localhost/hello-after/
