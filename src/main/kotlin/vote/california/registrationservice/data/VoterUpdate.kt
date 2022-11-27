package vote.california.registrationservice.data

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document("updated")
data class VoterUpdate(
    @Id
    var id: String? = null,
    val updatedDate: LocalDateTime = LocalDateTime.now(),
)