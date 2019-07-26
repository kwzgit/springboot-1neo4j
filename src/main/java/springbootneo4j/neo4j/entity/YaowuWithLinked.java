package springbootneo4j.neo4j.entity;

import org.neo4j.ogm.annotation.NodeEntity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NodeEntity
public class YaowuWithLinked {
    @Id
    @GeneratedValue
    private Long id;
    private String yaowuName;//药物名

    public YaowuWithLinked() {
    }

    public YaowuWithLinked(String yaowuName) {
        this.yaowuName = yaowuName;
    }

    public void setYaowuName(String yaowuName) {
        this.yaowuName = yaowuName;
    }

    public String getYaowuName() {
        return yaowuName;
    }
}
