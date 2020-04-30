# API Gateway 

### Features
- Interface between Client module and micrservices 
- All requests are sent to server via gateway 
- Mid layer that registers all the available microservices 
- Any changes in microservice must be taken care by the gateway and client shouldnt bother about it
- Provide security, auditing, routing for the the requests/response between cluent and microservice

### Disadvantages 
- Complexity 
- Latency 
- One pont failure (If it fails, client will completely fail)

## Working 

Steps to Configure 
- Create a project with zuul dependency 
- Create other microervices that will interact with this service 
- Specify the services path in zuul project properties/yaml file 
eg. 
```
server
  port: 8100
zuul:
  routes:
    doctor-service:
      url: http://localhost:8082
    disease-service:
      url: http://localhost:8081
    patient-service:
      url: http://localhost:8083
```
- Access the services through zuul
```
http://localhost:8100/{mapping}
```

## Types of Filters 
- Pre 
- Post 
- Error
- Route 
- Custom

## Working 
- Simply Create a class and extend Zuul Filter

## Attributes of Filter 
- Type 
- Execution Order
- Criteria 
- Action

## Order of Exection 
- Pre
- Route
- Actual Service
- Post
