## Installation
Tested with:
- OpenShift Logging 5.9.7
- Loki Operator 6.0.0

1. Create bucket S3
2. Create policy
3. Create user and attach the policy. Retrieve access keys and edit secret-s3.yaml
4. Install Red Hat OpenShift Logging Operator
5. Create secret
6. Install Loki Operator
7. Create LokiStack
8. Create ClusterLogging