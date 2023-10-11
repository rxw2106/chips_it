package com.chips.it.codegen;

import com.mybatisflex.codegen.Generator;
import com.mybatisflex.codegen.config.GlobalConfig;
import com.zaxxer.hikari.HikariDataSource;

public class Codegen {
    public static void main(String[] args) {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl("jdbc:mysql://106.13.9.168:3314/chips_it?characterEncoding=utf-8");
        dataSource.setUsername("root");
        dataSource.setPassword("rena061498.");

        GlobalConfig globalConfig = new GlobalConfig();

        globalConfig.setBasePackage("com.chips.it");

        globalConfig.setTablePrefix("t_");
        globalConfig.setGenerateTable("t_user");

        globalConfig.getPackageConfig().setSourceDir("/Users/renxingwei/IdeaProjects/chips_it/chips-admin/src/main/java")
                        .setMapperXmlPath("/Users/renxingwei/IdeaProjects/chips_it/chips-admin/src/main/resources/mapper");
        globalConfig.enableEntity().setWithLombok(true).setOverwriteEnable(true);
        globalConfig.setMapperGenerateEnable(true);
        globalConfig.enableService();
        globalConfig.enableServiceImpl();
        globalConfig.enableController();
        globalConfig.enableMapperXml();

        Generator generator = new Generator(dataSource, globalConfig);
        generator.generate();
    }
}
