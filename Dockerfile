FROM debian:stretch-slim

WORKDIR /home/apps/
ADD target/test04-0.0.1-SNAPSHOT.jar .
ADD target/lib ./lib
ADD start.sh .

ENTRYPOINT ["sh", "/home/apps/start.sh"]
