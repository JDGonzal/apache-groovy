String currentDir = '../../../'

List hidden = []
new File(currentDir).eachFile {
    if(it.isDirectory()){
        // println it.name
    }
    if(it.isHidden()){
        hidden << it.name
    }
}
// print 'Hidden: '
// println hidden

new File(currentDir).eachDir {
    // println it
}

// Size of all directory
def groovyCourseDir = new File(currentDir)
println "${String.format("%.02f", groovyCourseDir.directorySize() / 1024 / 1024)} MB"

// Create New Directories
new File ('dir1').mkdir()
new File ('now/two/three').mkdirs()

// Delete a Directory
new File ('dir1').deleteDir()