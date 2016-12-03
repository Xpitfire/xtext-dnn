'use strict';
const path = require('path');
const vscode_jsonrpc_1 = require('vscode-jsonrpc');
const vscode_1 = require('vscode');
const vscode_languageclient_1 = require('vscode-languageclient');
function activate(context) {
    // The server is a locally installed in src/mydsl
    let script = context.asAbsolutePath(path.join('src', 'mydsl', 'bin', 'mydsl-standalone'));
    let serverOptions = {
        run: { command: script },
        debug: { command: script, args: ['-Xdebug', '-Xrunjdwp:server=y,transport=dt_socket,address=8000,suspend=n,quiet=y', '-Xmx256m'] }
    };
    let clientOptions = {
        documentSelector: ['mydsl'],
        synchronize: {
            fileEvents: vscode_1.workspace.createFileSystemWatcher('**/*.*')
        }
    };
    // Create the language client and start the client.
    let lc = new vscode_languageclient_1.LanguageClient('Xtext Server', serverOptions, clientOptions);
    // enable tracing (.Off, .Messages, Verbose)
    lc.trace = vscode_jsonrpc_1.Trace.Verbose;
    let disposable = lc.start();
    // Push the disposable to the context's subscriptions so that the 
    // client can be deactivated on extension deactivation
    context.subscriptions.push(disposable);
}
exports.activate = activate;
