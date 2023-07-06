def lintDockerfile() {
    echo 'Linting Dockerfile...'
    sh 'docker run --rm -i hadolint/hadolint'
}

def lintAngularCode() {
    echo 'Linting Angular code...'
    bat 'npm cache clean --force'
    bat 'npm install'
    bat 'npm run lint'
}
def runTest(){
    echo 'Test Angular application'
    bat 'ng test'
    echo 'Test completed'
}
def buildDockerImage() {
    sh 'docker build . -t artifactory.analog.com:8443/adi/see/hello-world-angular:1.0'
    echo 'Image built successfully'
}

def deployDockerCompose() {
    echo 'Starting docker-compose...'
    sh 'docker-compose up -d'
}

def sendEmailNotification(String message) {
    emailext body: "${message}",
             subject: "${message}",
             to: 'naveen.badisa@analog.com'
}
