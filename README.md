# TestesUnitarios

Repositório de estudos de testes unitários da disciplina de Técnicas de Testes no curso de Análise e Desenvolvimento de Sistemas. 


## Gerar relatórios HTML com o Maven

Adicionar o plugin do maven para gerar relatórios

```
<plugin>
    <groupId>org.apache.maven.plugins</groupId>
    <artifactId>maven-surefire-report-plugin</artifactId>
    <version>3.0.0-M5</version>

    <executions>
        <execution>
            <phase>test</phase>
            <goals>
                <goal>report</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```

Executar os testes unitários e o plugin SureFire-Report para gerar os relatórios html
```
mvn clean test
```

Adiciona recursos de website como imagens e css
```
mvn site -DgenerateReports=false
```
Não sobrescreve os relatórios HTML anteriores

O SureFire não gera relatórios se algum teste falhar, então vamos configurar para alterar isso

```
<configuration>
    <testFailureIgnore>true</testFailureIgnore>
</configuration>
```


## Cobertura de Código

A cobertura de código é uma métrica de software usada para medir quantas
linhas ou métodos do nosso código são executadas durante testes
automatizados. Essa métrica é representada em porcentagem, por exemplo, 50%,
70%, etc.

Quanto maior a cobertura, melhor!

```
<plugin>
    <groupId>org.jacoco</groupId>
    <artifactId>jacoco-maven-plugin</artifactId>
    <version>0.8.12</version>
    <executions>
        <execution>
            <id>jacoco-prepare</id>
            <goals>
                <goal>prepare-agent</goal>
            </goals>
        </execution>
        <execution>
            <id>jacoco-report</id>
            <phase>test</phase>
            <goals>
                <goal>report</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```

```
mvn clean test
```

target/site/jacoco/index.html