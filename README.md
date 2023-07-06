## create docker image
- docker build . -t hello-world-angular:1.0

## Run docker image
- docker run -p 4200:80 hello-world-angular:1.0

## Deploy the image using Docker Compose
- docker-compose up

## Note:
- use bat instead of sh for windows os.
