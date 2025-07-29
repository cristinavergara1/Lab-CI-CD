# Lab CI/CD 
#### Este repositorio contiene un laboratorio completo de integración y despliegue continuo (CI/CD) utilizando Spring Boot como framework de desarrollo y herramientas como GitHub Actions, SonarCloud, JaCoCo, Coveralls, Snyk, Docker y AWS (EC2).
[![DI/CD Pipeline](https://github.com/cristinavergara1/labcicd/actions/workflows/build.yml/badge.svg)](https://github.com/cristinavergara1/labcicd/actions/workflows/build.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=cristinavergara1_labcicd&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=cristinavergara1_labcicd)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=cristinavergara1_labcicd&metric=bugs)](https://sonarcloud.io/summary/new_code?id=cristinavergara1_labcicd)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=cristinavergara1_labcicd&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=cristinavergara1_labcicd)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=cristinavergara1_labcicd&metric=coverage)](https://sonarcloud.io/summary/new_code?id=cristinavergara1_labcicd)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=cristinavergara1_labcicd&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=cristinavergara1_labcicd)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=cristinavergara1_labcicd&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=cristinavergara1_labcicd)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=cristinavergara1_labcicd&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=cristinavergara1_labcicd)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=cristinavergara1_labcicd&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=cristinavergara1_labcicd)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=cristinavergara1_labcicd&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=cristinavergara1_labcicd)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=cristinavergara1_labcicd&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=cristinavergara1_labcicd)
[![Known Vulnerabilities](https://snyk.io/test/github/cristinavergara1/labcicd/badge.svg)](https://snyk.io/test/github/cristinavergara1/labcicd)
[![Coverage Status](https://coveralls.io/repos/github/cristinavergara1/labcicd/badge.svg?branch=03b13190b80a5ed94cfd9dc10dcc60cd5a247069)](https://coveralls.io/github/cristinavergara1/labcicd?branch=03b13190b80a5ed94cfd9dc10dcc60cd5a247069)



Implementation of a Simple App with the next operations:
* Get random nations
* Get random currencies
* Get random Aircraft
* Get application version
* health check
  Including integration with GitHub Actions, Sonarqube (SonarCloud), Coveralls and Snyk
### Folders Structure
In the folder `src` is located the main code of the app
In the folder `test` is located the unit tests
### How to install it
Execute:
```shell
$ mvnw spring-boot:run
```
to download the node dependencies
### How to test it
Execute:
```shell
$ mvnw clean install
```
### How to get coverage test
Execute:
```shell
$ mvwn -B package -DskipTests --file pom.xml
```
