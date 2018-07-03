FROM openjdk:8
EXPOSE 8181:8180
ADD /target/ProductCatalogue-WallMart.jar ProductCatalogue.jar
ENTRYPOINT ["java","-jar","ProductCatalogue.jar"] 