# Use uma imagem do Java 11 com maven
FROM maven:3.6.3-jdk-11

# Define o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia o arquivo pom.xml para o contêiner
COPY pom.xml .

COPY mvnw ./
COPY .mvn ./.mvn
COPY system.properties ./

# Copia todos os arquivos do diretório src para o contêiner
COPY src ./src

RUN chmod +x mvnw
# Executa o comando 'mvn package' para compilar a aplicação e criar um pacote JAR
RUN mvn package

# Expõe a porta em que a aplicação vai rodar (de acordo com sua configuração)
EXPOSE 8081

RUN chmod +x mvnw
RUN ./mvnw package -Dmaven.test.skip

# Define o comando a ser executado quando o contêiner for iniciado
CMD ["java", "-jar", "target/sostool-backend-0.0.1-SNAPSHOT.jar"]