node{
    stage 'task1'
        checkout scm
    stage 'check-version'
        gradle '--version'
    stage 'test'
        gradle 'test'
    stage 'build'
        gradle 'build'
}

def gradle(args){
    bat "${tool 'Gradle'}\\bin\\gradle ${args}"
}