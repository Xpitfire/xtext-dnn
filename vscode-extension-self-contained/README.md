# Xtext VS Code example

This is a simple example showing the [Xtext](https://www.eclipse.org/Xtext/) integration for VS Code based on the Microsoft [Language Server Protocol](https://github.com/Microsoft/language-server-protocol).


A typical example model would look like (Open a new folder in VSCode and create the files)

demo.dls
```
network "TestNet" {
	epochs = 10
	batch-size = 50
	image-size = 28
    image-channels = 1
    output-labels = 10
    caffe-path = "$CAFFE_HOME"
    output-path = "/media/xpitfire/data/temp"

	updater -> sgd
	learningRate = 0.003

	conv (name:"conv1" in:data out:16) { 
		kernel-size = 6, 
		stride = 2
	}
    conv (name: "conv2" out:16) {
        kernel-size = 3,
        stride = 1
    }

	conv (name:"c2" out:7)  { kernel-size = 3, stride = 1 }
	pool (name: "p1" out:3) { type -> MAX, stride = 1 }

	dense [(name:"d1" in:"p1" out:1024), (name:"d2" in:"d1" out:512), (name:"d3" in:"d2" out:256)] {
        activation -> Sigmoid
        biasInit -> constant
    }
	dense (name:final-layer out:labels) { activation -> ReLU, biasInit -> constant }
}
```

The Xtext integration supports typical Xtext and Language Server features like

* Syntax Highlighting
* Validation
* Goto Definition / Find References
* Hover
* Formatting
* Mark Occurrences
* Open Symbol

A introductory article can be found [here](https://blogs.itemis.com/en/integrating-xtext-language-support-in-visual-studio-code)
