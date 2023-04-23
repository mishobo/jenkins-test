pipeline {
    agent any
    stages{
        stage('Init'){
            steps{
                echo 'Hey, this is Abdallah'
                echo 'We are starting the test'
            }
        }
        stage('Build'){
            steps{
                echo 'Building Sample Maven Project'
            }
        }
        stage('Deploy'){
            steps{
                echo 'Deploying in staging area'
            }
        }
        stage('Deploy Production'){
           steps{
                echo 'Deploying in production area'
           }
        }
    }
}