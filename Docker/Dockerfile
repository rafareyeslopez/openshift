FROM anapsix/alpine-java
VOLUME /tmp
ADD billingGuidChecker-0.0.1-SNAPSHOT.jar billingGuidChecker.jar
EXPOSE 8750
CMD ["java","-jar", "-Xmx64m", "billingGuidChecker.jar"]