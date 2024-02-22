# BoredApplication

This is a Shell application that fetches an activity from the Bored API (https://www.boredapi.com/).

## Commands
help - list of commands

get - fetches activity

## Parameters for get command
type - [education, recreational, social, diy, charity, cooking, relaxation, music, busywork]

participants - [0, n]

price - [0.0, 1.0]

accessibility - [0.0, 1.0]

## Example input
```bash
get --type music --participants 5 --price 0.1
```

Output: activity='Have a jam session with your friends', type='music', participants=5, price=0.1, link='', accessibility=0.3

## Usage
build the project in linux
```bash
./gradlew build
```

or build the project in windows
```bash
.\gradlew.bat build
```

execute with
```bash
java -jar build/libs/bored-0.0.1.jar
```
