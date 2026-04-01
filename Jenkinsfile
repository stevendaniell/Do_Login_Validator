pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        
        stage('Build & Test') {
            steps {
                sh 'mvn clean package'
            }
        }
        
        stage('Results') {
            steps {
                archiveArtifacts 'target/*.jar'
                junit 'target/surefire-reports/*.xml'
            }
        }
    }
}
