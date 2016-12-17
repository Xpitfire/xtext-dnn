# Xtext VS Code example

This is a simple example showing the [Xtext](https://www.eclipse.org/Xtext/) integration for VS Code based on the Microsoft [Language Server Protocol](https://github.com/Microsoft/language-server-protocol).


A typical example model would look like (Open a new folder in VSCode and create the files)

demo.dls
```
network "TestNet" {
	epochs = 10
	batchSize = 50
	imageSize = 28
	imageChannels = 1
	outputLabels = 10
	caffePath = "$CAFFE_HOME"
	outputPath = "/media/xpitfire/data/temp"

	updater -> sgd
	learningRate = 0.003

	conv (name:"conv1" in:data out:16) { 
		kernelSize = 6, 
		stride = 2
	}
	conv (name:"conv2" out:16) {
		kernelSize = 3,
		stride = 1
	}

	conv (name:"c2" out:7) { kernelSize = 3, stride = 1 }
	pool (name:"p1" out:3) { type -> MAX, stride = 1 }

	dense [(name:"d1" in:"p1" out:1024), (name:"d2" in:"d1" out:512), (name:"d3" in:"d2" out:256)] {
		activation -> Sigmoid
		biasInit -> constant
	}
	dense (name:finalLayer out:labels) { activation -> ReLU, biasInit -> constant }
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
