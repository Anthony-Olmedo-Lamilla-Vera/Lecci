package crud.asistencia.Asistencia;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//Remove @RepositoryRestResource below to disable auto REST api:
@Repository
public interface RepositoryAsistence extends CrudRepository<AsistenciaDTO, Long> {

}
