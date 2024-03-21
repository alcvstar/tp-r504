#!/bin/bash

LOG_FILE="/var/log/debsecan.log"

debsecan --update >> "$LOG_FILE" 2>&1
debsecan --quiet --output-format=pretty >> "$LOG_FILE" 2>&1

if [ $? -eq 0 ]; then
    echo "$(date): La recherche de vulnérabilités avec debsecan a été exécutée avec succès." >> "$LOG_FILE"
else
    echo "$(date): Erreur lors de l'exécution de la recherche de vulnérabilités avec debsecan." >> "$LOG_FILE"
fi

echo "$(date): Script debsecan terminé." >> "$LOG_FILE"
