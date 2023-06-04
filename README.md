# Sanctions list

Experimental application build on compose + kotlin for all platforms.

## Technical Specs

**Architecture**:
- MVI, self-extended variant
- Clean with multi module project with repository/domain/presentation split.

**Presentation**:

- Compose
- Material 3

**Dependency**:

- Injection: Direct Manual Injection.

**Navigation**:

- Voyager

**Network**:

- Ktor
- Kamel

**Local Storage**:

- N/A (no local data is used)

**Resources**:

- TODO:

**Build**:

- Gradle on build-convention via composite build.

**Tooling**:

- ktlint
- detekt
- ben manes version

**CI/CD**:

- TODO:

**Testing**:

- Unit testing:
    - kotlin-test
- UI testing:
    - espresso

## Structure

#### Data
[DataResult](data/src/commonMain/kotlin/com/github/rasskazovalexey/sanction/data/model/DataResult.kt)
is taken from my previous project.

## Running instructions

#### Generic:

Make sure that either project JDK is set to JDK 17+ if you want to run project via IDEA.
If you want to run project via command line setup JAVA_HOME is set up to JDK 17+.

