SPRINT 2 -  README 

GUSTAVO NEGRI RM550311
GUILHERME BOLINA RM553309
LUCAS BONOMI RM98756


PARA RODAR A APLICAÇÃO : 
 
Rodar no terminal do backend o coding : ./mvnw spring-boot:run
(Deixei configurado p rodar java 17, 23 nao estava indo)

Para saber seu ip : ipconfig getifaddr en0

Para a api rodar por exemplo : 
http://192.168.0.91:8080/api/readings


Utilizei o comando seguinte para adicionar os sensores no terminal : 

curl -X POST http://192.168.15.104:8080/api/readings \
  -H "Content-Type: application/json" \
  -d '{"sensorId":"Sensor de Pressão","readingValue":42.0,"timestamp":"2025-06-11T15:45:00"}'

curl -X POST http://192.168.15.104:8080/api/readings \
  -H "Content-Type: application/json" \
  -d '{"sensorId":"Sensor de Fluxo","readingValue":35.7,"timestamp":"2025-06-11T11:46:00"}'

curl -X POST http://192.168.15.104:8080/api/readings \
  -H "Content-Type: application/json" \
  -d '{"sensorId":"Sensor de Vazão","readingValue":51.3,"timestamp":"2025-06-11T11:47:00"}'

curl -X POST http://192.168.15.104:8080/api/readings \
  -H "Content-Type: application/json" \
  -d '{"sensorId":"Sensor de Nível Pneumático","readingValue":22.1,"timestamp":"2025-06-11T11:48:00"}'

curl -X POST http://192.168.15.104:8080/api/readings \
  -H "Content-Type: application/json" \
  -d '{"sensorId":"Sensor de Temperatura do Ar Comprimido","readingValue":75.0,"timestamp":"2025-06-11T11:49:00"}'
