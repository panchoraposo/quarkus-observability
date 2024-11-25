
# Quarkus Observability

  
## Create namespace
`oc new-project quarkus-observability`

## Deploy on OpenShift
`cd quarkus-otlp`
`mvn clean package -Dquarkus.kubernetes.deploy=true`

  
## Monitoring stack

### OpenTelemetry Collector + Prometheus + Jaeger

Install operators:
 - Red Hat OpenShift distributed tracing platform --> Deploy jaeger-all-in-one-memory.
 - Red Hat build of OpenTelemetry --> Deploy otel-collector:
	`oc apply -f otlp/otel-collector.yaml`

## LokiStack
Note: S3 storage and secret must be configured previously.

Install operators:

 - Red Hat OpenShift Logging --> Create ClusterLogging:
	`oc apply -f logging/cluster-logging.yaml`

- Loki Operator --> Create LokiStack:
  `oc apply -f logging/lokistack.yaml`

## Tekton Pipeline + Github trigger
Trigger
