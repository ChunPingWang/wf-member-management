### 安裝 SDKMAN
https://blog.miniasp.com/post/2022/09/17/Useful-tool-SDKMAN#google_vignette

### 透過 SDKMAN 安裝 JDK
```
sdk list java
sdk install java 21.0.6-ms
```

### 下載程式碼
```
git clone https://github.com/ChunPingWang/spring-boot-thymeleaf.git

cd spring-boot-thymeleaf
```

### 編譯與執行
```
# 執行方法 1
./mvnw clean package

ls -al target/serving-web-content-complete-0.0.1-SNAPSHOT.jar

java -jar target/serving-web-content-complete-0.0.1-SNAPSHOT.jar

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
### 查看測試程式碼 (src/test/java/com/example/servingwebcontent/ServingWebContentApplicationTest.java)
```gherkin
package com.example.servingwebcontent;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(controllers = GreetingController.class)
public class ServingWebContentApplicationTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void homePage() throws Exception {
		// N.B. jsoup can be useful for asserting HTML content
		mockMvc.perform(get("/index.html"))
				.andExpect(content().string(containsString("Get your greeting")));
	}

	@Test
	public void greeting() throws Exception {
		mockMvc.perform(get("/greeting"))
				.andExpect(content().string(containsString("Hello, World!")));
	}

	@Test
	public void greetingWithUser() throws Exception {
		mockMvc.perform(get("/greeting").param("name", "Greg"))
				.andExpect(content().string(containsString("Hello, Greg!")));
	}

}
```
### 查看程式碼 (src/main/java/com/example/servingwebcontent/GreetingController.java)
```gherkin
package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

}
```
### 查看 html(src/main/resources/static/index.html)
```gherkin
<!DOCTYPE HTML>
<html>
<head> 
    <title>Getting Started: Serving Web Content</title> 
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
    <p>Get your greeting <a href="/greeting">here</a></p>
</body>
</html>
```
### 查看 html + thymeleaf(src/main/resources/templates/greeting.html)
```gherkin
<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org"><!-- 這行設定 thymeleaf//-->
<head> 
    <title>Getting Started: Serving Web Content</title> 
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
    <p th:text="|Hello, ${name}!|" /> <!-- 這行使用 th 縮寫代表 thymeleaf//-->
</body>
</html>
```
