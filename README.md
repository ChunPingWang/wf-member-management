### 安裝 SDKMAN
https://blog.miniasp.com/post/2022/09/17/Useful-tool-SDKMAN#google_vignette

### 透過 SDKMAN 安裝 JDK
```
sdk list java
sdk install java 21.0.6-ms
```

### 下載程式碼
```
git clone https://github.com/ChunPingWang/wf-member-management.git

cd wf-member-management
```

### 編譯與執行
```
# 執行方法 1
./mvnw clean package

ls -al target/wf192-member-management-0.0.1-SNAPSHOT.jar

java -jar target/wf192-member-management-0.0.1-SNAPSHOT.jar

# 執行方法 2
./mvnw spring-boot:run

# 結束方式
control鍵 + c
```
### 透過瀏覽器查看
```
http://localhost:8080/

http://localhost:8080/greeting

```
### 透過 curl
#### Get
```
curl -X GET localhost:8080
# 或
curl localhost:8080

curl -X GET localhost:8080/greeting
# 或
curl localhost:8080/greeting
```

