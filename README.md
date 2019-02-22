# SpringConfClient
需先啟動 Eureka Server 與 Config Server
使用actuator 達到 POST refresh
curl -X POST http://<conf-client>:<port>/actuator/refresh
