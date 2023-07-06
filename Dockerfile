#Stage1
FROM node:18.16.0-alpine as build
WORKDIR /app
COPY . .
RUN npm install && \
    npm install -g @angular/cli && \
    ng build


#Stage2
FROM nginx:alpine
COPY --from=build /app/dist/hello-world /usr/share/nginx/html
