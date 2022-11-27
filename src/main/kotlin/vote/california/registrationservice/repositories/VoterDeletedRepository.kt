package vote.california.registrationservice.repositories

import org.springframework.data.mongodb.repository.MongoRepository
import vote.california.registrationservice.data.VoterDelete

interface VoterDeletedRepository : MongoRepository<VoterDelete, String>