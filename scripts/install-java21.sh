#!/usr/bin/env zsh
# Simple helper to guide installing Java 21 on macOS.

set -euo pipefail

echo "Checking for SDKMAN..."
if [ -s "$HOME/.sdkman/bin/sdkman-init.sh" ]; then
  echo "SDKMAN found. Listing available Java 21 releases (you will need to pick an id):"
  source "$HOME/.sdkman/bin/sdkman-init.sh"
  sdk list java | grep -E "21\." || true
  echo "\nTo install a specific Java 21 distribution run:"
  echo "  sdk install java <identifier>"
  echo "  sdk default java <identifier>"
  exit 0
fi

if command -v brew >/dev/null 2>&1; then
  echo "SDKMAN not found. Homebrew is available — attempting to install Temurin (may install latest JDK)."
  echo "You may need to enter your password for cask install."
  brew install --cask temurin || {
    echo "Homebrew install failed or Temurin cask unavailable; please install Java 21 manually or use SDKMAN." >&2
    exit 2
  }
  echo "Installation finished. Verify with: java -version"
  exit 0
fi

echo "No automatic tool found (SDKMAN or Homebrew). Please install Java 21 manually."
echo "Suggested options:"
echo "  - Install SDKMAN: curl -s \"https://get.sdkman.io\" | bash" 
echo "  - Or download a Java 21 JDK from https://adoptium.net or your preferred vendor and install it." 
exit 3
