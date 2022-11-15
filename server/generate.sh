#!/bin/bash

openapi-generator-cli generate \
        -g spring \
        --library spring-boot \
        -i address-service.openapi.yaml
        -o ${PWD} \
        -p groupId=de.jonnef \
        -p artifactId=address \
        -p artifactVersion=1.0.0 \
        \
        -p sourceFolder=src/main/gen \
        \
        -p dateLibrary=java18
        -p java18=true