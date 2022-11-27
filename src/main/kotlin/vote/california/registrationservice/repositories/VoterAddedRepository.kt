package vote.california.registrationservice.repositories

import org.springframework.data.mongodb.repository.MongoRepository
import vote.california.registrationservice.data.VoterAdded

interface VoterAddedRepository : MongoRepository<VoterAdded, String>