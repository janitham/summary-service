package vote.california.registrationservice.data

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document("deleted")
data class VoterDelete(
    @Id
    var id: String? = null,
    val deletedDate: LocalDateTime = LocalDateTime.now(),
)