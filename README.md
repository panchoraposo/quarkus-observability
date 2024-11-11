# Quarkus & OpenTelemetry

## Create namespace
``oc new-project quarkus-observability``

## Deploy on OpenShift
``oc apply -f https://raw.githubusercontent.com/quarkusio/quarkus-super-heroes/main/deploy/k8s/java17-openshift.yml``

## Monitoring stack
### OpenTelemetry Collector + Prometheus + Jaeger
``oc apply -f https://raw.githubusercontent.com/quarkusio/quarkus-super-heroes/main/deploy/k8s/monitoring-openshift.yml``

### Grafana (Community operator)
``oc create -n grafana -f grafana/operator-deploy.yaml``