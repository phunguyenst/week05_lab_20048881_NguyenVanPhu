import com.iuh.phu.se.repositories.CandidateRepository;
import jakarta.annotation.PostConstruct;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NguyenVanPhu20048881Week5ApplicationTests {
    @Autowired
    private CandidateRepository candidateRepository;

    @PostConstruct
    void create_10(){
        for (int i = 0; i < 10; i++) {

        }
    }
    @Test
    void contextLoads() {
    }

}
