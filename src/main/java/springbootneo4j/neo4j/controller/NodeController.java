package springbootneo4j.neo4j.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springbootneo4j.neo4j.dao.NodeDao;
import springbootneo4j.neo4j.entity.FangjiWithLinked;
import springbootneo4j.neo4j.entity.YaowuWithLinked;
@RestController
public class NodeController {
    @Autowired
    private NodeDao nodeDao;
    @RequestMapping("/node/insert")
     public void insertNewNode(){
        FangjiWithLinked fangjiWithLinked = new FangjiWithLinked("四君子汤");
        YaowuWithLinked ss = new YaowuWithLinked("人参");
        YaowuWithLinked dd = new YaowuWithLinked("白术");
        YaowuWithLinked ff = new YaowuWithLinked("茯苓");
        YaowuWithLinked gg = new YaowuWithLinked("甘草");
        YaowuWithLinked hh = new YaowuWithLinked("王八");
        fangjiWithLinked.addYaowuWithLinked(ss,dd,ff,gg,hh);
        nodeDao.save(fangjiWithLinked);
    }
}
