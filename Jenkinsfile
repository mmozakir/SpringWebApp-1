pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Hi') {
            steps {
                echo 'Hi World'
            }
        }
        stage('Bye') {
            steps {
                echo 'Bye World'
            }
        }
    }
    post {
        always {
           emailext body: 'Failure/Success', subject: 'Jenkins Status', to: 'ahmed.mozakir@gmail.com'
        }
    }
}
