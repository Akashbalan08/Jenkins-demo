pipeline {
    agent any
    stages {
        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/Akashbalan08/Jenkins-demo.git'
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
                sh 'python test.py'  // Run the Python script (optional)
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying application...'
                sh 'cp test.py /var/www/html/'  // Example deployment
            }
        }
    }
}

