#!/bin/bash
sudo apt update -y && sudo apt upgrade -y
sudo debsecan --suite bullseye | wc -l && sudo debsecan --suite bullseye --only-fixed | wc -l