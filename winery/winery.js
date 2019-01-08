class Winery {
    constructor() {
        this.scripts = {
            build : {
                name : 'build',
                startText : 'Building java program',
                run: function (args) {
                    const shell = require('child_process').execSync;
                    shell('javac ' + args[1] + '/' + args[1] + '.java');
                    console.log(args[1]);
                }
            },
            newproject : {
                name : 'new',
                startText : 'Creating new java project',
                run: function (args) {
                    const shell = require('child_process').execSync;
                    shell('mkdir ./Projects/' + args[1]);
                    shell('cp -R ./winery/Functions ./Projects/' + args[1] + '/ ');
                    shell('cp ./winery/boilerplatejavafile.java ./Projects/' + args[1] + '/'+args[1]+'.java ');
                }
            },
        };
    }
    action(args) {
        if (args[0] === 'build') return this.scripts.build;
        if (args[0] === 'new') return this.scripts.newproject;
    }
}
module.exports = Winery;