node {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                checkout scm
                bat 'make' 
                archiveArtifacts artifacts: '**/*.java', fingerprint: true 
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
