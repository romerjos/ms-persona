package pe.gob.hospital.mspersona;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages = "pe.gob.hospital")
@MapperScan(basePackages = "pe.gob.hospital.mspersona.repository.mapper")
@EnableTransactionManagement
public class MsPersonaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsPersonaApplication.class, args);
	}

}
