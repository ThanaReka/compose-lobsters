#!/usr/bin/env bash

set -euo pipefail

ENCRYPT_KEY="${1:-}"

declare -A SECRETS
SECRETS[secrets/keystore.cipher]=keystore.jks
SECRETS[secrets/props.cipher]=keystore.properties

if [[ -n "$ENCRYPT_KEY" ]]; then
    for src in "${!SECRETS[@]}"; do
      openssl enc -aes-256-cbc -md sha256 -pbkdf2 -d -in "${src}" -out "${SECRETS[${src}]}" -k "${ENCRYPT_KEY}"
    done
else
    echo "Usage: ./signing-setup.sh <encryption key>"
fi
