package vote.california.registrationservice.data

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document("added")
data class VoterAdded(
    @Id
    var id: String? = null,
    val addedDate: LocalDateTime = LocalDateTime.now(),
)