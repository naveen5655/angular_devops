## create docker image
- docker build . -t artifactory.analog.com:8443/adi/see/hello-world-angular:1.0

## Run docker image
- docker run -p 4200:80 artifactory.analog.com:8443/adi/see/hello-world-angular:1.0

## Deploy the image using Docker Compose
- docker-compose up

## Note:
- use bat instead of sh for windows os.
