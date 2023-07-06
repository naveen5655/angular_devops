@Library('jenkins_shared_lib') _ 
pipeline {
    agent any
    
    stages {
        stage('Lint Dockerfile') {
            steps {
                script {
                    sharedLib.lintDockerfile()
                }
            }
        }
        
        stage('Lint Angular Code') {
            steps {
                script {
                    sharedLib.lintAngularCode()
                }
            }
        }
        
        // stage('Run Test') {
        //     steps {
        //         script {
        //             sharedLib.runTest()
        //         }
        //     }
        // }
        


        stage('Build Docker image') {
            steps {
                script {
                    sharedLib.buildDockerImage()
                }
            }
        }

        stage('Deploy Docker image using docker-compose') {
            steps {
                script {
                    sharedLib.deployDockerCompose()
                }
            }
        }

        stage('Send Notifications') {
            steps {
                script {
                    sharedLib.sendEmailNotification('Pipeline completed successfully')
                }
            }
        }
    }
}
