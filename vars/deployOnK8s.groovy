stage('Checkout') {
    steps {
        checkout scm
    }
}

stage('DeployOnK8s') {
    steps {
        withCredentials([file(credentialsId: 'kubeconfig', variable: 'KUBECONFIG')]) {
            sh '''
                export KUBECONFIG=$KUBECONFIG
                ls -la
                kubectl apply -f deployment.yaml
            '''
        }
    }
}
