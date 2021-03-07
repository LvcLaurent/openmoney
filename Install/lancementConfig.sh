#!/bin/bash

# -------------------------------------------------
# PARTIE A EDITER :
# -------------------------------------------------



SCREEN_OPENMONEY="openMoney" # nom utilisé pour le screen
NAME_OPENMONEY="OpenMoney" # nom du serveur, uniquement pour l'affichage des messages
COMMAND_OPENMONEY="/home/laurent/openMoney/lancementApp.sh" # commande de lancement du serveur



if ! screen -list | grep -q "SCREEN_POSITION"
  then
	echo "Starting server [$NAME_POSITION]"
	screen -dmS $SCREEN_POSITION $COMMAND_POSITION
  else
	echo "Server [$NAME_POSITION] is already running"
fi

exit 0