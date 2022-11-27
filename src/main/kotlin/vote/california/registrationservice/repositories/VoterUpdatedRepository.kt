package vote.california.registrationservice.repositories

import org.springframework.data.mongodb.repository.MongoRepository
import vote.california.registrationservice.data.VoterUpdate

interface VoterUpdatedRepository : MongoRepository<VoterUpdate, String>