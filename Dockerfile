FROM openjdk:11
COPY ./target/CLICalculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-cp","CLICalculator-1.0-SNAPSHOT-jar-with-dependencies.jar","org.example.Main"]
