package miw.persistence.mongo.repositories;

import miw.persistence.mongo.documents.Demo;
import miw.persistence.mongo.documents.DemoDto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface DemoRepository extends MongoRepository<Demo, String> {

    @Query(value = "{code : ?0}", fields = "{reference : 1}")
    DemoDto findFieldsById(String code);

}
