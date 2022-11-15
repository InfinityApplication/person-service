#!/bin/bash

openapi-generator-cli generate \
        -g spring \
        --library spring-boot \
        -i person-service.openapi.yaml
        -o ${PWD} \
        -p groupId=de.jonnef \
        -p artifactId=person \
        -p artifactVersion=1.0.0 \
        \
        -p sourceFolder=src/main/gen \
        \
        -p dateLibrary=java18
        -p java18=true