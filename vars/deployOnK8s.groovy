withCredentials([file(credentialsId: 'kubeconfig', variable: 'KUBECONFIG')]) {
    sh '''
        export KUBECONFIG=$KUBECONFIG
        /usr/bin/kubectl apply -f k8s/
    '''
}
