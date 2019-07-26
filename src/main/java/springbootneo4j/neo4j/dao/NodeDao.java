package springbootneo4j.neo4j.dao;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import springbootneo4j.neo4j.entity.FangjiWithLinked;

public interface NodeDao extends Neo4jRepository<FangjiWithLinked,Long> {
}
