# Java 21 runtime pin and upgrade instructions

This repository targets Java 21 (LTS). The repository contains a `.java-version` file with `21` to help environment managers (e.g. `jenv`, `asdf`, `jabba`) detect the desired runtime.

If you need to install or switch to Java 21 locally, here are recommended ways to do it on macOS.

1) SDKMAN (recommended for Java developers)

- Install SDKMAN (if not installed):

```bash
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
```

- List available Java versions and find a Java 21 distribution id:

```bash
sdk list java
# then look for an identifier that includes '21' and your preferred vendor
```

- Install and set Java 21 (replace `<id>` with the chosen id from `sdk list java`):

```bash
sdk install java <id>
sdk default java <id>
```

2) Homebrew / Homebrew Casks

- Install a Temurin (Eclipse Adoptium) build via Homebrew cask (this typically installs a recent JDK; check the version after install):

```bash
brew install --cask temurin
java -version
```

If that installs an older JDK, you can search for specific casks or use SDKMAN for finer control.

3) asdf (if you manage multiple runtimes with `asdf`)

```bash
asdf plugin add java https://github.com/halcyon/asdf-java.git
asdf list-all java | grep "21\."
asdf install java <version>
asdf global java <version>
```

Verification

```bash
java -version
javac --release 21 RockPaperScissors.java
```

Repo additions
- `.java-version` — pins Java major version `21` for environment tools.
- `scripts/install-java21.sh` — helper script with quick install logic (SDKMAN or Homebrew guidance).

If you'd like, I can also: add a `pom.xml` or `build.gradle` with a toolchain configuration targeting Java 21, or attempt to run `javac --release 21` here to validate compilation. Which would you prefer next?
