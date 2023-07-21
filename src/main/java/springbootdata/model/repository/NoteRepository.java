package springbootdata.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import springbootdata.model.entity.Note;

@Repository
public interface NoteRepository extends CrudRepository<Note, Long> {
}
