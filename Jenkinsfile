pipeline {
    agent any

    parameters {
            string(name: 'Username', defaultValue: 'Vikram', description: 'Enter your username?')
    }

     environment {
            username = ${params.Username}
     }

    stages {
        stage('Compile') {
            steps {
                gradlew('clean', 'classes')
            }
        }
        stage('Unit Tests') {
            steps {
                gradlew('test')
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
                echo "Username ${params.Username}"
                echo "${env.Username}"

            }
        }

    }
    post {
        failure {
            mail to: 'vikramsingh001200@gmail.com', subject: 'Build failed', body: 'Please fix!'
        }
    }
}

def gradlew(String... args) {
    sh "./gradlew ${args.join(' ')} -s"
}