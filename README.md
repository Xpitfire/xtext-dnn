# Visual Studio Code Extension based on Xtext for Deep Learning DSL

This is a Deep Learning Script integration for Visual Studio Code based on Xtext grammar using the Language Server Protocol for communication.

[![Build Status](https://travis-ci.org/Xpitfire/xtext-dnn.svg?branch=master)](https://travis-ci.org/Xpitfire/xtext-dnn)

[![Join the chat at https://gitter.im/xtext-dnn/Lobby](https://badges.gitter.im/Join%20Chat.svg)](https://gitter.im/xtext-dnn/Lobby?utm_source=share-link&utm_medium=link&utm_campaign=share-link)

## [Doumentation](doc/README.md) 

## Quickstart

Requires Visual Studio Code (VS Code) with version 1.4.0 or greater to be on the path as `code` and Java 8+ available as `java`.

- Run `./gradlew startCode`

This will start VS Code and after a few seconds load the `demo` folder of this repository.

## Building in Details

1. Make sure that `java -version` is executable and pointing to a Java 8+ JDK.
2. Type `code`. If the command is not known, open VS Code and select *View / Command Palette*. Enter `code` and select to install `code` on the path.
1. Run `./gradlew startCode` to build the DSL and the VS Code extensions.

### Scenario 1 (embedded server)

1. Install the self-contained extension into VS Code using
    `code --install-extension vscode-extension-self-contained/build/vscode/vscode-extension-self-contained-0.0.1.vsix`
2. Run a second instance of vscode on the demo folder `code demo`

### Scenario 2 (client-only with separate server process)

1. Run `./gradlew run` or launch RunServer from Eclipse.
2. Open `vscode-extension` in VS Code and `F5` to launch new editor (you may need a Debug -> Start Debugging initally).
1. Open folder `demo` in the new editor.


### Build VS Code Extension Package manually (manually Gradle)

```
npm install -g vsce
cd vscode-extension
vsce package
cd ../vscode-extension-self-contained
vsce package
```
