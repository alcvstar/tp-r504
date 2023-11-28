#!/bin/bash

for ((i=1; i<=500; i++)); do
    if ((i % 2 == 0)); then
        response=$(curl -s http://localhost:83)

        if [[ $response == *"<h1>Hello 2</h1>"* ]]; then
            echo "Requête $i: Réponse de nginx2"
        else
            echo "Requête $i: Pas de réponse"
        fi
    else
        response=$(curl -s http://localhost:83)

        if [[ $response == *"<h1>Hello 1</h1>"* ]]; then
            echo "Requête $i: Réponse de nginx1"
        else
            echo "Requête $i: Pas de réponse"
        fi
    fi
done

