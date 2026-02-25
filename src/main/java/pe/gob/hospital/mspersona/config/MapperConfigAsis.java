//
//package pe.gob.hospital.mspersona.config;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.autoconfigure.DataSourceProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//
//import javax.sql.DataSource;
//
//@Configuration
//@MapperScan(value = "pe.gob.hospital.mspersona.repository.mapper", sqlSessionFactoryRef = "sqlSessionFactoryAsis")
//public class MapperConfigAsis {
//
//    //@Value("${spring.datasource.timeout}")
//    private int tiempoDeConexion;
//
//    @Bean
//    @ConfigurationProperties("spring.datasource.asis")
//    public DataSourceProperties dataSourcePropertiesAsis() {
//        return new DataSourceProperties();
//    }
//
//    @Bean
//    public DataSource dataSourceAsis() {
//        return dataSourcePropertiesAsis().initializeDataSourceBuilder().build();
//    }
//
//    @Bean
//    public SqlSessionFactory sqlSessionFactoryAsis() throws Exception {
//        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//        factoryBean.setDataSource(dataSourceAsis());
//        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
//        configuration.setDefaultStatementTimeout(13);
//        factoryBean.setConfiguration(configuration);
//        return factoryBean.getObject();
//    }
//
//    @Bean( name = "transactionManagerAsis")
//    public DataSourceTransactionManager transactionManagerAsis() {
//        return new DataSourceTransactionManager(dataSourceAsis());
//    }
//}
