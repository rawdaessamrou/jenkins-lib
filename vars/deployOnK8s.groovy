def call(String kubeConfigCredId) {
    echo "--- Deploying to Kubernetes ---"
    withCredentials([file(credentialsId: kubeConfigCredId, variable: 'KUBECONFIG')]) {
        sh "kubectl --kubeconfig=${KUBECONFIG} apply -f k8s/"
    }
}
