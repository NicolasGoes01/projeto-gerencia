FROM node:alpine

WORKDIR /sostool-frontend

COPY *.json ./
COPY karma.conf.js ./

EXPOSE 4200

RUN npm i
RUN npm install -g @angular/cli

CMD ["ng", "serve"]