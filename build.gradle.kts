plugins {
	java
	id("org.springframework.boot") version "3.4.3"
	id("io.spring.dependency-management") version "1.1.7"
}

group = "com.Api_DB_Floristeria_Amistad"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-web")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")

	implementation("org.postgresql:postgresql:42.7.1")
	implementation("com.zaxxer:HikariCP:5.1.0")

	//Para trabajar con mapstruct se implementa lo siguiente
	implementation ("org.mapstruct:mapstruct:1.6.3")
	annotationProcessor ("org.mapstruct:mapstruct-processor:1.6.3")
	

}

configurations{
	runtimeClasspath {
		extendsFrom(configurations.implementation.get())
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
