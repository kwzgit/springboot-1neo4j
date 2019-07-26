package springbootneo4j.neo4j.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 方剂,方剂里包含药物
 */
@NodeEntity
public class FangjiWithLinked {
    @Id
    @GeneratedValue
    private Long id;
    private String fangjiName;//方剂名称

    @JsonIgnoreProperties("fangjiWithLinked")
    @Relationship(type = "contion",direction = Relationship.OUTGOING)
    private List<YaowuWithLinked> yaowuWithLinkeds;

    public FangjiWithLinked() {
    }

    public void setFangjiName(String fangjiName) {
        this.fangjiName = fangjiName;
    }

    public String getFangjiName() {
        return fangjiName;
    }

    public List<YaowuWithLinked> getYaowuWithLinkeds() {
        return yaowuWithLinkeds;
    }

    public FangjiWithLinked(String fangjiName) {
        this.fangjiName = fangjiName;
    }

    public void addYaowuWithLinked(YaowuWithLinked... yaowu) {//快速添加药物节点的方法
        if (this.yaowuWithLinkeds == null) {
            this.yaowuWithLinkeds = new LinkedList<>();
        }
        this.yaowuWithLinkeds.addAll(Arrays.asList(yaowu));
    }

}

