From openjdk:20
copy ./target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]

