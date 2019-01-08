# Wine for ICS Java - Specifically UH classes
A wine package for managing your ICS Java projects and files.

Note: Make sure you have `alias wine="node wine"` set in your bash profile. Otherwise, you will have to run `$ node wine` for every command.
# Installation

* Install wine. Instructions at https://grape-juice.org.
* `wine inst ics-java-wine`
* `wine plant`
* Set your `"wineryfile"` to `"./winery/winery.js"` in your `wine.json`.
```json 
{
  "wine" : {
    "wineryfile" : "./winery/winery.js"
  }
}
```

# Usage

### Creating new project
```bash
$ wine new <project-name>
```

### Running your Project
```bash
$ wine run <project-name>
```
This build and run your project.

### Packaging your Project
```bash
$ wine package <project-name>
```
This will create a zip file with the java files inside, ready to turn in.



#### Compiling and Running your Projects Separately
### Building your Project
```bash
$ wine build <project-name>
```
This will compile your project into a .class file.

### Running your Compiled Project
```bash
$ wine runbuild <project-name>
```
This will run your compiled project

