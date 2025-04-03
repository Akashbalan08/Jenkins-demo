pipeline {
    agent any
    stages {
        stage('Clone Repository') {
            steps {
                git 'https://github.com/yourusername/jenkins-demo.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Building the application...'
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
                sh 'python test.py'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying application...'
                sh 'cp test.py /var/www/html/'
            }
        }
    }
}
