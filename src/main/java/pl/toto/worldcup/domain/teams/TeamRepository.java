package pl.toto.worldcup.domain.teams;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface TeamRepository extends JpaRepository<TeamModel, Long> {

    List<TeamModel> findAll();
}
